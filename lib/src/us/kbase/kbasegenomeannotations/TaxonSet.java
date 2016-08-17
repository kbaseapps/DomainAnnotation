
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
 * <p>Original spec-file type: TaxonSet</p>
 * <pre>
 * The TaxonSet object holds references to 1 or more taxons.  It can be used generically to hold multiple taxons.
 * However the main usage will be to hold a list of children taxons.
 * taxon_ref is a WS object reference.
 * @optional name description notes
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "taxon_set_id",
    "name",
    "description",
    "notes",
    "taxons"
})
public class TaxonSet {

    @JsonProperty("taxon_set_id")
    private java.lang.String taxonSetId;
    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("taxons")
    private Map<String, String> taxons;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("taxon_set_id")
    public java.lang.String getTaxonSetId() {
        return taxonSetId;
    }

    @JsonProperty("taxon_set_id")
    public void setTaxonSetId(java.lang.String taxonSetId) {
        this.taxonSetId = taxonSetId;
    }

    public TaxonSet withTaxonSetId(java.lang.String taxonSetId) {
        this.taxonSetId = taxonSetId;
        return this;
    }

    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public TaxonSet withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public java.lang.String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public TaxonSet withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("notes")
    public java.lang.String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    public TaxonSet withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("taxons")
    public Map<String, String> getTaxons() {
        return taxons;
    }

    @JsonProperty("taxons")
    public void setTaxons(Map<String, String> taxons) {
        this.taxons = taxons;
    }

    public TaxonSet withTaxons(Map<String, String> taxons) {
        this.taxons = taxons;
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
        return ((((((((((((("TaxonSet"+" [taxonSetId=")+ taxonSetId)+", name=")+ name)+", description=")+ description)+", notes=")+ notes)+", taxons=")+ taxons)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
