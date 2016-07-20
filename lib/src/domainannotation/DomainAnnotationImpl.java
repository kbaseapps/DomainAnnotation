package domainannotation;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import java.util.zip.*;
import java.net.URL;
import java.text.SimpleDateFormat;

import us.kbase.auth.AuthService;
import us.kbase.auth.AuthToken;
import us.kbase.common.service.*;
import us.kbase.workspace.*;
import us.kbase.shock.client.*;
import us.kbase.kbasegenomes.*;
import us.kbase.kbasereport.*;
import us.kbase.kbasecollections.*;
import us.kbase.common.utils.FastaWriter;

import com.fasterxml.jackson.databind.*;

import org.strbio.IO;
import org.strbio.io.*;
import org.strbio.util.*;

import static java.lang.ProcessBuilder.Redirect;

/**
   This class runs a domain search against a single genome, using
   RPS-BLAST and HMMER.  Domain hits are saved in DomainAnnotation
   workspace objects.
*/
public class DomainAnnotationImpl {
    private static String MAX_BLAST_EVALUE = "1e-04";
    
    public static final String domainAnnotationWsType = "KBaseGeneFamilies.DomainAnnotation";
    public static final String domainAlignmentsWsType = "KBaseGeneFamilies.DomainAlignments";
    
    /**
       creates a workspace client; if token is null, client can
       only read public workspaces.
    */
    public static WorkspaceClient createWsClient(String wsURL,
                                                 AuthToken token) throws Exception {
        WorkspaceClient rv = null;

        if (token==null)
            rv = new WorkspaceClient(new URL(wsURL));
        else
            rv = new WorkspaceClient(new URL(wsURL),token);
        rv.setAuthAllowedForHttp(true);
        return rv;
    }

    /**
       helper function to get the reference back when saving an object
    */
    public static String getRefFromObjectInfo(Tuple11<Long, String, String, String, Long, String, Long, String, String, Long, Map<String,String>> info) {
        return info.getE7() + "/" + info.getE1() + "/" + info.getE5();
    }
    
    /**
       store a file in Shock; returns handle.
       If file doesn't exist or can't be read, returns null.
    */
    public static Handle toShock(String shockURL,
                                 AuthToken token,
                                 File f) throws Exception {
        if (!f.canRead())
            return null;
        
        Handle rv = new Handle()
            .withFileName(f.getName());
        
        BasicShockClient shockClient = new BasicShockClient(new URL(shockURL), token);
        InputStream is = new BufferedInputStream(new FileInputStream(f));
        ShockNode sn = shockClient.addNode(is,f.getName(),null);
        is.close();
        String shockNodeID = sn.getId().getId();
        rv.setShockId(shockNodeID);
        return rv;
    }

    /**
       Load a file from Shock; returns File, or null if file couldn't be read.
       If the file from Shock is 0-length, it is deleted and null is returned.
    */
    public static File fromShock(Handle h,
                                 String shockUrl,
                                 AuthToken token,
                                 File f,
                                 boolean gzip) throws Exception {

        System.err.println("shock cmd equivalent to "+"/usr/bin/curl -k -X GET "+shockUrl+" -H \"Authorization: OAuth "+token.toString()+"\""+(gzip ? "| /bin/gzip" : ""));
        
        BasicShockClient shockClient = new BasicShockClient(new URL(shockUrl), token);
        ShockNode sn = shockClient.getNode(new ShockNodeId(h.getShockId()));
        OutputStream os = new FileOutputStream(f);
        if (gzip)
            os = new GZIPOutputStream(os);

        shockClient.getFile(sn,os);

        if (f.length()==0)
            f.delete();

        if (!f.canRead())
            return null;
        
        return f;
    }

    /**
       Make a provenance object
    */
    public static List<ProvenanceAction> makeProvenance(String description,
                                                        String methodName,
                                                        List<UObject> methodParams) throws Exception {
        // to get service version:
        DomainAnnotationServer server = new DomainAnnotationServer();
        
        return new ArrayList<ProvenanceAction>
            (Arrays.asList(new ProvenanceAction()
                           .withDescription(description)
                           .withService("DomainAnnotation")
                           .withServiceVer(server.version(null))
                           .withMethod(methodName)
                           .withMethodParams(methodParams)));
    }

