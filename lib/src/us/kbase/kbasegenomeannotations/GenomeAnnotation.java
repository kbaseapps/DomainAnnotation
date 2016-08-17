
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
import us.kbase.common.service.Tuple7;


/**
 * <p>Original spec-file type: GenomeAnnotation</p>
 * <pre>
 * The GenomeAnnotation is the core central object. It is the annotation of a given organism and assembly.
 * location and environment information (perhaps separate fields for latitude, longitude, altitude)(perhaps we need a MixS object)
 * quality_score could be in genome_annotation_quality_detail instead
 * methodology - Not sure if needed? example would be rast
 * type -refers to representative, reference, user, etc
 * display_sc_name is the scientific_name for display purposes only.  Should go through taxon object for accurate information. as scientific names can change.
 * taxon_ref is a versioned workspace reference
 * annotation_quality_ref is a versioned workspace reference
 * evidence_container_ref would be a versioned workspace reference 
 * protein_container_ref would be a versioned workspace reference
 * assembly_ref would be a versioned workspace reference
 * genbank_handle_ref are handle service references to shock.
 * @metadata ws display_sc_name as Name
 * @metadata ws external_source as Source
 * @metadata ws release as Release
 * @metadata ws original_source_file_name as Source_File_Name
 * @optional external_source external_source_id external_source_origination_date notes environmental_comments quality_score 
 * @optional annotation_quality_ref publications evidence_container_ref methodology seed_roles_ref genbank_handle_ref gff_handle_ref
 * @optional alias_source_counts_map interfeature_relationship_counts_map release original_source_file_name
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "genome_annotation_id",
    "display_sc_name",
    "external_source",
    "external_source_id",
    "external_source_origination_date",
    "release",
    "original_source_file_name",
    "notes",
    "environmental_comments",
    "taxon_ref",
    "assembly_ref",
    "reference_annotation",
    "quality_score",
    "annotation_quality_ref",
    "publications",
    "feature_container_references",
    "protein_container_ref",
    "evidence_container_ref",
    "feature_lookup",
    "methodology",
    "counts_map",
    "seed_roles_ref",
    "type",
    "genbank_handle_ref",
    "gff_handle_ref",
    "alias_source_counts_map",
    "interfeature_relationship_counts_map"
})
public class GenomeAnnotation {

    @JsonProperty("genome_annotation_id")
    private java.lang.String genomeAnnotationId;
    @JsonProperty("display_sc_name")
    private java.lang.String displayScName;
    @JsonProperty("external_source")
    private java.lang.String externalSource;
    @JsonProperty("external_source_id")
    private java.lang.String externalSourceId;
    @JsonProperty("external_source_origination_date")
    private java.lang.String externalSourceOriginationDate;
    @JsonProperty("release")
    private java.lang.String release;
    @JsonProperty("original_source_file_name")
    private java.lang.String originalSourceFileName;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("environmental_comments")
    private java.lang.String environmentalComments;
    @JsonProperty("taxon_ref")
    private java.lang.String taxonRef;
    @JsonProperty("assembly_ref")
    private java.lang.String assemblyRef;
    @JsonProperty("reference_annotation")
    private java.lang.Long referenceAnnotation;
    @JsonProperty("quality_score")
    private Double qualityScore;
    @JsonProperty("annotation_quality_ref")
    private java.lang.String annotationQualityRef;
    @JsonProperty("publications")
    private List<Tuple7 <Long, String, String, String, String, String, String>> publications;
    @JsonProperty("feature_container_references")
    private Map<String, String> featureContainerReferences;
    @JsonProperty("protein_container_ref")
    private java.lang.String proteinContainerRef;
    @JsonProperty("evidence_container_ref")
    private java.lang.String evidenceContainerRef;
    @JsonProperty("feature_lookup")
    private Map<String, List<Tuple2 <String, String>>> featureLookup;
    @JsonProperty("methodology")
    private java.lang.String methodology;
    @JsonProperty("counts_map")
    private Map<String, Long> countsMap;
    @JsonProperty("seed_roles_ref")
    private java.lang.String seedRolesRef;
    @JsonProperty("type")
    private java.lang.String type;
    @JsonProperty("genbank_handle_ref")
    private java.lang.String genbankHandleRef;
    @JsonProperty("gff_handle_ref")
    private java.lang.String gffHandleRef;
    @JsonProperty("alias_source_counts_map")
    private Map<String, Long> aliasSourceCountsMap;
    @JsonProperty("interfeature_relationship_counts_map")
    private Map<String, Long> interfeatureRelationshipCountsMap;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("genome_annotation_id")
    public java.lang.String getGenomeAnnotationId() {
        return genomeAnnotationId;
    }

    @JsonProperty("genome_annotation_id")
    public void setGenomeAnnotationId(java.lang.String genomeAnnotationId) {
        this.genomeAnnotationId = genomeAnnotationId;
    }

    public GenomeAnnotation withGenomeAnnotationId(java.lang.String genomeAnnotationId) {
        this.genomeAnnotationId = genomeAnnotationId;
        return this;
    }

    @JsonProperty("display_sc_name")
    public java.lang.String getDisplayScName() {
        return displayScName;
    }

    @JsonProperty("display_sc_name")
    public void setDisplayScName(java.lang.String displayScName) {
        this.displayScName = displayScName;
    }

    public GenomeAnnotation withDisplayScName(java.lang.String displayScName) {
        this.displayScName = displayScName;
        return this;
    }

    @JsonProperty("external_source")
    public java.lang.String getExternalSource() {
        return externalSource;
    }

    @JsonProperty("external_source")
    public void setExternalSource(java.lang.String externalSource) {
        this.externalSource = externalSource;
    }

    public GenomeAnnotation withExternalSource(java.lang.String externalSource) {
        this.externalSource = externalSource;
        return this;
    }

    @JsonProperty("external_source_id")
    public java.lang.String getExternalSourceId() {
        return externalSourceId;
    }

    @JsonProperty("external_source_id")
    public void setExternalSourceId(java.lang.String externalSourceId) {
        this.externalSourceId = externalSourceId;
    }

    public GenomeAnnotation withExternalSourceId(java.lang.String externalSourceId) {
        this.externalSourceId = externalSourceId;
        return this;
    }

    @JsonProperty("external_source_origination_date")
    public java.lang.String getExternalSourceOriginationDate() {
        return externalSourceOriginationDate;
    }

    @JsonProperty("external_source_origination_date")
    public void setExternalSourceOriginationDate(java.lang.String externalSourceOriginationDate) {
        this.externalSourceOriginationDate = externalSourceOriginationDate;
    }

    public GenomeAnnotation withExternalSourceOriginationDate(java.lang.String externalSourceOriginationDate) {
        this.externalSourceOriginationDate = externalSourceOriginationDate;
        return this;
    }

    @JsonProperty("release")
    public java.lang.String getRelease() {
        return release;
    }

    @JsonProperty("release")
    public void setRelease(java.lang.String release) {
        this.release = release;
    }

    public GenomeAnnotation withRelease(java.lang.String release) {
        this.release = release;
        return this;
    }

    @JsonProperty("original_source_file_name")
    public java.lang.String getOriginalSourceFileName() {
        return originalSourceFileName;
    }

    @JsonProperty("original_source_file_name")
    public void setOriginalSourceFileName(java.lang.String originalSourceFileName) {
        this.originalSourceFileName = originalSourceFileName;
    }

    public GenomeAnnotation withOriginalSourceFileName(java.lang.String originalSourceFileName) {
        this.originalSourceFileName = originalSourceFileName;
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

    public GenomeAnnotation withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("environmental_comments")
    public java.lang.String getEnvironmentalComments() {
        return environmentalComments;
    }

    @JsonProperty("environmental_comments")
    public void setEnvironmentalComments(java.lang.String environmentalComments) {
        this.environmentalComments = environmentalComments;
    }

    public GenomeAnnotation withEnvironmentalComments(java.lang.String environmentalComments) {
        this.environmentalComments = environmentalComments;
        return this;
    }

    @JsonProperty("taxon_ref")
    public java.lang.String getTaxonRef() {
        return taxonRef;
    }

    @JsonProperty("taxon_ref")
    public void setTaxonRef(java.lang.String taxonRef) {
        this.taxonRef = taxonRef;
    }

    public GenomeAnnotation withTaxonRef(java.lang.String taxonRef) {
        this.taxonRef = taxonRef;
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

    public GenomeAnnotation withAssemblyRef(java.lang.String assemblyRef) {
        this.assemblyRef = assemblyRef;
        return this;
    }

    @JsonProperty("reference_annotation")
    public java.lang.Long getReferenceAnnotation() {
        return referenceAnnotation;
    }

    @JsonProperty("reference_annotation")
    public void setReferenceAnnotation(java.lang.Long referenceAnnotation) {
        this.referenceAnnotation = referenceAnnotation;
    }

    public GenomeAnnotation withReferenceAnnotation(java.lang.Long referenceAnnotation) {
        this.referenceAnnotation = referenceAnnotation;
        return this;
    }

    @JsonProperty("quality_score")
    public Double getQualityScore() {
        return qualityScore;
    }

    @JsonProperty("quality_score")
    public void setQualityScore(Double qualityScore) {
        this.qualityScore = qualityScore;
    }

    public GenomeAnnotation withQualityScore(Double qualityScore) {
        this.qualityScore = qualityScore;
        return this;
    }

    @JsonProperty("annotation_quality_ref")
    public java.lang.String getAnnotationQualityRef() {
        return annotationQualityRef;
    }

    @JsonProperty("annotation_quality_ref")
    public void setAnnotationQualityRef(java.lang.String annotationQualityRef) {
        this.annotationQualityRef = annotationQualityRef;
    }

    public GenomeAnnotation withAnnotationQualityRef(java.lang.String annotationQualityRef) {
        this.annotationQualityRef = annotationQualityRef;
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

    public GenomeAnnotation withPublications(List<Tuple7 <Long, String, String, String, String, String, String>> publications) {
        this.publications = publications;
        return this;
    }

    @JsonProperty("feature_container_references")
    public Map<String, String> getFeatureContainerReferences() {
        return featureContainerReferences;
    }

    @JsonProperty("feature_container_references")
    public void setFeatureContainerReferences(Map<String, String> featureContainerReferences) {
        this.featureContainerReferences = featureContainerReferences;
    }

    public GenomeAnnotation withFeatureContainerReferences(Map<String, String> featureContainerReferences) {
        this.featureContainerReferences = featureContainerReferences;
        return this;
    }

    @JsonProperty("protein_container_ref")
    public java.lang.String getProteinContainerRef() {
        return proteinContainerRef;
    }

    @JsonProperty("protein_container_ref")
    public void setProteinContainerRef(java.lang.String proteinContainerRef) {
        this.proteinContainerRef = proteinContainerRef;
    }

    public GenomeAnnotation withProteinContainerRef(java.lang.String proteinContainerRef) {
        this.proteinContainerRef = proteinContainerRef;
        return this;
    }

    @JsonProperty("evidence_container_ref")
    public java.lang.String getEvidenceContainerRef() {
        return evidenceContainerRef;
    }

    @JsonProperty("evidence_container_ref")
    public void setEvidenceContainerRef(java.lang.String evidenceContainerRef) {
        this.evidenceContainerRef = evidenceContainerRef;
    }

    public GenomeAnnotation withEvidenceContainerRef(java.lang.String evidenceContainerRef) {
        this.evidenceContainerRef = evidenceContainerRef;
        return this;
    }

    @JsonProperty("feature_lookup")
    public Map<String, List<Tuple2 <String, String>>> getFeatureLookup() {
        return featureLookup;
    }

    @JsonProperty("feature_lookup")
    public void setFeatureLookup(Map<String, List<Tuple2 <String, String>>> featureLookup) {
        this.featureLookup = featureLookup;
    }

    public GenomeAnnotation withFeatureLookup(Map<String, List<Tuple2 <String, String>>> featureLookup) {
        this.featureLookup = featureLookup;
        return this;
    }

    @JsonProperty("methodology")
    public java.lang.String getMethodology() {
        return methodology;
    }

    @JsonProperty("methodology")
    public void setMethodology(java.lang.String methodology) {
        this.methodology = methodology;
    }

    public GenomeAnnotation withMethodology(java.lang.String methodology) {
        this.methodology = methodology;
        return this;
    }

    @JsonProperty("counts_map")
    public Map<String, Long> getCountsMap() {
        return countsMap;
    }

    @JsonProperty("counts_map")
    public void setCountsMap(Map<String, Long> countsMap) {
        this.countsMap = countsMap;
    }

    public GenomeAnnotation withCountsMap(Map<String, Long> countsMap) {
        this.countsMap = countsMap;
        return this;
    }

    @JsonProperty("seed_roles_ref")
    public java.lang.String getSeedRolesRef() {
        return seedRolesRef;
    }

    @JsonProperty("seed_roles_ref")
    public void setSeedRolesRef(java.lang.String seedRolesRef) {
        this.seedRolesRef = seedRolesRef;
    }

    public GenomeAnnotation withSeedRolesRef(java.lang.String seedRolesRef) {
        this.seedRolesRef = seedRolesRef;
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

    public GenomeAnnotation withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("genbank_handle_ref")
    public java.lang.String getGenbankHandleRef() {
        return genbankHandleRef;
    }

    @JsonProperty("genbank_handle_ref")
    public void setGenbankHandleRef(java.lang.String genbankHandleRef) {
        this.genbankHandleRef = genbankHandleRef;
    }

    public GenomeAnnotation withGenbankHandleRef(java.lang.String genbankHandleRef) {
        this.genbankHandleRef = genbankHandleRef;
        return this;
    }

    @JsonProperty("gff_handle_ref")
    public java.lang.String getGffHandleRef() {
        return gffHandleRef;
    }

    @JsonProperty("gff_handle_ref")
    public void setGffHandleRef(java.lang.String gffHandleRef) {
        this.gffHandleRef = gffHandleRef;
    }

    public GenomeAnnotation withGffHandleRef(java.lang.String gffHandleRef) {
        this.gffHandleRef = gffHandleRef;
        return this;
    }

    @JsonProperty("alias_source_counts_map")
    public Map<String, Long> getAliasSourceCountsMap() {
        return aliasSourceCountsMap;
    }

    @JsonProperty("alias_source_counts_map")
    public void setAliasSourceCountsMap(Map<String, Long> aliasSourceCountsMap) {
        this.aliasSourceCountsMap = aliasSourceCountsMap;
    }

    public GenomeAnnotation withAliasSourceCountsMap(Map<String, Long> aliasSourceCountsMap) {
        this.aliasSourceCountsMap = aliasSourceCountsMap;
        return this;
    }

    @JsonProperty("interfeature_relationship_counts_map")
    public Map<String, Long> getInterfeatureRelationshipCountsMap() {
        return interfeatureRelationshipCountsMap;
    }

    @JsonProperty("interfeature_relationship_counts_map")
    public void setInterfeatureRelationshipCountsMap(Map<String, Long> interfeatureRelationshipCountsMap) {
        this.interfeatureRelationshipCountsMap = interfeatureRelationshipCountsMap;
    }

    public GenomeAnnotation withInterfeatureRelationshipCountsMap(Map<String, Long> interfeatureRelationshipCountsMap) {
        this.interfeatureRelationshipCountsMap = interfeatureRelationshipCountsMap;
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
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((("GenomeAnnotation"+" [genomeAnnotationId=")+ genomeAnnotationId)+", displayScName=")+ displayScName)+", externalSource=")+ externalSource)+", externalSourceId=")+ externalSourceId)+", externalSourceOriginationDate=")+ externalSourceOriginationDate)+", release=")+ release)+", originalSourceFileName=")+ originalSourceFileName)+", notes=")+ notes)+", environmentalComments=")+ environmentalComments)+", taxonRef=")+ taxonRef)+", assemblyRef=")+ assemblyRef)+", referenceAnnotation=")+ referenceAnnotation)+", qualityScore=")+ qualityScore)+", annotationQualityRef=")+ annotationQualityRef)+", publications=")+ publications)+", featureContainerReferences=")+ featureContainerReferences)+", proteinContainerRef=")+ proteinContainerRef)+", evidenceContainerRef=")+ evidenceContainerRef)+", featureLookup=")+ featureLookup)+", methodology=")+ methodology)+", countsMap=")+ countsMap)+", seedRolesRef=")+ seedRolesRef)+", type=")+ type)+", genbankHandleRef=")+ genbankHandleRef)+", gffHandleRef=")+ gffHandleRef)+", aliasSourceCountsMap=")+ aliasSourceCountsMap)+", interfeatureRelationshipCountsMap=")+ interfeatureRelationshipCountsMap)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
