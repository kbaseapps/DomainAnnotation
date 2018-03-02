package domainannotation;

import java.io.*;
import java.util.*;
import java.net.URL;

import org.strbio.IO;
import org.strbio.util.*;
import com.fasterxml.jackson.databind.*;

import org.ini4j.Ini;

import us.kbase.auth.AuthService;
import us.kbase.auth.AuthToken;
import us.kbase.common.service.*;
import us.kbase.workspace.*;
import us.kbase.kbasegenomes.*;
import us.kbase.kbasegenefamilies.*;
import us.kbase.shock.client.*;

public class DomainModelLibPreparation {
    private static final String domainWsName = "KBasePublicGeneDomains";
    private static final String domainLibraryType = "KBaseGeneFamilies.DomainLibrary";
    private static final String domainModelSetType = "KBaseGeneFamilies.DomainModelSet";

    public static void main(String[] args) throws Exception {
        checkOrCreateWorkspace();
	
        parseDomainLibrary("PRK-6.0-CDD-3.16",
                           "ftp://ftp.ncbi.nih.gov/pub/mmdb/cdd/",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/Prk",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/cddid.tbl.gz",
                           "6.0",
                           "2017-03-29",
                           "prk-no-url",
                           "");
        parseDomainLibrary("NCBIfam-AMR-1.1",
                           "https://ftp.ncbi.nlm.nih.gov/hmm/NCBIfam-AMR/1.1/NCBIfam-AMR.LIB",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/NCBIfam-AMR.LIB",
                           null,
                           "1.1",
                           "2017-11-28",
                           "NCBIfam-AMR",
                           "");
        parseDomainLibrary("COGs-CDD-3.16",
                           "ftp://ftp.ncbi.nih.gov/pub/mmdb/cdd/",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/Cog",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/cddid.tbl.gz",
                           "3.16",
                           "2017-03-29",
                           "COG",
                           "http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=COG");
        parseDomainLibrary("CDD-NCBI-curated-3.16",
                           "ftp://ftp.ncbi.nih.gov/pub/mmdb/cdd/",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/Cdd",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/cddid.tbl.gz",
                           "3.16",
                           "2017-03-29",
                           "cd",
                           "http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=cd");
        parseDomainLibrary("CDD-SD-NCBI-curated-3.16",
                           "ftp://ftp.ncbi.nih.gov/pub/mmdb/cdd/",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/Csd",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/cddid.tbl.gz",
                           "3.16",
                           "2017-03-29",
                           "sd",
                           "http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=sd");
        parseDomainLibrary("SMART-6.0-CDD-3.16",
                           "ftp://ftp.ncbi.nih.gov/pub/mmdb/cdd/",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/Smart",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/cddid.tbl.gz",
                           "6.0",
                           "2017-03-29",
                           "smart",
                           "http://smart.embl-heidelberg.de/smart/do_annotation.pl?DOMAIN=");
        parseDomainLibrary("Pfam-31.0",
                           "ftp://ftp.ebi.ac.uk/pub/databases/Pfam/releases/Pfam31.0/Pfam-A.hmm.gz",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/Pfam-A.hmm",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/Pfam-A.full.gz",
                           "31.0",
                           "2017-02-24",
                           "PF",
                           "http://pfam.xfam.org/family/PF");
        parseDomainLibrary("TIGRFAMs-15.0",
                           "ftp://ftp.jcvi.org/pub/data/TIGRFAMs/TIGRFAMs_15.0_HMM.LIB.gz",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/TIGRFAMs_15.0_HMM.LIB",
                           null,
                           "15.0",
                           "2014-09-17",
                           "TIGR",
                           "http://www.jcvi.org/cgi-bin/tigrfams/HmmReportPage.cgi?acc=TIGR");
        parseDomainLibrary("NCBIfam-PRK-1.1",
                           "https://ftp.ncbi.nlm.nih.gov/hmm/NCBIfam-PRK/1.1/NCBIfam-PRK.LIB",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/NCBIfam-PRK.LIB",
                           null,
                           "1.1",
                           "2017-11-28",
                           "NCBIfam-PRK",
                           "");
        parseDomainLibrary("NCBIfam-gen-1.1",
                           "https://ftp.ncbi.nlm.nih.gov/hmm/NCBIfam-gen/1.1/NCBIfam-gen.LIB",
                           "/kb/dev_container/modules/kb_sdk/DomainAnnotation/data/db/NCBIfam-gen.LIB",
                           null,
                           "1.1",
                           "2017-11-28",
                           "NCBIfam-gen",
                           "");
        String[] libraries = new String[] {"COGs-CDD-3.16"};
        makeDomainModelSet("COGs-1.0-3.16-only",
                           libraries);

        libraries[0] = "Pfam-31.0";
	
        makeDomainModelSet("Pfam-31.0-only",
                           libraries);
	
        libraries[0] = "SMART-6.0-CDD-3.16";
	
        makeDomainModelSet("SMART-6.0-3.16-only",
                           libraries);
        libraries[0] = "PRK-6.0-CDD-3.16";
	
        makeDomainModelSet("PRK-6.0-3.16-only",
                           libraries);

        libraries[0] = "TIGRFAMs-15.0";

        makeDomainModelSet("TIGRFAMs-15.0-only",
                           libraries);

        libraries = new String[] { "CDD-NCBI-curated-3.16",
                                   "CDD-SD-NCBI-curated-3.16"};
	
        makeDomainModelSet("NCBI-CDD-3.16-only",
                           libraries);

        libraries = new String[] { "NCBIfam-PRK-1.1",
                                   "NCBIfam-AMR-1.1",
                                   "NCBIfam-gen-1.1"};

        makeDomainModelSet("NCBIfam-1.1-only",
                           libraries);

        libraries = new String[] { "COGs-CDD-3.16",
                                   "CDD-NCBI-curated-3.16",
                                   "CDD-SD-NCBI-curated-3.16",
                                   "SMART-6.0-CDD-3.16",
                                   "PRK-6.0-CDD-3.16",
                                   "Pfam-31.0",
                                   "TIGRFAMs-15.0",
                                   "NCBIfam-PRK-1.1",
                                   "NCBIfam-AMR-1.1",
                                   "NCBIfam-gen-1.1"};
	
        makeDomainModelSet("All-1.0.3",
                           libraries);
    }

