
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
 * <p>Original spec-file type: InferenceInfo</p>
 * <pre>
 * category;#Maybe a controlled vocabulary
 * type;#Maybe a controlled vocabulary
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "category",
    "type",
    "evidence"
})
public class InferenceInfo {

    @JsonProperty("category")
    private String category;
    @JsonProperty("type")
    private String type;
    @JsonProperty("evidence")
    private String evidence;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public InferenceInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public InferenceInfo withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("evidence")
    public String getEvidence() {
        return evidence;
    }

    @JsonProperty("evidence")
    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    public InferenceInfo withEvidence(String evidence) {
        this.evidence = evidence;
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
        return ((((((((("InferenceInfo"+" [category=")+ category)+", type=")+ type)+", evidence=")+ evidence)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
