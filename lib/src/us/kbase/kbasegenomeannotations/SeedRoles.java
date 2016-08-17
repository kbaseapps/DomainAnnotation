
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
 * <p>Original spec-file type: SeedRoles</p>
 * <pre>
 * Annotation pipeline specific : Seed_roles
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "feature_roles"
})
public class SeedRoles {

    @JsonProperty("feature_roles")
    private Map<String, List<SeedRole>> featureRoles;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("feature_roles")
    public Map<String, List<SeedRole>> getFeatureRoles() {
        return featureRoles;
    }

    @JsonProperty("feature_roles")
    public void setFeatureRoles(Map<String, List<SeedRole>> featureRoles) {
        this.featureRoles = featureRoles;
    }

    public SeedRoles withFeatureRoles(Map<String, List<SeedRole>> featureRoles) {
        this.featureRoles = featureRoles;
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
        return ((((("SeedRoles"+" [featureRoles=")+ featureRoles)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
