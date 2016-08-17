
package us.kbase.kbasegenomeannotations;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: mRNA_properties</p>
 * <pre>
 * @optional associated_CDS parent_gene
 * NOTE THAT associated_CDS feature type is there so you go up to the GenomeAnnotation object and pull its CDS info from the feature_containers_map
 * Same thing for the parent gene.
 * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "associated_CDS",
    "parent_gene"
})
public class MRNAProperties {

    @JsonProperty("associated_CDS")
    private us.kbase.common.service.Tuple2 <String, String> associatedCDS;
    @JsonProperty("parent_gene")
    private us.kbase.common.service.Tuple2 <String, String> parentGene;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("associated_CDS")
    public us.kbase.common.service.Tuple2 <String, String> getAssociatedCDS() {
        return associatedCDS;
    }

    @JsonProperty("associated_CDS")
    public void setAssociatedCDS(us.kbase.common.service.Tuple2 <String, String> associatedCDS) {
        this.associatedCDS = associatedCDS;
    }

    public MRNAProperties withAssociatedCDS(us.kbase.common.service.Tuple2 <String, String> associatedCDS) {
        this.associatedCDS = associatedCDS;
        return this;
    }

    @JsonProperty("parent_gene")
    public us.kbase.common.service.Tuple2 <String, String> getParentGene() {
        return parentGene;
    }

    @JsonProperty("parent_gene")
    public void setParentGene(us.kbase.common.service.Tuple2 <String, String> parentGene) {
        this.parentGene = parentGene;
    }

    public MRNAProperties withParentGene(us.kbase.common.service.Tuple2 <String, String> parentGene) {
        this.parentGene = parentGene;
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
        return ((((((("MRNAProperties"+" [associatedCDS=")+ associatedCDS)+", parentGene=")+ parentGene)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
