
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
 * <p>Original spec-file type: GenomeAnnotationSummary</p>
 * <pre>
 * The GenomeAnnotationSummary is a hidden object that's purpose is to optimize landing page performance. 
 * This object needs to be generated every time a new version of the genome annotation is generated.
 * dropped alias_source_counts_map for now
 * @optional organism_aliases genetic_code scientific_lineage assembly_source assembly_source_id assembly_source_origination_date
 * @optional external_source external_source_origination_date original_source_file_name
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "genome_annotation_ref",
    "scientific_name",
    "taxonomy_id",
    "kingdom",
    "scientific_lineage",
    "genetic_code",
    "organism_aliases",
    "assembly_source",
    "assembly_source_id",
    "assembly_source_origination_date",
    "gc_content",
    "dna_size",
    "num_contigs",
    "contig_ids",
    "external_source",
    "external_source_origination_date",
    "release",
    "original_source_file_name",
    "feature_counts_map"
})
public class GenomeAnnotationSummary {

    @JsonProperty("genome_annotation_ref")
    private java.lang.String genomeAnnotationRef;
    @JsonProperty("scientific_name")
    private java.lang.String scientificName;
    @JsonProperty("taxonomy_id")
    private java.lang.Long taxonomyId;
    @JsonProperty("kingdom")
    private java.lang.String kingdom;
    @JsonProperty("scientific_lineage")
    private java.lang.String scientificLineage;
    @JsonProperty("genetic_code")
    private java.lang.Long geneticCode;
    @JsonProperty("organism_aliases")
    private List<String> organismAliases;
    @JsonProperty("assembly_source")
    private java.lang.String assemblySource;
    @JsonProperty("assembly_source_id")
    private java.lang.String assemblySourceId;
    @JsonProperty("assembly_source_origination_date")
    private java.lang.String assemblySourceOriginationDate;
    @JsonProperty("gc_content")
    private Double gcContent;
    @JsonProperty("dna_size")
    private java.lang.Long dnaSize;
    @JsonProperty("num_contigs")
    private java.lang.Long numContigs;
    @JsonProperty("contig_ids")
    private List<String> contigIds;
    @JsonProperty("external_source")
    private java.lang.String externalSource;
    @JsonProperty("external_source_origination_date")
    private java.lang.String externalSourceOriginationDate;
    @JsonProperty("release")
    private java.lang.String release;
    @JsonProperty("original_source_file_name")
    private java.lang.String originalSourceFileName;
    @JsonProperty("feature_counts_map")
    private Map<String, Long> featureCountsMap;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("genome_annotation_ref")
    public java.lang.String getGenomeAnnotationRef() {
        return genomeAnnotationRef;
    }

    @JsonProperty("genome_annotation_ref")
    public void setGenomeAnnotationRef(java.lang.String genomeAnnotationRef) {
        this.genomeAnnotationRef = genomeAnnotationRef;
    }

    public GenomeAnnotationSummary withGenomeAnnotationRef(java.lang.String genomeAnnotationRef) {
        this.genomeAnnotationRef = genomeAnnotationRef;
        return this;
    }

    @JsonProperty("scientific_name")
    public java.lang.String getScientificName() {
        return scientificName;
    }

    @JsonProperty("scientific_name")
    public void setScientificName(java.lang.String scientificName) {
        this.scientificName = scientificName;
    }

    public GenomeAnnotationSummary withScientificName(java.lang.String scientificName) {
        this.scientificName = scientificName;
        return this;
    }

    @JsonProperty("taxonomy_id")
    public java.lang.Long getTaxonomyId() {
        return taxonomyId;
    }

    @JsonProperty("taxonomy_id")
    public void setTaxonomyId(java.lang.Long taxonomyId) {
        this.taxonomyId = taxonomyId;
    }

    public GenomeAnnotationSummary withTaxonomyId(java.lang.Long taxonomyId) {
        this.taxonomyId = taxonomyId;
        return this;
    }

    @JsonProperty("kingdom")
    public java.lang.String getKingdom() {
        return kingdom;
    }

    @JsonProperty("kingdom")
    public void setKingdom(java.lang.String kingdom) {
        this.kingdom = kingdom;
    }

    public GenomeAnnotationSummary withKingdom(java.lang.String kingdom) {
        this.kingdom = kingdom;
        return this;
    }

    @JsonProperty("scientific_lineage")
    public java.lang.String getScientificLineage() {
        return scientificLineage;
    }

    @JsonProperty("scientific_lineage")
    public void setScientificLineage(java.lang.String scientificLineage) {
        this.scientificLineage = scientificLineage;
    }

    public GenomeAnnotationSummary withScientificLineage(java.lang.String scientificLineage) {
        this.scientificLineage = scientificLineage;
        return this;
    }

    @JsonProperty("genetic_code")
    public java.lang.Long getGeneticCode() {
        return geneticCode;
    }

    @JsonProperty("genetic_code")
    public void setGeneticCode(java.lang.Long geneticCode) {
        this.geneticCode = geneticCode;
    }

    public GenomeAnnotationSummary withGeneticCode(java.lang.Long geneticCode) {
        this.geneticCode = geneticCode;
        return this;
    }

    @JsonProperty("organism_aliases")
    public List<String> getOrganismAliases() {
        return organismAliases;
    }

