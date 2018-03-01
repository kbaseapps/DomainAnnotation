
package us.kbase.kbasegenomes;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: Ontology_event</p>
 * <pre>
 * @optional ontology_ref method_version
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "ontology_ref",
    "method",
    "method_version",
    "timestamp"
})
public class OntologyEvent {

    @JsonProperty("id")
    private String id;
    @JsonProperty("ontology_ref")
    private String ontologyRef;
    @JsonProperty("method")
    private String method;
    @JsonProperty("method_version")
    private String methodVersion;
    @JsonProperty("timestamp")
    private String timestamp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public OntologyEvent withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("ontology_ref")
    public String getOntologyRef() {
        return ontologyRef;
    }

    @JsonProperty("ontology_ref")
    public void setOntologyRef(String ontologyRef) {
        this.ontologyRef = ontologyRef;
    }

    public OntologyEvent withOntologyRef(String ontologyRef) {
        this.ontologyRef = ontologyRef;
        return this;
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    public OntologyEvent withMethod(String method) {
        this.method = method;
        return this;
    }

    @JsonProperty("method_version")
    public String getMethodVersion() {
        return methodVersion;
    }

    @JsonProperty("method_version")
    public void setMethodVersion(String methodVersion) {
        this.methodVersion = methodVersion;
    }

    public OntologyEvent withMethodVersion(String methodVersion) {
        this.methodVersion = methodVersion;
        return this;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public OntologyEvent withTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
        return ((((((((((((("OntologyEvent"+" [id=")+ id)+", ontologyRef=")+ ontologyRef)+", method=")+ method)+", methodVersion=")+ methodVersion)+", timestamp=")+ timestamp)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
