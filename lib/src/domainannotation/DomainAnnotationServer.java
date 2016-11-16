package domainannotation;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import us.kbase.auth.AuthToken;
import us.kbase.common.service.JsonServerMethod;
import us.kbase.common.service.JsonServerServlet;
import us.kbase.common.service.JsonServerSyslog;
import us.kbase.common.service.RpcContext;

//BEGIN_HEADER
import java.net.URL;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import us.kbase.common.service.Tuple11;
import us.kbase.common.service.UObject;
import us.kbase.kbasegenomes.Contig;
import us.kbase.kbasegenomes.ContigSet;
import us.kbase.workspace.ObjectIdentity;
import us.kbase.workspace.ObjectSaveData;
import us.kbase.workspace.ProvenanceAction;
import us.kbase.workspace.SaveObjectsParams;
import us.kbase.workspace.WorkspaceClient;
//END_HEADER

/**
 * <p>Original spec-file module name: DomainAnnotation</p>
 * <pre>
 * This is a port of the KBaseGeneFamilies module to the SDK.
 * </pre>
 */
public class DomainAnnotationServer extends JsonServerServlet {
    private static final long serialVersionUID = 1L;
    private static final String version = "0.0.1";
    private static final String gitUrl = "git@github.com:kbaseapps/DomainAnnotation.git";
    private static final String gitCommitHash = "d906526f39b17b1e8c0d95818df74edcc82d1045";

    //BEGIN_CLASS_HEADER
    private final String wsUrl;
    private final String shockUrl;
    //END_CLASS_HEADER

    public DomainAnnotationServer() throws Exception {
        super("DomainAnnotation");
        //BEGIN_CONSTRUCTOR
        wsUrl = config.get("workspace-url");
        shockUrl = config.get("shock-url");
        //END_CONSTRUCTOR
    }

    /**
     * <p>Original spec-file function name: search_domains</p>
     * <pre>
     * Search for domains in a genome
     * </pre>
     * @param   input   instance of type {@link domainannotation.SearchDomainsInput SearchDomainsInput}
     * @return   parameter "output" of type {@link domainannotation.SearchDomainsOutput SearchDomainsOutput}
     */
    @JsonServerMethod(rpc = "DomainAnnotation.search_domains", async=true)
    public SearchDomainsOutput searchDomains(SearchDomainsInput input, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        SearchDomainsOutput returnVal = null;
        //BEGIN search_domains
        returnVal = DomainAnnotationImpl.searchDomains(wsUrl,shockUrl,authPart,input);
        //END search_domains
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: search_domains_ga</p>
     * <pre>
     * Search for domains in a genome annotation
     * </pre>
     * @param   input   instance of type {@link domainannotation.SearchDomainsGAInput SearchDomainsGAInput}
     * @return   parameter "output" of type {@link domainannotation.SearchDomainsGAOutput SearchDomainsGAOutput}
     */
    @JsonServerMethod(rpc = "DomainAnnotation.search_domains_ga", async=true)
    public SearchDomainsGAOutput searchDomainsGa(SearchDomainsGAInput input, AuthToken authPart, RpcContext jsonRpcContext) throws Exception {
        SearchDomainsGAOutput returnVal = null;
        //BEGIN search_domains_ga
        returnVal = DomainAnnotationImpl.searchDomainsGA(wsUrl,shockUrl,authPart,input);
        //END search_domains_ga
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: version</p>
     * <pre>
     * returns version number of service
     * </pre>
     * @return   parameter "version" of String
     */
    @JsonServerMethod(rpc = "DomainAnnotation.version", async=true)
    public String version(RpcContext jsonRpcContext) throws Exception {
        String returnVal = null;
        //BEGIN version
        returnVal = "DomainAnnotation-1.0."+serialVersionUID;
        //END version
        return returnVal;
    }
    @JsonServerMethod(rpc = "DomainAnnotation.status")
    public Map<String, Object> status() {
        Map<String, Object> returnVal = null;
        //BEGIN_STATUS
        returnVal = new LinkedHashMap<String, Object>();
        returnVal.put("state", "OK");
        returnVal.put("message", "");
        returnVal.put("version", version);
        returnVal.put("git_url", gitUrl);
        returnVal.put("git_commit_hash", gitCommitHash);
        //END_STATUS
        return returnVal;
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            new DomainAnnotationServer().startupServer(Integer.parseInt(args[0]));
        } else if (args.length == 3) {
            JsonServerSyslog.setStaticUseSyslog(false);
            JsonServerSyslog.setStaticMlogFile(args[1] + ".log");
            new DomainAnnotationServer().processRpcCall(new File(args[0]), new File(args[1]), args[2]);
        } else {
            System.out.println("Usage: <program> <server_port>");
            System.out.println("   or: <program> <context_json_file> <output_json_file> <token>");
            return;
        }
    }
}
