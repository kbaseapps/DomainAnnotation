
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
import us.kbase.common.service.Tuple2;


/**
 * <p>Original spec-file type: protein</p>
 * <pre>
 * Protein
 * Included function, but technically a protein may have different functions in different organisms or environments 
 * Note the following:
 * mapping<string domain, <list<list<tuple<int coordinate_start, int coordinate_stop>>>>>; 
 * The outer list is for multiple of the same domain in the same protein.
 * The inner list is to accommodate domains that are non-continuous sequence.
 * What about the following?
 * INTERACTIONS? ACTIVE SITE? ALLOSTERIC SITE? Folding pattern?
 * @optional function domain_locations
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "protein_id",
    "domain_locations",
    "amino_acid_sequence",
    "function",
    "aliases",
    "md5"
})
public class Protein {

    @JsonProperty("protein_id")
    private java.lang.String proteinId;
    @JsonProperty("domain_locations")
    private Map<String, List<List<Tuple2 <Long, Long>>>> domainLocations;
    @JsonProperty("amino_acid_sequence")
    private java.lang.String aminoAcidSequence;
    @JsonProperty("function")
    private java.lang.String function;
    @JsonProperty("aliases")
    private Map<String, List<String>> aliases;
    @JsonProperty("md5")
    private java.lang.String md5;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("protein_id")
    public java.lang.String getProteinId() {
        return proteinId;
    }

    @JsonProperty("protein_id")
    public void setProteinId(java.lang.String proteinId) {
        this.proteinId = proteinId;
    }

    public Protein withProteinId(java.lang.String proteinId) {
        this.proteinId = proteinId;
        return this;
    }

    @JsonProperty("domain_locations")
    public Map<String, List<List<Tuple2 <Long, Long>>>> getDomainLocations() {
        return domainLocations;
    }

    @JsonProperty("domain_locations")
    public void setDomainLocations(Map<String, List<List<Tuple2 <Long, Long>>>> domainLocations) {
        this.domainLocations = domainLocations;
    }

    public Protein withDomainLocations(Map<String, List<List<Tuple2 <Long, Long>>>> domainLocations) {
        this.domainLocations = domainLocations;
        return this;
    }

    @JsonProperty("amino_acid_sequence")
    public java.lang.String getAminoAcidSequence() {
        return aminoAcidSequence;
    }

    @JsonProperty("amino_acid_sequence")
    public void setAminoAcidSequence(java.lang.String aminoAcidSequence) {
        this.aminoAcidSequence = aminoAcidSequence;
    }

    public Protein withAminoAcidSequence(java.lang.String aminoAcidSequence) {
        this.aminoAcidSequence = aminoAcidSequence;
        return this;
    }

    @JsonProperty("function")
    public java.lang.String getFunction() {
        return function;
    }

    @JsonProperty("function")
    public void setFunction(java.lang.String function) {
        this.function = function;
    }

    public Protein withFunction(java.lang.String function) {
        this.function = function;
        return this;
    }

    @JsonProperty("aliases")
    public Map<String, List<String>> getAliases() {
        return aliases;
    }

    @JsonProperty("aliases")
    public void setAliases(Map<String, List<String>> aliases) {
        this.aliases = aliases;
    }

    public Protein withAliases(Map<String, List<String>> aliases) {
        this.aliases = aliases;
        return this;
    }

    @JsonProperty("md5")
    public java.lang.String getMd5() {
        return md5;
    }

    @JsonProperty("md5")
    public void setMd5(java.lang.String md5) {
        this.md5 = md5;
    }

    public Protein withMd5(java.lang.String md5) {
        this.md5 = md5;
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
        return ((((((((((((((("Protein"+" [proteinId=")+ proteinId)+", domainLocations=")+ domainLocations)+", aminoAcidSequence=")+ aminoAcidSequence)+", function=")+ function)+", aliases=")+ aliases)+", md5=")+ md5)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
