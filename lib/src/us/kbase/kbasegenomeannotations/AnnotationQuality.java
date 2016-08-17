
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
 * <p>Original spec-file type: AnnotationQuality</p>
 * <pre>
 * The AnnotationQuality is an object that has details about the quality of and completeness of the annotation
 * @optional data_quality_warnings metadata_completeness_warnings
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "metadata_completeness",
    "metadata_completeness_warnings",
    "data_quality",
    "data_quality_warnings",
    "feature_types_present",
    "evidence_supported"
})
public class AnnotationQuality {

    @JsonProperty("metadata_completeness")
    private Double metadataCompleteness;
    @JsonProperty("metadata_completeness_warnings")
    private List<String> metadataCompletenessWarnings;
    @JsonProperty("data_quality")
    private Double dataQuality;
    @JsonProperty("data_quality_warnings")
    private List<String> dataQualityWarnings;
    @JsonProperty("feature_types_present")
    private Long featureTypesPresent;
    @JsonProperty("evidence_supported")
    private Long evidenceSupported;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("metadata_completeness")
    public Double getMetadataCompleteness() {
        return metadataCompleteness;
    }

    @JsonProperty("metadata_completeness")
    public void setMetadataCompleteness(Double metadataCompleteness) {
        this.metadataCompleteness = metadataCompleteness;
    }

    public AnnotationQuality withMetadataCompleteness(Double metadataCompleteness) {
        this.metadataCompleteness = metadataCompleteness;
        return this;
    }

    @JsonProperty("metadata_completeness_warnings")
    public List<String> getMetadataCompletenessWarnings() {
        return metadataCompletenessWarnings;
    }

    @JsonProperty("metadata_completeness_warnings")
    public void setMetadataCompletenessWarnings(List<String> metadataCompletenessWarnings) {
        this.metadataCompletenessWarnings = metadataCompletenessWarnings;
    }

    public AnnotationQuality withMetadataCompletenessWarnings(List<String> metadataCompletenessWarnings) {
        this.metadataCompletenessWarnings = metadataCompletenessWarnings;
        return this;
    }

    @JsonProperty("data_quality")
    public Double getDataQuality() {
        return dataQuality;
    }

    @JsonProperty("data_quality")
    public void setDataQuality(Double dataQuality) {
        this.dataQuality = dataQuality;
    }

    public AnnotationQuality withDataQuality(Double dataQuality) {
        this.dataQuality = dataQuality;
        return this;
    }

    @JsonProperty("data_quality_warnings")
    public List<String> getDataQualityWarnings() {
        return dataQualityWarnings;
    }

    @JsonProperty("data_quality_warnings")
    public void setDataQualityWarnings(List<String> dataQualityWarnings) {
        this.dataQualityWarnings = dataQualityWarnings;
    }

    public AnnotationQuality withDataQualityWarnings(List<String> dataQualityWarnings) {
        this.dataQualityWarnings = dataQualityWarnings;
        return this;
    }

    @JsonProperty("feature_types_present")
    public Long getFeatureTypesPresent() {
        return featureTypesPresent;
    }

    @JsonProperty("feature_types_present")
    public void setFeatureTypesPresent(Long featureTypesPresent) {
        this.featureTypesPresent = featureTypesPresent;
    }

    public AnnotationQuality withFeatureTypesPresent(Long featureTypesPresent) {
        this.featureTypesPresent = featureTypesPresent;
        return this;
    }

    @JsonProperty("evidence_supported")
    public Long getEvidenceSupported() {
        return evidenceSupported;
    }

    @JsonProperty("evidence_supported")
    public void setEvidenceSupported(Long evidenceSupported) {
        this.evidenceSupported = evidenceSupported;
    }

    public AnnotationQuality withEvidenceSupported(Long evidenceSupported) {
        this.evidenceSupported = evidenceSupported;
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
        return ((((((((((((((("AnnotationQuality"+" [metadataCompleteness=")+ metadataCompleteness)+", metadataCompletenessWarnings=")+ metadataCompletenessWarnings)+", dataQuality=")+ dataQuality)+", dataQualityWarnings=")+ dataQualityWarnings)+", featureTypesPresent=")+ featureTypesPresent)+", evidenceSupported=")+ evidenceSupported)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