    /**
       make the public workspace, if it does not already exist on this
       version of the service
    */
    private static void checkOrCreateWorkspace() throws Exception {
        WorkspaceClient wc = createWsClient(getDevToken());
        try {
            wc.getWorkspaceInfo(new WorkspaceIdentity().withWorkspace(domainWsName));
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            wc.createWorkspace(new CreateWorkspaceParams().withGlobalread("r").withWorkspace(domainWsName));
        }
    }

    /**
       Makes a DomainModelSet out of an array of libraries, which
       must already exist in the public domain workspace, and saves
       it in the public domain workspace with a specified ID,
       and returns a ref to the saved object.
    */
    private static String makeDomainModelSet(String id,
                                             String[] libraryIDs) throws Exception {

        System.out.println("Making domain model set "+id);

        DomainModelSet dms = new DomainModelSet().withSetName(id);

        Map<String,String> accessionToDescription = new HashMap<String,String>();
        Map<String,String> domainPrefixMap = new HashMap<String,String>();
        Map<String,String> domainLibs = new HashMap<String,String>();
	
        for (String libraryID : libraryIDs) {
            DomainLibrary dl = loadDomainLibrary(libraryID);
            String domainPrefix = dl.getDomainPrefix();
            domainLibs.put(domainPrefix, domainWsName+"/"+libraryID);
            String xref = dl.getDbxrefPrefix();
            domainPrefixMap.put(domainPrefix,xref);
            Map<String,DomainModel> domains = dl.getDomains();
            for (String accession : domains.keySet()) {
                DomainModel m = domains.get(accession);
                String description = m.getDescription();
                accessionToDescription.put(accession,description);
            }
        }
        dms.setDomainAccessionToDescription(accessionToDescription);
        dms.setDomainPrefixToDbxrefUrl(domainPrefixMap);
        dms.setDomainLibs(domainLibs);

        return saveDomainModelSet(dms,id);
    }
    
