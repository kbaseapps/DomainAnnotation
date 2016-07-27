
package us.kbase.kbasegenefamilies;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: SearchDomainsParams</p>
 * <pre>
 * genome_ref genome - genome for domain annotation process
 * dms_ref dms_ref - set of domain models that will be searched in defined genome
 * string out_workspace - output workspace
 * string out_result_id - id of resulting object of type DomainAnnotation
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "genome",
    "dms_ref",
    "out_workspace",
    "out_result_id"
})
public class SearchDomainsParams {

    @JsonProperty("genome")
    private String genome;
    @JsonProperty("dms_ref")
    private String dmsRef;
    @JsonProperty("out_workspace")
    private String outWorkspace;
    @JsonProperty("out_result_id")
    private String outResultId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("genome")
    public String getGenome() {
        return genome;
    }

    @JsonProperty("genome")
    public void setGenome(String genome) {
        this.genome = genome;
    }

    public SearchDomainsParams withGenome(String genome) {
        this.genome = genome;
        return this;
    }

    @JsonProperty("dms_ref")
    public String getDmsRef() {
        return dmsRef;
    }

    @JsonProperty("dms_ref")
    public void setDmsRef(String dmsRef) {
        this.dmsRef = dmsRef;
    }

    public SearchDomainsParams withDmsRef(String dmsRef) {
        this.dmsRef = dmsRef;
        return this;
    }

    @JsonProperty("out_workspace")
    public String getOutWorkspace() {
        return outWorkspace;
    }

    @JsonProperty("out_workspace")
    public void setOutWorkspace(String outWorkspace) {
        this.outWorkspace = outWorkspace;
    }

    public SearchDomainsParams withOutWorkspace(String outWorkspace) {
        this.outWorkspace = outWorkspace;
        return this;
    }

    @JsonProperty("out_result_id")
    public String getOutResultId() {
        return outResultId;
    }

    @JsonProperty("out_result_id")
    public void setOutResultId(String outResultId) {
        this.outResultId = outResultId;
    }

    public SearchDomainsParams withOutResultId(String outResultId) {
        this.outResultId = outResultId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((("SearchDomainsParams"+" [genome=")+ genome)+", dmsRef=")+ dmsRef)+", outWorkspace=")+ outWorkspace)+", outResultId=")+ outResultId)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