    /**
       Make and save Report object, returning its name and reference
    */
    public static String[] makeReport(WorkspaceClient wc,
                                      String ws,
                                      String reportText,
                                      List<String> warnings,
                                      List<WorkspaceObject> objects,
                                      List<ProvenanceAction> provenance) throws Exception {
        String reportName = "domainannotation_report_"+UUID.randomUUID().toString();
        Report report = new Report()
            .withTextMessage(reportText)
            .withWarnings(warnings)
            .withObjectsCreated(objects);

        ObjectSaveData reportData = new ObjectSaveData()
            .withType("KBaseReport.Report")
            .withData(new UObject(report))
            .withName(reportName)
            .withHidden(1L)
            .withProvenance(provenance);
        String reportRef = getRefFromObjectInfo(wc.saveObjects(new SaveObjectsParams().withWorkspace(ws).withObjects(Arrays.asList(reportData))).get(0));
        return new String[] { reportName, reportRef };
    }

    /**
       save mapped reads to workspace, with provenance.
       returns ref
    */
    public static String saveDomainAnnotation(WorkspaceClient wc,
                                              String ws,
                                              String id,
                                              DomainAnnotation da,
                                              List<ProvenanceAction> provenance) throws Exception {
        ObjectSaveData data = new ObjectSaveData()
            .withType(domainAnnotationWsType)
            .withMeta(getMetadata(da))
            .withProvenance(provenance)
            .withData(new UObject(da));
        try {
            long objid = Long.parseLong(id);
            data.withObjid(objid);
        } catch (NumberFormatException ex) {
            data.withName(id);
        }
        return getRefFromObjectInfo(wc.saveObjects(new SaveObjectsParams().withWorkspace(ws).withObjects(Arrays.asList(data))).get(0));
    }

    /**
       Runs a domain search on a single genome, returning annotations.
       Takes a domainModelSetRef (in the SearchDomainsInput) as input,
       which is searched as individual libraries.
    */
    public static SearchDomainsOutput run(String wsURL,
                                          String shockURL,
                                          AuthToken token,
                                          SearchDomainsInput input) throws Exception {

        WorkspaceClient wc = createWsClient(wsURL,token);
        File tempDir = new File("/kb/module/work/");

        // turn local into absolute paths
        String genomeRef = input.getGenomeRef();
        if (genomeRef.indexOf("/") == -1)
            genomeRef = input.getWs()+"/"+genomeRef;
        String domainModelSetRef = input.getDmsRef();
        if (domainModelSetRef.indexOf("/") == -1)
            domainModelSetRef = input.getWs()+"/"+domainModelSetRef;
        
        // for provenance
        String methodName = "DomainAnnotation.search_domains";
        List<UObject> methodParams = Arrays.asList(new UObject(input));
        
        // start building report
        String reportText = "Search Domains output:\n";
        List<String> warnings = null;
        List<WorkspaceObject> objects = new ArrayList<WorkspaceObject>();

        // run annotation
        DomainAnnotation da = null;
        String domainAnnotationRef = null;
        try {
            reportText += "Getting DomainModelSet from storage.\n";
            final DomainModelSet dms = wc.getObjects(Arrays.asList(new ObjectIdentity().withRef(domainModelSetRef))).get(0).getData().asClassInstance(DomainModelSet.class);
            reportText += "Getting Genome from storage.\n";
            final Genome genome = wc.getObjects(Arrays.asList(new ObjectIdentity().withRef(genomeRef))).get(0).getData().asClassInstance(Genome.class);
            Map<String,String> domainLibMap = dms.getDomainLibs();

            // collect one set of annotations per library
            for (String id : domainLibMap.values()) {
                reportText += "Running domain search against library "+id;
                DomainLibrary dl = wc.getObjects(Arrays.asList(new ObjectIdentity().withRef(id))).get(0).getData().asClassInstance(DomainLibrary.class);
                DomainAnnotation results = runDomainSearch(genome, genomeRef, domainModelSetRef, dl);

                // combine all the results into one object
                if (da==null)
                    da = results;
                else
                    combineData(results,da);
            }

            // save final DomainAnnotation object
            domainAnnotationRef = saveDomainAnnotation(wc,
                                                       input.getWs(),
                                                       input.getOutputResultId(),
                                                       da,
                                                       makeProvenance("Domain Annotation",
                                                                      methodName,
                                                                      methodParams));
            objects.add(new WorkspaceObject()
                        .withRef(domainAnnotationRef)
                        .withDescription("Domain Annotations"));
        }
        catch (Exception e) {
            reportText += "\n\nERROR: "+e.getMessage();
            warnings = new ArrayList<String>();
            warnings.add("ERROR: "+e.getMessage());
        }

        // generate report with list of objects created
        String[] report = makeReport(wc,
                                     input.getWs(),
                                     reportText,
                                     warnings,
                                     objects,
                                     makeProvenance("Domain Annotation Report",
                                                    methodName,
                                                    methodParams));

        SearchDomainsOutput rv = new SearchDomainsOutput()
            .withOutputResultId(domainAnnotationRef)
            .withReportName(report[0])
            .withReportRef(report[1]);

        return rv;
    }