    /**
       Parses a DomainLibrary out of a set of downloaded CDD files.
       The info for each DomainModel is parsed from cddid.tbl.gz,
       which should have already been downloaded by prepare_3rd_party_dbs.sh.
       Saves it in the public domain workspace with a specified ID,
       and returns a ref to the saved object.
    */
    private static String parseDomainLibrary(String id,
                                             String sourceURL,
                                             String fileName,
                                             String indexName,
                                             String version,
                                             String releaseDate,
                                             String prefix,
                                             String xref) throws Exception {

        System.out.println("Making domain library "+id);

        String source = null;
        String program = null;
        if (sourceURL.indexOf("cdd") > 0) {
            source = "CDD";
            program = "rpsblast-2.2.31";
        }
        else if (sourceURL.indexOf("Pfam") > 0) {
            source = "Pfam";
            program = "hmmscan-3.1b2";
        }
        else if (sourceURL.indexOf("TIGRFAMs") > 0) {
            source = "TIGRFAMs";
            program = "hmmscan-3.1b2";
        }
        else if (sourceURL.indexOf("NCBIfam") > 0) {
            source = "NCBIfam";
            program = "hmmscan-3.1b2";
        }
        else throw new Exception("unknown domain library type");

        DomainLibrary dl = new DomainLibrary()
            .withId(id)
            .withSource(source)
            .withSourceUrl(sourceURL)
            .withVersion(version)
            .withReleaseDate(releaseDate)
            .withProgram(program)
            .withDomainPrefix(prefix)
            .withDbxrefPrefix(xref)
            .withLibraryFiles(null);

        Map<String,DomainModel> domains;
        if (source.equals("CDD"))
            domains = parseCDDDomains(fileName,
                                      indexName);
        else
            domains = parseHMMDomains(fileName,
                                      indexName);
        System.out.println("Found "+domains.size()+" domains");
	
        dl.setDomains(domains);

        // find all the parsed library files; make sure
        // the "real" file for passing to blast/hmmer is first
        File libFile = new File(fileName);
        fileName = libFile.getName();
        String libPrefix = new String(fileName);
        int pos = fileName.indexOf(".");
        if (pos > 0)
            libPrefix = libPrefix.substring(0,pos);
        Vector<Handle>libraryFiles = new Vector<Handle>();
        libraryFiles.add(new Handle()
                         .withFileName(fileName));
        File libDir = libFile.getParentFile();
        for (File f : libDir.listFiles()) {
            if (!f.isFile())
                continue;
            if (!f.getName().startsWith(libPrefix))
                continue;
            if (f.getName().equals(fileName))
                continue;

            // System.out.println("debug:  adding "+f.getName());
            
            libraryFiles.add(new Handle()
                             .withFileName(f.getName()));
        }

        // store them all in Shock
        AuthToken token = getDevToken();
        String configFilePath = System.getenv("KB_DEPLOYMENT_CONFIG");
        if (configFilePath==null)
            throw new Exception("Need to set KB_DEPLOYMENT_CONFIG");
        
        File deploy = new File(configFilePath);
        Ini ini = new Ini(deploy);
        Map<String, String> config = ini.get("global");
        String shockURL = config.get("shock_url");
        BasicShockClient client = new BasicShockClient(new URL(shockURL), token);
        for (Handle h : libraryFiles) {
            File f = new File(libDir.getPath()+"/"+h.getFileName());
            InputStream is = new BufferedInputStream(new FileInputStream(f));
            ShockNode sn = client.addNode(is,f.getName(),null);
            String shockNodeID = sn.getId().getId();
            // this used to make nodes world-readable;
            // since auth2, it now fails because user is <unknown>
            // String user = token.getUserName();
            // client.removeFromNodeAcl(sn.getId(), Arrays.asList(user), ShockACLType.READ);
            // the commented-out code above is now obsolete and
            // can be safely removed.
            // 
            // this is the new API to make nodes world-readable:
            client.setPubliclyReadable(sn.getId(), true);
            h.setShockId(shockNodeID);
        }
	
        dl.setLibraryFiles(libraryFiles);

        return saveDomainLibrary(dl,id);
    }
    
