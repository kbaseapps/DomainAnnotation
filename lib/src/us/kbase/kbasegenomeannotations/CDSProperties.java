
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
 * <p>Original spec-file type: CDS_properties</p>
 * <pre>
 * @optional EC_Number associated_mRNA parent_gene codes_for_protein_ref
 * NOTE THAT associated_mRNA feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
 * Same thing for the parent gene.
 * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "codes_for_protein_ref",
    "EC_Number",
    "associated_mRNA",
    "parent_gene"
})
public class CDSProperties {

    @JsonProperty("codes_for_protein_ref")
    private us.kbase.common.service.Tuple2 <String, String> codesForProteinRef;
    @JsonProperty("EC_Number")
    private java.lang.String ECNumber;
    @JsonProperty("associated_mRNA")
    private us.kbase.common.service.Tuple2 <String, String> associatedMRNA;
    @JsonProperty("parent_gene")
    private us.kbase.common.service.Tuple2 <String, String> parentGene;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("codes_for_protein_ref")
    public us.kbase.common.service.Tuple2 <String, String> getCodesForProteinRef() {
        return codesForProteinRef;
    }

    @JsonProperty("codes_for_protein_ref")
    public void setCodesForProteinRef(us.kbase.common.service.Tuple2 <String, String> codesForProteinRef) {
        this.codesForProteinRef = codesForProteinRef;
    }

    public CDSProperties withCodesForProteinRef(us.kbase.common.service.Tuple2 <String, String> codesForProteinRef) {
        this.codesForProteinRef = codesForProteinRef;
        return this;
    }

    @JsonProperty("EC_Number")
    public java.lang.String getECNumber() {
        return ECNumber;
    }

    @JsonProperty("EC_Number")
    public void setECNumber(java.lang.String ECNumber) {
        this.ECNumber = ECNumber;
    }

    public CDSProperties withECNumber(java.lang.String ECNumber) {
        this.ECNumber = ECNumber;
        return this;
    }

    @JsonProperty("associated_mRNA")
    public us.kbase.common.service.Tuple2 <String, String> getAssociatedMRNA() {
        return associatedMRNA;
    }

    @JsonProperty("associated_mRNA")
    public void setAssociatedMRNA(us.kbase.common.service.Tuple2 <String, String> associatedMRNA) {
        this.associatedMRNA = associatedMRNA;
    }

    public CDSProperties withAssociatedMRNA(us.kbase.common.service.Tuple2 <String, String> associatedMRNA) {
        this.associatedMRNA = associatedMRNA;
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

    public CDSProperties withParentGene(us.kbase.common.service.Tuple2 <String, String> parentGene) {
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
        return ((((((((((("CDSProperties"+" [codesForProteinRef=")+ codesForProteinRef)+", ECNumber=")+ ECNumber)+", associatedMRNA=")+ associatedMRNA)+", parentGene=")+ parentGene)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