    @JsonProperty("organism_aliases")
    public void setOrganismAliases(List<String> organismAliases) {
        this.organismAliases = organismAliases;
    }

    public GenomeAnnotationSummary withOrganismAliases(List<String> organismAliases) {
        this.organismAliases = organismAliases;
        return this;
    }

    @JsonProperty("assembly_source")
    public java.lang.String getAssemblySource() {
        return assemblySource;
    }

    @JsonProperty("assembly_source")
    public void setAssemblySource(java.lang.String assemblySource) {
        this.assemblySource = assemblySource;
    }

    public GenomeAnnotationSummary withAssemblySource(java.lang.String assemblySource) {
        this.assemblySource = assemblySource;
        return this;
    }

    @JsonProperty("assembly_source_id")
    public java.lang.String getAssemblySourceId() {
        return assemblySourceId;
    }

    @JsonProperty("assembly_source_id")
    public void setAssemblySourceId(java.lang.String assemblySourceId) {
        this.assemblySourceId = assemblySourceId;
    }

    public GenomeAnnotationSummary withAssemblySourceId(java.lang.String assemblySourceId) {
        this.assemblySourceId = assemblySourceId;
        return this;
    }

    @JsonProperty("assembly_source_origination_date")
    public java.lang.String getAssemblySourceOriginationDate() {
        return assemblySourceOriginationDate;
    }

    @JsonProperty("assembly_source_origination_date")
    public void setAssemblySourceOriginationDate(java.lang.String assemblySourceOriginationDate) {
        this.assemblySourceOriginationDate = assemblySourceOriginationDate;
    }

    public GenomeAnnotationSummary withAssemblySourceOriginationDate(java.lang.String assemblySourceOriginationDate) {
        this.assemblySourceOriginationDate = assemblySourceOriginationDate;
        return this;
    }

    @JsonProperty("gc_content")
    public Double getGcContent() {
        return gcContent;
    }

    @JsonProperty("gc_content")
    public void setGcContent(Double gcContent) {
        this.gcContent = gcContent;
    }

    public GenomeAnnotationSummary withGcContent(Double gcContent) {
        this.gcContent = gcContent;
        return this;
    }

    @JsonProperty("dna_size")
    public java.lang.Long getDnaSize() {
        return dnaSize;
    }

    @JsonProperty("dna_size")
    public void setDnaSize(java.lang.Long dnaSize) {
        this.dnaSize = dnaSize;
    }

    public GenomeAnnotationSummary withDnaSize(java.lang.Long dnaSize) {
        this.dnaSize = dnaSize;
        return this;
    }

    @JsonProperty("num_contigs")
    public java.lang.Long getNumContigs() {
        return numContigs;
    }

    @JsonProperty("num_contigs")
    public void setNumContigs(java.lang.Long numContigs) {
        this.numContigs = numContigs;
    }

    public GenomeAnnotationSummary withNumContigs(java.lang.Long numContigs) {
        this.numContigs = numContigs;
        return this;
    }

    @JsonProperty("contig_ids")
    public List<String> getContigIds() {
        return contigIds;
    }

    @JsonProperty("contig_ids")
    public void setContigIds(List<String> contigIds) {
        this.contigIds = contigIds;
    }

    public GenomeAnnotationSummary withContigIds(List<String> contigIds) {
        this.contigIds = contigIds;
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

    public GenomeAnnotationSummary withExternalSource(java.lang.String externalSource) {
        this.externalSource = externalSource;
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

    public GenomeAnnotationSummary withExternalSourceOriginationDate(java.lang.String externalSourceOriginationDate) {
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

    public GenomeAnnotationSummary withRelease(java.lang.String release) {
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

    public GenomeAnnotationSummary withOriginalSourceFileName(java.lang.String originalSourceFileName) {
        this.originalSourceFileName = originalSourceFileName;
        return this;
    }

    @JsonProperty("feature_counts_map")
    public Map<String, Long> getFeatureCountsMap() {
        return featureCountsMap;
    }

    @JsonProperty("feature_counts_map")
    public void setFeatureCountsMap(Map<String, Long> featureCountsMap) {
        this.featureCountsMap = featureCountsMap;
    }

    public GenomeAnnotationSummary withFeatureCountsMap(Map<String, Long> featureCountsMap) {
        this.featureCountsMap = featureCountsMap;
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
        return ((((((((((((((((((((((((((((((((((((((((("GenomeAnnotationSummary"+" [genomeAnnotationRef=")+ genomeAnnotationRef)+", scientificName=")+ scientificName)+", taxonomyId=")+ taxonomyId)+", kingdom=")+ kingdom)+", scientificLineage=")+ scientificLineage)+", geneticCode=")+ geneticCode)+", organismAliases=")+ organismAliases)+", assemblySource=")+ assemblySource)+", assemblySourceId=")+ assemblySourceId)+", assemblySourceOriginationDate=")+ assemblySourceOriginationDate)+", gcContent=")+ gcContent)+", dnaSize=")+ dnaSize)+", numContigs=")+ numContigs)+", contigIds=")+ contigIds)+", externalSource=")+ externalSource)+", externalSourceOriginationDate=")+ externalSourceOriginationDate)+", release=")+ release)+", originalSourceFileName=")+ originalSourceFileName)+", featureCountsMap=")+ featureCountsMap)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
