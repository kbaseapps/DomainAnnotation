
package us.kbase.kbasegenomeannotations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: gene_properties</p>
 * <pre>
 * @optional children_CDS children_mRNA
 * NOTE THAT Children * feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
 * Same thing for the parent gene.
 * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "children_CDS",
    "children_mRNA"
})
public class GeneProperties {

    @JsonProperty("children_CDS")
    private List<us.kbase.common.service.Tuple2 <String, String>> childrenCDS;
    @JsonProperty("children_mRNA")
    private List<us.kbase.common.service.Tuple2 <String, String>> childrenMRNA;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("children_CDS")
    public List<us.kbase.common.service.Tuple2 <String, String>> getChildrenCDS() {
        return childrenCDS;
    }

    @JsonProperty("children_CDS")
    public void setChildrenCDS(List<us.kbase.common.service.Tuple2 <String, String>> childrenCDS) {
        this.childrenCDS = childrenCDS;
    }

    public GeneProperties withChildrenCDS(List<us.kbase.common.service.Tuple2 <String, String>> childrenCDS) {
        this.childrenCDS = childrenCDS;
        return this;
    }

    @JsonProperty("children_mRNA")
    public List<us.kbase.common.service.Tuple2 <String, String>> getChildrenMRNA() {
        return childrenMRNA;
    }

    @JsonProperty("children_mRNA")
    public void setChildrenMRNA(List<us.kbase.common.service.Tuple2 <String, String>> childrenMRNA) {
        this.childrenMRNA = childrenMRNA;
    }

    public GeneProperties withChildrenMRNA(List<us.kbase.common.service.Tuple2 <String, String>> childrenMRNA) {
        this.childrenMRNA = childrenMRNA;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((("GeneProperties"+" [childrenCDS=")+ childrenCDS)+", childrenMRNA=")+ childrenMRNA)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
