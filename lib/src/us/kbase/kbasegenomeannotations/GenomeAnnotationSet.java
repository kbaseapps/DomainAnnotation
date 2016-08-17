
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
 * <p>Original spec-file type: GenomeAnnotationSet</p>
 * <pre>
 * The GenomeAnnotationSet object holds references to 1 or more GenomeAnnotations.  It can be used generically to hold multiple GenomeAnnotations.
 * genome_annotation_ref is a WS object reference.
 * @optional name description notes
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "genome_annotation_set_id",
    "name",
    "description",
    "notes",
    "genome_annotations"
})
public class GenomeAnnotationSet {

    @JsonProperty("genome_annotation_set_id")
    private java.lang.String genomeAnnotationSetId;
    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("genome_annotations")
    private Map<String, String> genomeAnnotations;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("genome_annotation_set_id")
    public java.lang.String getGenomeAnnotationSetId() {
        return genomeAnnotationSetId;
    }

    @JsonProperty("genome_annotation_set_id")
    public void setGenomeAnnotationSetId(java.lang.String genomeAnnotationSetId) {
        this.genomeAnnotationSetId = genomeAnnotationSetId;
    }

    public GenomeAnnotationSet withGenomeAnnotationSetId(java.lang.String genomeAnnotationSetId) {
        this.genomeAnnotationSetId = genomeAnnotationSetId;
        return this;
    }

    @JsonProperty("name")
    public java.lang.String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public GenomeAnnotationSet withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public java.lang.String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public GenomeAnnotationSet withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("notes")
    public java.lang.String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    public GenomeAnnotationSet withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("genome_annotations")
    public Map<String, String> getGenomeAnnotations() {
        return genomeAnnotations;
    }

    @JsonProperty("genome_annotations")
    public void setGenomeAnnotations(Map<String, String> genomeAnnotations) {
        this.genomeAnnotations = genomeAnnotations;
    }

    public GenomeAnnotationSet withGenomeAnnotations(Map<String, String> genomeAnnotations) {
        this.genomeAnnotations = genomeAnnotations;
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
        return ((((((((((((("GenomeAnnotationSet"+" [genomeAnnotationSetId=")+ genomeAnnotationSetId)+", name=")+ name)+", description=")+ description)+", notes=")+ notes)+", genomeAnnotations=")+ genomeAnnotations)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
