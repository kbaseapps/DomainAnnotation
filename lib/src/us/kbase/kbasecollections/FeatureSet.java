
package us.kbase.kbasecollections;

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
 * <p>Original spec-file type: FeatureSet</p>
 * <pre>
 * @optional description
 * @optional element_ordering
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "description",
    "element_ordering",
    "elements"
})
public class FeatureSet {

    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("element_ordering")
    private List<String> elementOrdering;
    @JsonProperty("elements")
    private Map<String, List<String>> elements;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("description")
    public java.lang.String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public FeatureSet withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("element_ordering")
    public List<String> getElementOrdering() {
        return elementOrdering;
    }

    @JsonProperty("element_ordering")
    public void setElementOrdering(List<String> elementOrdering) {
        this.elementOrdering = elementOrdering;
    }

    public FeatureSet withElementOrdering(List<String> elementOrdering) {
        this.elementOrdering = elementOrdering;
        return this;
    }

    @JsonProperty("elements")
    public Map<String, List<String>> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(Map<String, List<String>> elements) {
        this.elements = elements;
    }

    public FeatureSet withElements(Map<String, List<String>> elements) {
        this.elements = elements;
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
        return ((((((((("FeatureSet"+" [description=")+ description)+", elementOrdering=")+ elementOrdering)+", elements=")+ elements)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
