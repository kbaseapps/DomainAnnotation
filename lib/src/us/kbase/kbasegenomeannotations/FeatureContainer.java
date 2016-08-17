
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
 * <p>Original spec-file type: FeatureContainer</p>
 * <pre>
 * A feature_conatainer is a set a features.  Typically this would be used to group annotations of the same type that are associated with the same genome annotation.
 * Technically it can support a bunch of features of different types from different genome_annotations.
 * The feature type is a controlled vocabulary perhaps derived from http://www.insdc.org/files/feature_table.html#7.2
 * type would be controlled vocabulary - Ex: CDS, etc.
 * Note this structure allows for flexible sets.  
 * So type may not be required or a "mixed" type may need to be introduced into the controlled vocabulary.(assuming mixed for now)
 * However it is a requirement that all the features within the container must be referencing the same assembly.
 * @optional name description notes
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "feature_container_id",
    "type",
    "name",
    "description",
    "notes",
    "assembly_ref",
    "features"
})
public class FeatureContainer {

    @JsonProperty("feature_container_id")
    private java.lang.String featureContainerId;
    @JsonProperty("type")
    private java.lang.String type;
    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("assembly_ref")
    private java.lang.String assemblyRef;
    @JsonProperty("features")
    private Map<String, Feature> features;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("feature_container_id")
    public java.lang.String getFeatureContainerId() {
        return featureContainerId;
    }

    @JsonProperty("feature_container_id")
    public void setFeatureContainerId(java.lang.String featureContainerId) {
        this.featureContainerId = featureContainerId;
    }

    public FeatureContainer withFeatureContainerId(java.lang.String featureContainerId) {
        this.featureContainerId = featureContainerId;
        return this;
    }

    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public FeatureContainer withType(java.lang.String type) {
        this.type = type;
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

    public FeatureContainer withName(java.lang.String name) {
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

    public FeatureContainer withDescription(java.lang.String description) {
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

    public FeatureContainer withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("assembly_ref")
    public java.lang.String getAssemblyRef() {
        return assemblyRef;
    }

    @JsonProperty("assembly_ref")
    public void setAssemblyRef(java.lang.String assemblyRef) {
        this.assemblyRef = assemblyRef;
    }

    public FeatureContainer withAssemblyRef(java.lang.String assemblyRef) {
        this.assemblyRef = assemblyRef;
        return this;
    }

    @JsonProperty("features")
    public Map<String, Feature> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(Map<String, Feature> features) {
        this.features = features;
    }

    public FeatureContainer withFeatures(Map<String, Feature> features) {
        this.features = features;
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
        return ((((((((((((((((("FeatureContainer"+" [featureContainerId=")+ featureContainerId)+", type=")+ type)+", name=")+ name)+", description=")+ description)+", notes=")+ notes)+", assemblyRef=")+ assemblyRef)+", features=")+ features)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
