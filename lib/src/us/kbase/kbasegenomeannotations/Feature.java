
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
import us.kbase.common.service.Tuple2;
import us.kbase.common.service.Tuple4;
import us.kbase.common.service.Tuple7;


/**
 * <p>Original spec-file type: feature</p>
 * <pre>
 * Feature is a individual feature of the Genome annotation (Ex: a CDS, a promoter, etc)
 * It has specific subobjects for particular feature types. (ex: CDS, mRNA, gene, operon, pathway) 
 * This is expandable in the future to include more specific properties for more types.
 *  
 * For quality_warnings do we want severity (warnings, errors)?
 * Do all features have coordinates? Shuffleons do and do not Genbank has a mobile_element_type feature type.
 * Do we want to try and capture motifs. Orthologs? Orthologs get a little tricky in terms of multiple annotations for the same genome and taxonomy.
 * evidence_container_ref is a workspace reference.  The list of strings is ids into EvidenceContainer mapping.
 *  
 * @optional function aliases publications notes inference feature_quality evidences 
 * @optional CDS_properties mRNA_properties gene_properties trans_splicing
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "feature_id",
    "locations",
    "type",
    "function",
    "md5",
    "dna_sequence",
    "dna_sequence_length",
    "publications",
    "aliases",
    "notes",
    "inference",
    "feature_quality",
    "quality_warnings",
    "evidences",
    "CDS_properties",
    "mRNA_properties",
    "gene_properties",
    "trans_splicing"
})
public class Feature {

    @JsonProperty("feature_id")
    private java.lang.String featureId;
    @JsonProperty("locations")
    private List<Tuple4 <String, Long, String, Long>> locations;
    @JsonProperty("type")
    private java.lang.String type;
    @JsonProperty("function")
    private java.lang.String function;
    @JsonProperty("md5")
    private java.lang.String md5;
    @JsonProperty("dna_sequence")
    private java.lang.String dnaSequence;
    @JsonProperty("dna_sequence_length")
    private java.lang.Long dnaSequenceLength;
    @JsonProperty("publications")
    private List<Tuple7 <Long, String, String, String, String, String, String>> publications;
    @JsonProperty("aliases")
    private Map<String, List<String>> aliases;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("inference")
    private java.lang.String inference;
    @JsonProperty("feature_quality")
    private Double featureQuality;
    @JsonProperty("quality_warnings")
    private List<String> qualityWarnings;
    @JsonProperty("evidences")
    private Tuple2 <String, List<String>> evidences;
    /**
     * <p>Original spec-file type: CDS_properties</p>
     * <pre>
     * @optional EC_Number associated_mRNA parent_gene codes_for_protein_ref
     * NOTE THAT associated_mRNA feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("CDS_properties")
    private us.kbase.kbasegenomeannotations.CDSProperties CDSProperties;
    /**
     * <p>Original spec-file type: mRNA_properties</p>
     * <pre>
     * @optional associated_CDS parent_gene
     * NOTE THAT associated_CDS feature type is there so you go up to the GenomeAnnotation object and pull its CDS info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("mRNA_properties")
    private MRNAProperties mRNAProperties;
    /**
     * <p>Original spec-file type: gene_properties</p>
     * <pre>
     * @optional children_CDS children_mRNA
     * NOTE THAT Children * feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("gene_properties")
    private GeneProperties geneProperties;
    @JsonProperty("trans_splicing")
    private java.lang.Long transSplicing;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("feature_id")
    public java.lang.String getFeatureId() {
        return featureId;
    }

    @JsonProperty("feature_id")
    public void setFeatureId(java.lang.String featureId) {
        this.featureId = featureId;
    }

    public Feature withFeatureId(java.lang.String featureId) {
        this.featureId = featureId;
        return this;
    }

    @JsonProperty("locations")
    public List<Tuple4 <String, Long, String, Long>> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Tuple4 <String, Long, String, Long>> locations) {
        this.locations = locations;
    }

    public Feature withLocations(List<Tuple4 <String, Long, String, Long>> locations) {
        this.locations = locations;
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

    public Feature withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("function")
    public java.lang.String getFunction() {
        return function;
    }

    @JsonProperty("function")
    public void setFunction(java.lang.String function) {
        this.function = function;
    }

    public Feature withFunction(java.lang.String function) {
        this.function = function;
        return this;
    }

    @JsonProperty("md5")
    public java.lang.String getMd5() {
        return md5;
    }

    @JsonProperty("md5")
    public void setMd5(java.lang.String md5) {
        this.md5 = md5;
    }

    public Feature withMd5(java.lang.String md5) {
        this.md5 = md5;
        return this;
    }

    @JsonProperty("dna_sequence")
    public java.lang.String getDnaSequence() {
        return dnaSequence;
    }

    @JsonProperty("dna_sequence")
    public void setDnaSequence(java.lang.String dnaSequence) {
        this.dnaSequence = dnaSequence;
    }

    public Feature withDnaSequence(java.lang.String dnaSequence) {
        this.dnaSequence = dnaSequence;
        return this;
    }

    @JsonProperty("dna_sequence_length")
    public java.lang.Long getDnaSequenceLength() {
        return dnaSequenceLength;
    }

    @JsonProperty("dna_sequence_length")
    public void setDnaSequenceLength(java.lang.Long dnaSequenceLength) {
        this.dnaSequenceLength = dnaSequenceLength;
    }

    public Feature withDnaSequenceLength(java.lang.Long dnaSequenceLength) {
        this.dnaSequenceLength = dnaSequenceLength;
        return this;
    }

    @JsonProperty("publications")
    public List<Tuple7 <Long, String, String, String, String, String, String>> getPublications() {
        return publications;
    }

    @JsonProperty("publications")
    public void setPublications(List<Tuple7 <Long, String, String, String, String, String, String>> publications) {
        this.publications = publications;
    }

    public Feature withPublications(List<Tuple7 <Long, String, String, String, String, String, String>> publications) {
        this.publications = publications;
        return this;
    }

    @JsonProperty("aliases")
    public Map<String, List<String>> getAliases() {
        return aliases;
    }

    @JsonProperty("aliases")
    public void setAliases(Map<String, List<String>> aliases) {
        this.aliases = aliases;
    }

    public Feature withAliases(Map<String, List<String>> aliases) {
        this.aliases = aliases;
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

    public Feature withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("inference")
    public java.lang.String getInference() {
        return inference;
    }

    @JsonProperty("inference")
    public void setInference(java.lang.String inference) {
        this.inference = inference;
    }

    public Feature withInference(java.lang.String inference) {
        this.inference = inference;
        return this;
    }

    @JsonProperty("feature_quality")
    public Double getFeatureQuality() {
        return featureQuality;
    }

    @JsonProperty("feature_quality")
    public void setFeatureQuality(Double featureQuality) {
        this.featureQuality = featureQuality;
    }

    public Feature withFeatureQuality(Double featureQuality) {
        this.featureQuality = featureQuality;
        return this;
    }

    @JsonProperty("quality_warnings")
    public List<String> getQualityWarnings() {
        return qualityWarnings;
    }

    @JsonProperty("quality_warnings")
    public void setQualityWarnings(List<String> qualityWarnings) {
        this.qualityWarnings = qualityWarnings;
    }

    public Feature withQualityWarnings(List<String> qualityWarnings) {
        this.qualityWarnings = qualityWarnings;
        return this;
    }

    @JsonProperty("evidences")
    public Tuple2 <String, List<String>> getEvidences() {
        return evidences;
    }

    @JsonProperty("evidences")
    public void setEvidences(Tuple2 <String, List<String>> evidences) {
        this.evidences = evidences;
    }

    public Feature withEvidences(Tuple2 <String, List<String>> evidences) {
        this.evidences = evidences;
        return this;
    }

    /**
     * <p>Original spec-file type: CDS_properties</p>
     * <pre>
     * @optional EC_Number associated_mRNA parent_gene codes_for_protein_ref
     * NOTE THAT associated_mRNA feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("CDS_properties")
    public us.kbase.kbasegenomeannotations.CDSProperties getCDSProperties() {
        return CDSProperties;
    }

    /**
     * <p>Original spec-file type: CDS_properties</p>
     * <pre>
     * @optional EC_Number associated_mRNA parent_gene codes_for_protein_ref
     * NOTE THAT associated_mRNA feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("CDS_properties")
    public void setCDSProperties(us.kbase.kbasegenomeannotations.CDSProperties CDSProperties) {
        this.CDSProperties = CDSProperties;
    }

    public Feature withCDSProperties(us.kbase.kbasegenomeannotations.CDSProperties CDSProperties) {
        this.CDSProperties = CDSProperties;
        return this;
    }

    /**
     * <p>Original spec-file type: mRNA_properties</p>
     * <pre>
     * @optional associated_CDS parent_gene
     * NOTE THAT associated_CDS feature type is there so you go up to the GenomeAnnotation object and pull its CDS info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("mRNA_properties")
    public MRNAProperties getMRNAProperties() {
        return mRNAProperties;
    }

    /**
     * <p>Original spec-file type: mRNA_properties</p>
     * <pre>
     * @optional associated_CDS parent_gene
     * NOTE THAT associated_CDS feature type is there so you go up to the GenomeAnnotation object and pull its CDS info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("mRNA_properties")
    public void setMRNAProperties(MRNAProperties mRNAProperties) {
        this.mRNAProperties = mRNAProperties;
    }

    public Feature withMRNAProperties(MRNAProperties mRNAProperties) {
        this.mRNAProperties = mRNAProperties;
        return this;
    }

    /**
     * <p>Original spec-file type: gene_properties</p>
     * <pre>
     * @optional children_CDS children_mRNA
     * NOTE THAT Children * feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("gene_properties")
    public GeneProperties getGeneProperties() {
        return geneProperties;
    }

    /**
     * <p>Original spec-file type: gene_properties</p>
     * <pre>
     * @optional children_CDS children_mRNA
     * NOTE THAT Children * feature type is there so you go up to the GenomeAnnotation object and pull its mRNA info from the feature_containers_map
     * Same thing for the parent gene.
     * This design choice was made because of the chicken and egg scenario between CDS, mRNA and Gene
     * </pre>
     * 
     */
    @JsonProperty("gene_properties")
    public void setGeneProperties(GeneProperties geneProperties) {
        this.geneProperties = geneProperties;
    }

    public Feature withGeneProperties(GeneProperties geneProperties) {
        this.geneProperties = geneProperties;
        return this;
    }

    @JsonProperty("trans_splicing")
    public java.lang.Long getTransSplicing() {
        return transSplicing;
    }

    @JsonProperty("trans_splicing")
    public void setTransSplicing(java.lang.Long transSplicing) {
        this.transSplicing = transSplicing;
    }

    public Feature withTransSplicing(java.lang.Long transSplicing) {
        this.transSplicing = transSplicing;
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
        return ((((((((((((((((((((((((((((((((((((((("Feature"+" [featureId=")+ featureId)+", locations=")+ locations)+", type=")+ type)+", function=")+ function)+", md5=")+ md5)+", dnaSequence=")+ dnaSequence)+", dnaSequenceLength=")+ dnaSequenceLength)+", publications=")+ publications)+", aliases=")+ aliases)+", notes=")+ notes)+", inference=")+ inference)+", featureQuality=")+ featureQuality)+", qualityWarnings=")+ qualityWarnings)+", evidences=")+ evidences)+", CDSProperties=")+ CDSProperties)+", mRNAProperties=")+ mRNAProperties)+", geneProperties=")+ geneProperties)+", transSplicing=")+ transSplicing)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
