package domainannotation.test;

import java.io.*;
import java.util.*;
import java.net.URL;

import org.junit.Test;
import static junit.framework.Assert.*;

import org.ini4j.Ini;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import domainannotation.*;
import us.kbase.auth.AuthToken;
import us.kbase.shock.client.*;
import us.kbase.common.service.*;
import us.kbase.workspace.*;


public class DomainAnnotationServerTest {
    private static AuthToken token = null;
    private static Map<String, String> config = null;
    private static WorkspaceClient wsClient = null;
    private static BasicShockClient shockClient = null;
    private static String wsName = null;
    private static DomainAnnotationServer impl = null;
    
    @BeforeClass
    public static void init() throws Exception {
        token = new AuthToken(System.getenv("KB_AUTH_TOKEN"));
        String configFilePath = System.getenv("KB_DEPLOYMENT_CONFIG");
        File deploy = new File(configFilePath);
        Ini ini = new Ini(deploy);
        config = ini.get("DomainAnnotation");
        wsClient = new WorkspaceClient(new URL(config.get("workspace-url")), token);
        wsClient.setAuthAllowedForHttp(true);
        BasicShockClient shockClient = new BasicShockClient(new URL(config.get("workspace-url")), token);
        
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
       public workspace.
    */
    @Test
    public void checkDMS() throws Exception {
        String domainWsName = "KBasePublicGeneDomains";
        String allRef = domainWsName+"/All";
        
        DomainModelSet dms = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(allRef))).get(0).getData().asClassInstance(DomainModelSet.class);

        Map<String,String> domainLibMap = dms.getDomainLibs();

        for (String id : domainLibMap.values()) {
            DomainLibrary dl = wsClient.getObjects(Arrays.asList(new ObjectIdentity().withRef(id))).get(0).getData().asClassInstance(DomainLibrary.class);
            System.out.println("Testing shock files for "+dl.getSource()+" "+dl.getVersion());
            for (Handle h : dl.getLibraryFiles()) {
                System.out.println("  testing "+h.getFileName()+", "+h.getShockId());
                File f = new File("/tmp/"+h.getFileName());
                OutputStream os = new BufferedOutputStream(new FileOutputStream(f));
                shockClient.getFile(new ShockNodeId(h.getShockId()),os);
                os.close();
                assertTrue(f.length() > 0);
            }
        }
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
