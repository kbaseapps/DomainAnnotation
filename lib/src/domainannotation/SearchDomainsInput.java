
package domainannotation;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: SearchDomainsInput</p>
 * <pre>
 * genome_ref genome - genome for domain annotation process
 * dms_ref dms_ref - set of domain models that will be searched in defined genome
 * string ws - workspace
 * string output_result_id - id of resulting object of type DomainAnnotation
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "genome_ref",
    "dms_ref",
    "ws",
    "output_result_id"
})
public class SearchDomainsInput {

    @JsonProperty("genome_ref")
    private String genomeRef;
    @JsonProperty("dms_ref")
    private String dmsRef;
    @JsonProperty("ws")
    private String ws;
    @JsonProperty("output_result_id")
    private String outputResultId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("genome_ref")
    public String getGenomeRef() {
        return genomeRef;
    }

    @JsonProperty("genome_ref")
    public void setGenomeRef(String genomeRef) {
        this.genomeRef = genomeRef;
    }

    public SearchDomainsInput withGenomeRef(String genomeRef) {
        this.genomeRef = genomeRef;
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

    public SearchDomainsInput withDmsRef(String dmsRef) {
        this.dmsRef = dmsRef;
        return this;
    }

    @JsonProperty("ws")
    public String getWs() {
        return ws;
    }

    @JsonProperty("ws")
    public void setWs(String ws) {
        this.ws = ws;
    }

    public SearchDomainsInput withWs(String ws) {
        this.ws = ws;
        return this;
    }

    @JsonProperty("output_result_id")
    public String getOutputResultId() {
        return outputResultId;
    }

    @JsonProperty("output_result_id")
    public void setOutputResultId(String outputResultId) {
        this.outputResultId = outputResultId;
    }

    public SearchDomainsInput withOutputResultId(String outputResultId) {
        this.outputResultId = outputResultId;
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
        return ((((((((((("SearchDomainsInput"+" [genomeRef=")+ genomeRef)+", dmsRef=")+ dmsRef)+", ws=")+ ws)+", outputResultId=")+ outputResultId)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
