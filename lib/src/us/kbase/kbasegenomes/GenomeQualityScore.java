
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
 * <p>Original spec-file type: GenomeQualityScore</p>
 * <pre>
 * Score_interpretation : fraction_complete - controlled vocabulary managed by API
 *     @optional method_report_ref method_version
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "method",
    "method_report_ref",
    "method_version",
    "score",
    "score_interpretation",
    "timestamp"
})
public class GenomeQualityScore {

    @JsonProperty("method")
    private String method;
    @JsonProperty("method_report_ref")
    private String methodReportRef;
    @JsonProperty("method_version")
    private String methodVersion;
    @JsonProperty("score")
    private String score;
    @JsonProperty("score_interpretation")
    private String scoreInterpretation;
    @JsonProperty("timestamp")
    private String timestamp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    public GenomeQualityScore withMethod(String method) {
        this.method = method;
        return this;
    }

    @JsonProperty("method_report_ref")
    public String getMethodReportRef() {
        return methodReportRef;
    }

    @JsonProperty("method_report_ref")
    public void setMethodReportRef(String methodReportRef) {
        this.methodReportRef = methodReportRef;
    }

    public GenomeQualityScore withMethodReportRef(String methodReportRef) {
        this.methodReportRef = methodReportRef;
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

    public GenomeQualityScore withMethodVersion(String methodVersion) {
        this.methodVersion = methodVersion;
        return this;
    }

    @JsonProperty("score")
    public String getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(String score) {
        this.score = score;
    }

    public GenomeQualityScore withScore(String score) {
        this.score = score;
        return this;
    }

    @JsonProperty("score_interpretation")
    public String getScoreInterpretation() {
        return scoreInterpretation;
    }

    @JsonProperty("score_interpretation")
    public void setScoreInterpretation(String scoreInterpretation) {
        this.scoreInterpretation = scoreInterpretation;
    }

    public GenomeQualityScore withScoreInterpretation(String scoreInterpretation) {
        this.scoreInterpretation = scoreInterpretation;
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

    public GenomeQualityScore withTimestamp(String timestamp) {
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
        return ((((((((((((((("GenomeQualityScore"+" [method=")+ method)+", methodReportRef=")+ methodReportRef)+", methodVersion=")+ methodVersion)+", score=")+ score)+", scoreInterpretation=")+ scoreInterpretation)+", timestamp=")+ timestamp)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
