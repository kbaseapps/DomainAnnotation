
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
 * <p>Original spec-file type: EvidenceContainer</p>
 * <pre>
 * EvidenceContainer is a set of evidences.  Technically it could be any list of evidences, but typically it would be set of evidences to support the annotation of a genome.
 * May want publications in here?
 * @optional name description notes
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "evidence_container_id",
    "name",
    "description",
    "notes",
    "evidences"
})
public class EvidenceContainer {

    @JsonProperty("evidence_container_id")
    private java.lang.String evidenceContainerId;
    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("evidences")
    private Map<String, Evidence> evidences;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("evidence_container_id")
    public java.lang.String getEvidenceContainerId() {
        return evidenceContainerId;
    }

    @JsonProperty("evidence_container_id")
    public void setEvidenceContainerId(java.lang.String evidenceContainerId) {
        this.evidenceContainerId = evidenceContainerId;
    }

    public EvidenceContainer withEvidenceContainerId(java.lang.String evidenceContainerId) {
        this.evidenceContainerId = evidenceContainerId;
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

    public EvidenceContainer withName(java.lang.String name) {
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

    public EvidenceContainer withDescription(java.lang.String description) {
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

    public EvidenceContainer withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("evidences")
    public Map<String, Evidence> getEvidences() {
        return evidences;
    }

    @JsonProperty("evidences")
    public void setEvidences(Map<String, Evidence> evidences) {
        this.evidences = evidences;
    }

    public EvidenceContainer withEvidences(Map<String, Evidence> evidences) {
        this.evidences = evidences;
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
        return ((((((((((((("EvidenceContainer"+" [evidenceContainerId=")+ evidenceContainerId)+", name=")+ name)+", description=")+ description)+", notes=")+ notes)+", evidences=")+ evidences)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