    /**
       Creates a set of DomainModels for CDD domains.  The info for
       each DomainModel is parsed from a file (should generally be
       cddid.tbl.gz, which is downloaded by prepare_3rd_party_dbs.sh)
    */
    private static Map<String,DomainModel> parseCDDDomains(String fileName,
                                                           String indexName) throws Exception {
        Map<String,DomainModel> domains = new HashMap<String,DomainModel>();

        BufferedReader infile = IO.openReader(fileName);
        String buffer;
        HashSet<String> validAcc = new HashSet<String>();
        while ((buffer=infile.readLine()) != null) {
            int pos = buffer.indexOf(".smp");
            if (pos>0)
                validAcc.add(buffer.substring(0,pos));
        }
        infile = IO.openReader(indexName);
        while ((buffer=infile.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(buffer,"\t");
            DomainModel m = new DomainModel();
            m.setCddId(st.nextToken());
            String accession = st.nextToken();
            m.setAccession(accession);
            m.setName(st.nextToken());
            String description = st.nextToken();
            m.setDescription(description);
            m.setLength(StringUtil.atol(st.nextToken()));
            m.setModelType("PSSM");
            if (validAcc.contains(accession))
                domains.put(accession,m);
        }
        infile.close();

        return domains;
    }

    /**
       Creates a set of DomainModels from a HMM library.  The info for
       each DomainModel is parsed from two files: the HMM library itself
       and (if non-null) the Index file (e.g., Pfam-A.seed)
    */
    private static Map<String,DomainModel> parseHMMDomains(String fileName,
                                                           String indexName) throws Exception {
        Map<String,DomainModel> domains = new HashMap<String,DomainModel>();

        BufferedReader infile = IO.openReader(fileName);
        String name= null, acc=null, desc=null;
        double tc=0.0;
        long l=0;

        while (infile.ready()) {
            String buffer = infile.readLine();

            if ((buffer.startsWith("NAME ")) ||
                (buffer.startsWith("NAME\t")))
                name = buffer.substring(5).trim();
            else if ((buffer.startsWith("DESC ")) ||
                     (buffer.startsWith("DESC\t")))
                desc = buffer.substring(5).trim();
            else if ((buffer.startsWith("TC ")) ||
                     (buffer.startsWith("TC\t")))
                tc = StringUtil.atod(buffer.substring(3));
            else if ((buffer.startsWith("ACC ")) ||
                     (buffer.startsWith("ACC\t")))
                acc = buffer.substring(4).trim();
            else if ((buffer.startsWith("LENG ")) ||
                     (buffer.startsWith("LENG\t")))
                l = StringUtil.atol(buffer.substring(5));
            else if ((buffer.startsWith("HMM ")) ||
                     (buffer.startsWith("HMM\t"))) {
                DomainModel m = new DomainModel()
                    .withAccession(acc)
                    .withName(name)
                    .withDescription(desc)
                    .withLength(l)
                    .withModelType("HMM-Family");
                domains.put(acc,m);
            }
        }
        infile.close();

        if (indexName != null) {
            infile = IO.openReader(indexName);
            acc = null;
            while (infile.ready()) {
                String buffer = infile.readLine();
                if (buffer.startsWith("# STOCK"))
                    acc = null;
                else if (buffer.startsWith("#=GF AC "))
                    acc = buffer.substring(10);
                else if (buffer.startsWith("#=GF TP ")) {
                    String domainType = buffer.substring(10);
                    DomainModel m = domains.get(acc);
                    if (m != null)
                        m.setModelType("HMM-"+domainType);
                }
            }
            infile.close();
        }

        return domains;
    }

    /**
       saves a DomainLibrary in the public domain workspace, under
       a given ID.  Returns ref to the object.
    */
    private static String saveDomainLibrary(DomainLibrary dl,
                                            String id) throws Exception {
        WorkspaceClient wc = createWsClient(getDevToken());
        String dlRef =
            getRefFromObjectInfo(wc.saveObjects(new SaveObjectsParams()
                                                .withWorkspace(domainWsName)
                                                .withObjects(Arrays.asList(new ObjectSaveData()
                                                                           .withType(domainLibraryType)
                                                                           .withName(id)
                                                                           .withData(new UObject(dl))))).get(0));

        return dlRef;
    }

    /**
       gets a DomainLibrary from the public domain workspace
    */
    private static DomainLibrary loadDomainLibrary(String id) throws Exception {
        WorkspaceClient wc = createWsClient(getDevToken());
        return wc.getObjects(Arrays.asList(new ObjectIdentity().withRef(domainWsName+"/"+id))).get(0).getData().asClassInstance(DomainLibrary.class);
    }
    
    /**
       saves a DomainModelSet in the public domain workspace, under
       a given ID.  Returns ref to the object.
    */
    private static String saveDomainModelSet(DomainModelSet dms,
                                             String id) throws Exception {
        WorkspaceClient wc = createWsClient(getDevToken());
        String dlRef =
            getRefFromObjectInfo(wc.saveObjects(new SaveObjectsParams()
                                                .withWorkspace(domainWsName)
                                                .withObjects(Arrays.asList(new ObjectSaveData()
                                                                           .withType(domainModelSetType)
                                                                           .withName(id)
                                                                           .withData(new UObject(dms))))).get(0));

        return dlRef;
    }
    
    /**
       creates a workspace client; if token is null, client can
       only read public workspaces
    */
    public static WorkspaceClient createWsClient(AuthToken token) throws Exception {
        WorkspaceClient rv = null;

        String configFilePath = System.getenv("KB_DEPLOYMENT_CONFIG");
        if (configFilePath==null)
            throw new Exception("Need to set KB_DEPLOYMENT_CONFIG");
        File deploy = new File(configFilePath);
        Ini ini = new Ini(deploy);
        Map<String, String> config = ini.get("global");
        String wsURL = config.get("workspace_url");
	
        if (token==null)
            rv = new WorkspaceClient(new URL(wsURL));
        else
            rv = new WorkspaceClient(new URL(wsURL),token);
        rv.setAuthAllowedForHttp(true);
        return rv;
    }

    /**
       gets the auth token from the environment
    */
    public static AuthToken getDevToken() throws Exception {
        return new AuthToken(System.getenv("KB_AUTH_TOKEN"), "<unknown>");
    }

    private static String getRefFromObjectInfo(Tuple11<Long, String, String, String, Long, String, Long, String, String, Long, Map<String,String>> info) {
        return info.getE7() + "/" + info.getE1() + "/" + info.getE5();
    }
}
