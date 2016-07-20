
package domainannotation;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: DomainModel</p>
 * <pre>
 * accession - accession of domain model (e.g., PF00244.1, or COG0001)
 * cdd_id - (optional) in case of CDD its inner id reported by rps-blast program
 * name - name of domain model
 * description - description of domain model
 * length - length of profile
 * model_type - domain model type
 * trusted_cutoff - (optional) trusted cutoff of domain model for HMM libraries
 * @optional cdd_id trusted_cutoff
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "accession",
    "cdd_id",
    "name",
    "description",
    "length",
    "model_type",
    "trusted_cutoff"
})
public class DomainModel {

    @JsonProperty("accession")
    private String accession;
    @JsonProperty("cdd_id")
    private String cddId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("length")
    private Long length;
    @JsonProperty("model_type")
    private String modelType;
    @JsonProperty("trusted_cutoff")
    private Double trustedCutoff;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accession")
    public String getAccession() {
        return accession;
    }

    @JsonProperty("accession")
    public void setAccession(String accession) {
        this.accession = accession;
    }

    public DomainModel withAccession(String accession) {
        this.accession = accession;
        return this;
    }

    @JsonProperty("cdd_id")
    public String getCddId() {
        return cddId;
    }

    @JsonProperty("cdd_id")
    public void setCddId(String cddId) {
        this.cddId = cddId;
    }

    public DomainModel withCddId(String cddId) {
        this.cddId = cddId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public DomainModel withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public DomainModel withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("length")
    public Long getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Long length) {
        this.length = length;
    }

    public DomainModel withLength(Long length) {
        this.length = length;
        return this;
    }

    @JsonProperty("model_type")
    public String getModelType() {
        return modelType;
    }

    @JsonProperty("model_type")
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public DomainModel withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    @JsonProperty("trusted_cutoff")
    public Double getTrustedCutoff() {
        return trustedCutoff;
    }

    @JsonProperty("trusted_cutoff")
    public void setTrustedCutoff(Double trustedCutoff) {
        this.trustedCutoff = trustedCutoff;
    }

    public DomainModel withTrustedCutoff(Double trustedCutoff) {
        this.trustedCutoff = trustedCutoff;
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
        return ((((((((((((((((("DomainModel"+" [accession=")+ accession)+", cddId=")+ cddId)+", name=")+ name)+", description=")+ description)+", length=")+ length)+", modelType=")+ modelType)+", trustedCutoff=")+ trustedCutoff)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