    /**
       Runs a domain search on a single genome, returning annotations.
       This works on a single library, but needs metadata (references
       to Genome and DomainModelSet) to populate the annotation object.
    */
    public static DomainAnnotation runDomainSearch(Genome genome,
                                                   String genomeRef,
                                                   String domainModelSetRef,
                                                   DomainLibrary dl) throws Exception {

        return null;
    }
    
    /**
       calculate statistics to store in metadata, used for quick widget drawing
    */
    public static Map<String,String> getMetadata(DomainAnnotation ann) throws Exception {
        Map<String,String> metadata = new HashMap<String,String>();

        HashSet<String> domains = new HashSet<String>();
        HashSet<String> features = new HashSet<String>();

        Map<String, List<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>>> data = ann.getData();
        for (String contigID : data.keySet()) {
            List<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>> annElements = data.get(contigID);
            ListIterator<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>> iterator = annElements.listIterator();
            while (iterator.hasNext()) {
                Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>> elements = iterator.next();
                Map<String, List<Tuple5<Long, Long, Double, Double, Double>>> element = elements.getE5();
                if (element != null) {
                    for (String key : element.keySet()) {
                        domains.add(elements.getE1());
                        features.add(key);
                    }
                }
            }
        }

        metadata.put("annotated_domains",""+domains.size());
        metadata.put("annotated_features",""+features.size());

        return metadata;
    }
    
    /**
       combines annotation data from two DomainAnnotation objects;
       must be from the same genome.  Note that this will fail if
       results are in different order, or if two libraries have
       models with the same accessions
    */
    public static void combineData(DomainAnnotation source,
                                   DomainAnnotation target) throws Exception {
        if (!source.getGenomeRef().equals(target.getGenomeRef()))
            throw new IllegalArgumentException("Error: DomainAnnotation objects from different genomes can't be combined");
        if (!source.getUsedDmsRef().equals(target.getUsedDmsRef()))
            throw new IllegalArgumentException("Error: DomainAnnotation objects from different domain model sets can't be combined");

        Map<String, List<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>>> sourceData = source.getData();
        Map<String, List<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>>> targetData = target.getData();
        for (String contigID : sourceData.keySet()) {
            List<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>> sourceElements = sourceData.get(contigID);
            List<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>> targetElements = targetData.get(contigID);
            ListIterator<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>> sIterator = sourceElements.listIterator();
            ListIterator<Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>>> tIterator = targetElements.listIterator();
            while (sIterator.hasNext()) {
                Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>> sElement = sIterator.next();
                Tuple5<String, Long, Long, Long, Map<String, List<Tuple5<Long, Long, Double, Double, Double>>>> tElement = tIterator.next();
                tElement.getE5().putAll(sElement.getE5());
            }
        }
    }
}
