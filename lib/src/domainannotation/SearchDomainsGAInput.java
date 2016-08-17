
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
 * <p>Original spec-file type: SearchDomainsGAInput</p>
 * <pre>
 * genome_annotation_ref genome - genome annotaion for domain annotation process
 * dms_ref dms_ref - set of domain models that will be searched in defined genome
 * string ws - workspace
 * string output_result_id - id of resulting object of type GenomeAnnotation
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "genome_annotation_ref",
    "dms_ref",
    "ws",
    "output_result_id"
})
public class SearchDomainsGAInput {

    @JsonProperty("genome_annotation_ref")
    private String genomeAnnotationRef;
    @JsonProperty("dms_ref")
    private String dmsRef;
    @JsonProperty("ws")
    private String ws;
    @JsonProperty("output_result_id")
    private String outputResultId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("genome_annotation_ref")
    public String getGenomeAnnotationRef() {
        return genomeAnnotationRef;
    }

    @JsonProperty("genome_annotation_ref")
    public void setGenomeAnnotationRef(String genomeAnnotationRef) {
        this.genomeAnnotationRef = genomeAnnotationRef;
    }

    public SearchDomainsGAInput withGenomeAnnotationRef(String genomeAnnotationRef) {
        this.genomeAnnotationRef = genomeAnnotationRef;
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

    public SearchDomainsGAInput withDmsRef(String dmsRef) {
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

    public SearchDomainsGAInput withWs(String ws) {
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

    public SearchDomainsGAInput withOutputResultId(String outputResultId) {
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
        return ((((((((((("SearchDomainsGAInput"+" [genomeAnnotationRef=")+ genomeAnnotationRef)+", dmsRef=")+ dmsRef)+", ws=")+ ws)+", outputResultId=")+ outputResultId)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
