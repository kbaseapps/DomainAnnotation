
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
 * <p>Original spec-file type: TaxonLookup</p>
 * <pre>
 * The TaxonLookup holds first three letters of the scientific names as top level key.  Value is a mapping of scientific name or taxon aliases as the key, and the value is the taxonomy id.  This is populated by the names.dmp file from NCBI.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "taxon_lookup"
})
public class TaxonLookup {

    @JsonProperty("taxon_lookup")
    private Map<String, Map<String, String>> taxonLookup;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("taxon_lookup")
    public Map<String, Map<String, String>> getTaxonLookup() {
        return taxonLookup;
    }

    @JsonProperty("taxon_lookup")
    public void setTaxonLookup(Map<String, Map<String, String>> taxonLookup) {
        this.taxonLookup = taxonLookup;
    }

    public TaxonLookup withTaxonLookup(Map<String, Map<String, String>> taxonLookup) {
        this.taxonLookup = taxonLookup;
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
        return ((((("TaxonLookup"+" [taxonLookup=")+ taxonLookup)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
