
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
 * <p>Original spec-file type: ProteinContainer</p>
 * <pre>
 * The protein container has multiple proteins in it 
 * @optional name description notes
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "protein_container_id",
    "name",
    "description",
    "notes",
    "proteins"
})
public class ProteinContainer {

    @JsonProperty("protein_container_id")
    private java.lang.String proteinContainerId;
    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("proteins")
    private Map<String, Protein> proteins;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("protein_container_id")
    public java.lang.String getProteinContainerId() {
        return proteinContainerId;
    }

    @JsonProperty("protein_container_id")
    public void setProteinContainerId(java.lang.String proteinContainerId) {
        this.proteinContainerId = proteinContainerId;
    }

    public ProteinContainer withProteinContainerId(java.lang.String proteinContainerId) {
        this.proteinContainerId = proteinContainerId;
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

    public ProteinContainer withName(java.lang.String name) {
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

    public ProteinContainer withDescription(java.lang.String description) {
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

    public ProteinContainer withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("proteins")
    public Map<String, Protein> getProteins() {
        return proteins;
    }

    @JsonProperty("proteins")
    public void setProteins(Map<String, Protein> proteins) {
        this.proteins = proteins;
    }

    public ProteinContainer withProteins(Map<String, Protein> proteins) {
        this.proteins = proteins;
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
        return ((((((((((((("ProteinContainer"+" [proteinContainerId=")+ proteinContainerId)+", name=")+ name)+", description=")+ description)+", notes=")+ notes)+", proteins=")+ proteins)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
