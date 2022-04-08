package domainannotation.test;

import java.io.*;
import java.util.*;
import java.net.URL;

import junit.framework.Assert;
import static junit.framework.Assert.*;

import org.ini4j.Ini;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import domainannotation.*;
import us.kbase.kbasereport.Report;
import us.kbase.auth.AuthToken;
import us.kbase.shock.client.*;
import us.kbase.common.service.*;
import us.kbase.workspace.*;
import us.kbase.kbasegenomes.*;

import com.fasterxml.jackson.databind.*;

public class DomainAnnotationServerTest {
    private static AuthToken token = null;
    private static Map<String, String> config = null;
    private static WorkspaceClient wsClient = null;
    private static String shockURL = null;
    private static String wsURL = null;
    private static String wsName = null;
    private static DomainAnnotationServer impl = null;
    private static final String domainWsName = "KBasePublicGeneDomains";
    private static final String domainLibraryType = "KBaseGeneFamilies.DomainLibrary";
    private static final String domainModelSetType = "KBaseGeneFamilies.DomainModelSet";
    private static final String domainAnnotationType = "KBaseGeneFamilies.DomainAnnotation";
    // needs to be in app-dev:
    // private static final String ecoliRef = "19217/25575/2";
    private static final String ecoliRef = "79/11/1";
    private static final String smartRef = domainWsName+"/SMART-6.0-3.19-only";
    private static final String tigrRef = domainWsName+"/TIGRFAMs-15.0-only";
    private static final String allLibsRef = domainWsName+"/All-1.0.9";
    
    @BeforeClass
    public static void init() throws Exception {
        token = new AuthToken(System.getenv("KB_AUTH_TOKEN"), "<unknown>");
        String configFilePath = System.getenv("KB_DEPLOYMENT_CONFIG");
        File deploy = new File(configFilePath);
        Ini ini = new Ini(deploy);
        config = ini.get("DomainAnnotation");
        wsURL = config.get("workspace-url");
        wsClient = new WorkspaceClient(new URL(wsURL), token);
        wsClient.setAuthAllowedForHttp(true);
        shockURL = config.get("shock-url");
        
        // These lines are necessary because we don't want to start linux syslog bridge service
        JsonServerSyslog.setStaticUseSyslog(false);
        JsonServerSyslog.setStaticMlogFile(new File(config.get("scratch"), "test.log").getAbsolutePath());
        impl = new DomainAnnotationServer();
    }
    
    private static String getWsName() throws Exception {
        if (wsName == null) {
            long suffix = System.currentTimeMillis();
            wsName = "test_DomainAnnotation_" + suffix;
            wsClient.createWorkspace(new CreateWorkspaceParams().withWorkspace(wsName));
        }
        return wsName;
    }
    
    private static RpcContext getContext() {
        return new RpcContext().withProvenance(Arrays.asList(new ProvenanceAction()
            .withService("DomainAnnotation").withMethod("please_never_use_it_in_production")
            .withMethodParams(new ArrayList<UObject>())));
    }

    /**
       Check that we can get all the All Libraries DomainModelSet from the
       public workspace, WITHOUT logging in.  This is slow, so I leave
       it commented out unless testing a new release.
    @Test
    */
    public void checkDMS() throws Exception {
        DomainModelSet dms = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(allLibsRef))).get(0).getData().asClassInstance(DomainModelSet.class);

        Map<String,String> domainLibMap = dms.getDomainLibs();

        for (String id : domainLibMap.values()) {
            DomainLibrary dl = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(id))).get(0).getData().asClassInstance(DomainLibrary.class);
            System.out.println("Testing shock files for "+dl.getSource()+" "+dl.getVersion());
            File dir = DomainAnnotationImpl.getDomainsDir();
            for (Handle h : dl.getLibraryFiles()) {
                File f = new File(dir.getPath()+"/"+h.getFileName());
                if (f.canRead())
                    f.delete(); // to be sure we get new ones
                System.out.println("getting shock id "+h.getShockId());
                DomainAnnotationImpl.fromShock(h, shockURL, null, f, false);
            }
        }
    }

    /**
       Check that we can read E coli genome
    @Test
    */
    public void getEColi() throws Exception {
        Genome genome = null;

        System.out.println("Reading genome from WS");
        genome = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(ecoliRef))).get(0).getData().asClassInstance(Genome.class);

        System.out.println(genome.getScientificName());
        assertEquals(genome.getScientificName(), "Escherichia coli str. K-12 substr. MG1655");
    }

    /**
       Check that we can get the SMART-only DomainModelSet from the
       public workspace.
    */
    @Test
    public void getSMART() throws Exception {
        DomainModelSet smart = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(smartRef))).get(0).getData().asClassInstance(DomainModelSet.class);

        assertEquals(smart.getSetName(),"SMART-6.0-3.19-only");
    }

    /**
       Check that we can annotate E. coli with SMART.  This is
       fairly fast.
    */
    @Test
    public void searchEColiPSSM() throws Exception {
        SearchDomainsInput input = new SearchDomainsInput()
            .withGenomeRef(ecoliRef)
            .withDmsRef(smartRef)
            .withWs(getWsName())
            .withOutputResultId("test");
        SearchDomainsOutput output = DomainAnnotationImpl.searchDomains(wsURL,
                                                                        shockURL,
                                                                        token,
                                                                        input);
        Assert.assertNotNull(output);
        String reportRef = output.getReportRef();
        Assert.assertNotNull(reportRef);
        Report report = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(reportRef))).get(0).getData().asClassInstance(us.kbase.kbasereport.Report.class);
        Assert.assertNotNull(report);
        System.out.println(report.getTextMessage());

        // test that we can write the output to csv
        String daRef = output.getOutputResultId();
        ExportParams exportParams = new ExportParams()
            .withInputRef(daRef);
        ExportResult out2 = DomainAnnotationImpl.exportCSV(wsURL,
                                                           shockURL,
                                                           token,
                                                           exportParams);
        Assert.assertNotNull(out2);
    }

    /**
       Check that we can annotate E. coli with all libraries.  This is
       slow.
    @Test
    */
    public void searchEColiAll() throws Exception {
        SearchDomainsInput input = new SearchDomainsInput()
            .withGenomeRef(ecoliRef)
            .withDmsRef(allLibsRef)
            .withWs(getWsName())
            .withOutputResultId("test-all");
        SearchDomainsOutput output = DomainAnnotationImpl.searchDomains(wsURL,
                                                                        shockURL,
                                                                        token,
                                                                        input);
        Assert.assertNotNull(output);
        String reportRef = output.getReportRef();
        Assert.assertNotNull(reportRef);
        Report report = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(reportRef))).get(0).getData().asClassInstance(us.kbase.kbasereport.Report.class);
        Assert.assertNotNull(report);
        System.out.println(report.getTextMessage());

        // test that we can write the output to csv
        String daRef = output.getOutputResultId();
        ExportParams exportParams = new ExportParams()
            .withInputRef(daRef);
        ExportResult out2 = DomainAnnotationImpl.exportCSV(wsURL,
                                                           shockURL,
                                                           token,
                                                           exportParams);
        Assert.assertNotNull(out2);
    }
    
    @AfterClass
    public static void cleanup() {
        if (wsName != null) {
            try {
                wsClient.deleteWorkspace(new WorkspaceIdentity().withWorkspace(wsName));
                System.out.println("Test workspace was deleted");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
