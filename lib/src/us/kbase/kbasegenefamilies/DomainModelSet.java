
package us.kbase.kbasegenefamilies;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: DomainModelSet</p>
 * <pre>
 * string set_name - name of model set
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "set_name",
    "domain_libs",
    "domain_prefix_to_dbxref_url",
    "domain_accession_to_description"
})
public class DomainModelSet {

    @JsonProperty("set_name")
    private java.lang.String setName;
    @JsonProperty("domain_libs")
    private Map<String, String> domainLibs;
    @JsonProperty("domain_prefix_to_dbxref_url")
    private Map<String, String> domainPrefixToDbxrefUrl;
    @JsonProperty("domain_accession_to_description")
    private Map<String, String> domainAccessionToDescription;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("set_name")
    public java.lang.String getSetName() {
        return setName;
    }

    @JsonProperty("set_name")
    public void setSetName(java.lang.String setName) {
        this.setName = setName;
    }

    public DomainModelSet withSetName(java.lang.String setName) {
        this.setName = setName;
        return this;
    }

    @JsonProperty("domain_libs")
    public Map<String, String> getDomainLibs() {
        return domainLibs;
    }

    @JsonProperty("domain_libs")
    public void setDomainLibs(Map<String, String> domainLibs) {
        this.domainLibs = domainLibs;
    }

    public DomainModelSet withDomainLibs(Map<String, String> domainLibs) {
        this.domainLibs = domainLibs;
        return this;
    }

    @JsonProperty("domain_prefix_to_dbxref_url")
    public Map<String, String> getDomainPrefixToDbxrefUrl() {
        return domainPrefixToDbxrefUrl;
    }

    @JsonProperty("domain_prefix_to_dbxref_url")
    public void setDomainPrefixToDbxrefUrl(Map<String, String> domainPrefixToDbxrefUrl) {
        this.domainPrefixToDbxrefUrl = domainPrefixToDbxrefUrl;
    }

    public DomainModelSet withDomainPrefixToDbxrefUrl(Map<String, String> domainPrefixToDbxrefUrl) {
        this.domainPrefixToDbxrefUrl = domainPrefixToDbxrefUrl;
        return this;
    }

    @JsonProperty("domain_accession_to_description")
    public Map<String, String> getDomainAccessionToDescription() {
        return domainAccessionToDescription;
    }

    @JsonProperty("domain_accession_to_description")
    public void setDomainAccessionToDescription(Map<String, String> domainAccessionToDescription) {
        this.domainAccessionToDescription = domainAccessionToDescription;
    }

    public DomainModelSet withDomainAccessionToDescription(Map<String, String> domainAccessionToDescription) {
        this.domainAccessionToDescription = domainAccessionToDescription;
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
        return ((((((((((("DomainModelSet"+" [setName=")+ setName)+", domainLibs=")+ domainLibs)+", domainPrefixToDbxrefUrl=")+ domainPrefixToDbxrefUrl)+", domainAccessionToDescription=")+ domainAccessionToDescription)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
