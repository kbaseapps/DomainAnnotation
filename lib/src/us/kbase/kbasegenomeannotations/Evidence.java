
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
 * <p>Original spec-file type: evidence</p>
 * <pre>
 * Evidence is information that supports some other bit of information or assertion
 * Generic WS reference, not to a specific typed object.  A workspace reference.
 * Evidence type - structural or functional?
 * @optional description supporting_objects
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "evidence_id",
    "description",
    "evidence_type",
    "supporting_objects"
})
public class Evidence {

    @JsonProperty("evidence_id")
    private java.lang.String evidenceId;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("evidence_type")
    private java.lang.String evidenceType;
    @JsonProperty("supporting_objects")
    private List<String> supportingObjects;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("evidence_id")
    public java.lang.String getEvidenceId() {
        return evidenceId;
    }

    @JsonProperty("evidence_id")
    public void setEvidenceId(java.lang.String evidenceId) {
        this.evidenceId = evidenceId;
    }

    public Evidence withEvidenceId(java.lang.String evidenceId) {
        this.evidenceId = evidenceId;
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

    public Evidence withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("evidence_type")
    public java.lang.String getEvidenceType() {
        return evidenceType;
    }

    @JsonProperty("evidence_type")
    public void setEvidenceType(java.lang.String evidenceType) {
        this.evidenceType = evidenceType;
    }

    public Evidence withEvidenceType(java.lang.String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }

    @JsonProperty("supporting_objects")
    public List<String> getSupportingObjects() {
        return supportingObjects;
    }

    @JsonProperty("supporting_objects")
    public void setSupportingObjects(List<String> supportingObjects) {
        this.supportingObjects = supportingObjects;
    }

    public Evidence withSupportingObjects(List<String> supportingObjects) {
        this.supportingObjects = supportingObjects;
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
        return ((((((((((("Evidence"+" [evidenceId=")+ evidenceId)+", description=")+ description)+", evidenceType=")+ evidenceType)+", supportingObjects=")+ supportingObjects)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
