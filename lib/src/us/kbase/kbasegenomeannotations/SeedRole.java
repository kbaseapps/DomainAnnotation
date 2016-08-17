
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
 * <p>Original spec-file type: seed_role</p>
 * <pre>
 * Annotation pipeline specific : Seed_role_element
 * @optional variant_code role
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "role",
    "subsystem",
    "variant_code"
})
public class SeedRole {

    @JsonProperty("role")
    private String role;
    @JsonProperty("subsystem")
    private String subsystem;
    @JsonProperty("variant_code")
    private String variantCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public SeedRole withRole(String role) {
        this.role = role;
        return this;
    }

    @JsonProperty("subsystem")
    public String getSubsystem() {
        return subsystem;
    }

    @JsonProperty("subsystem")
    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    public SeedRole withSubsystem(String subsystem) {
        this.subsystem = subsystem;
        return this;
    }

    @JsonProperty("variant_code")
    public String getVariantCode() {
        return variantCode;
    }

    @JsonProperty("variant_code")
    public void setVariantCode(String variantCode) {
        this.variantCode = variantCode;
    }

    public SeedRole withVariantCode(String variantCode) {
        this.variantCode = variantCode;
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
        return ((((((((("SeedRole"+" [role=")+ role)+", subsystem=")+ subsystem)+", variantCode=")+ variantCode)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
