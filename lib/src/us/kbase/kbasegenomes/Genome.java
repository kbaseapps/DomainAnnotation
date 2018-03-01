
package us.kbase.kbasegenomes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import us.kbase.common.service.Tuple7;


/**
 * <p>Original spec-file type: Genome</p>
 * <pre>
 * Genome object holds much of the data relevant for a genome in KBase
 *     Genome publications should be papers about the genome
 * Should the Genome object contain a list of contig_ids too?
 * Source: allowed entries RefSeq, Ensembl, Phytozome, RAST, Prokka, User_upload
 *     #allowed entries RefSeq, Ensembl, Phytozome, RAST, Prokka, 
 * User_upload controlled vocabulary managed by API
 * Domain is a controlled vocabulary
 * Warnings : mostly controlled vocab but also allow for unstructured  
 * Genome_tiers : controlled vocabulary (based on ap input and API checked)
 * Allowed values: #Representative, Reference, ExternalDB, User
 * Examples Tiers: 
 * All phytozome - Representative and ExternalDB
 * Phytozome flagship genomes - Reference, Representative and ExternalDB
 * Ensembl - Representative and ExternalDB
 * RefSeq Reference - Reference, Representative and ExternalDB
 * RefSeq Representative - Representative and ExternalDB
 * RefSeq Latest or All Assemblies folder - ExternalDB
 * User Data - User tagged
 * Example Sources:
 * RefSeq, Ensembl, Phytozome, Microcosm, User, RAST, Prokka, (other annotators)
 * @optional warnings contig_lengths contig_ids source_id taxonomy publications
 * @optional ontology_events ontologies_present non_coding_features mrnas
 * @optional genbank_handle_ref gff_handle_ref external_source_origination_date
 * @optional release original_source_file_name notes quality_scores suspect assembly_ref
 * @metadata ws gc_content as GC content
 *     @metadata ws taxonomy as Taxonomy
 *     @metadata ws md5 as MD5
 *     @metadata ws dna_size as Size
 *     @metadata ws genetic_code as Genetic code
 *     @metadata ws domain as Domain
 *     @metadata ws source_id as Source ID
 *     @metadata ws source as Source
 *     @metadata ws scientific_name as Name
 *     @metadata ws length(features) as Number of Protein Encoding Genes
 * @metadata ws length(cdss) as Number of CDS
 *     @metadata ws num_contigs as Number contigs
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "scientific_name",
    "domain",
    "warnings",
    "genome_tiers",
    "feature_counts",
    "genetic_code",
    "dna_size",
    "num_contigs",
    "molecule_type",
    "contig_lengths",
    "contig_ids",
    "source",
    "source_id",
    "md5",
    "taxonomy",
    "gc_content",
    "publications",
    "ontology_events",
    "ontologies_present",
    "features",
    "non_coding_features",
    "cdss",
    "mrnas",
    "assembly_ref",
    "taxon_ref",
    "genbank_handle_ref",
    "gff_handle_ref",
    "external_source_origination_date",
    "release",
    "original_source_file_name",
    "notes",
    "quality_scores",
    "suspect"
})
public class Genome {

    @JsonProperty("id")
    private java.lang.String id;
    @JsonProperty("scientific_name")
    private java.lang.String scientificName;
    @JsonProperty("domain")
    private java.lang.String domain;
    @JsonProperty("warnings")
    private List<String> warnings;
    @JsonProperty("genome_tiers")
    private List<String> genomeTiers;
    @JsonProperty("feature_counts")
    private Map<String, Long> featureCounts;
    @JsonProperty("genetic_code")
    private java.lang.Long geneticCode;
    @JsonProperty("dna_size")
    private java.lang.Long dnaSize;
    @JsonProperty("num_contigs")
    private java.lang.Long numContigs;
    @JsonProperty("molecule_type")
    private java.lang.String moleculeType;
    @JsonProperty("contig_lengths")
    private List<Long> contigLengths;
    @JsonProperty("contig_ids")
    private List<String> contigIds;
    @JsonProperty("source")
    private java.lang.String source;
    @JsonProperty("source_id")
    private java.lang.String sourceId;
    @JsonProperty("md5")
    private java.lang.String md5;
    @JsonProperty("taxonomy")
    private java.lang.String taxonomy;
    @JsonProperty("gc_content")
    private java.lang.Double gcContent;
    @JsonProperty("publications")
    private List<Tuple7 <Double, String, String, String, String, String, String>> publications;
    @JsonProperty("ontology_events")
    private List<OntologyEvent> ontologyEvents;
    @JsonProperty("ontologies_present")
    private Map<String, Map<String, String>> ontologiesPresent;
    @JsonProperty("features")
    private List<Feature> features;
    @JsonProperty("non_coding_features")
    private List<NonCodingFeature> nonCodingFeatures;
    @JsonProperty("cdss")
    private List<CDS> cdss;
    @JsonProperty("mrnas")
    private List<MRNA> mrnas;
    @JsonProperty("assembly_ref")
    private java.lang.String assemblyRef;
    @JsonProperty("taxon_ref")
    private java.lang.String taxonRef;
    @JsonProperty("genbank_handle_ref")
    private java.lang.String genbankHandleRef;
    @JsonProperty("gff_handle_ref")
    private java.lang.String gffHandleRef;
    @JsonProperty("external_source_origination_date")
    private java.lang.String externalSourceOriginationDate;
    @JsonProperty("release")
    private java.lang.String release;
    @JsonProperty("original_source_file_name")
    private java.lang.String originalSourceFileName;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("quality_scores")
    private List<GenomeQualityScore> qualityScores;
    @JsonProperty("suspect")
    private java.lang.Long suspect;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("id")
    public java.lang.String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(java.lang.String id) {
        this.id = id;
    }

    public Genome withId(java.lang.String id) {
        this.id = id;
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

    public Genome withScientificName(java.lang.String scientificName) {
        this.scientificName = scientificName;
        return this;
    }

    @JsonProperty("domain")
    public java.lang.String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }

    public Genome withDomain(java.lang.String domain) {
        this.domain = domain;
        return this;
    }

    @JsonProperty("warnings")
    public List<String> getWarnings() {
        return warnings;
    }

    @JsonProperty("warnings")
    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public Genome withWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    @JsonProperty("genome_tiers")
    public List<String> getGenomeTiers() {
        return genomeTiers;
    }

    @JsonProperty("genome_tiers")
    public void setGenomeTiers(List<String> genomeTiers) {
        this.genomeTiers = genomeTiers;
    }

    public Genome withGenomeTiers(List<String> genomeTiers) {
        this.genomeTiers = genomeTiers;
        return this;
    }

    @JsonProperty("feature_counts")
    public Map<String, Long> getFeatureCounts() {
        return featureCounts;
    }

    @JsonProperty("feature_counts")
    public void setFeatureCounts(Map<String, Long> featureCounts) {
        this.featureCounts = featureCounts;
    }

    public Genome withFeatureCounts(Map<String, Long> featureCounts) {
        this.featureCounts = featureCounts;
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

    public Genome withGeneticCode(java.lang.Long geneticCode) {
        this.geneticCode = geneticCode;
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

    public Genome withDnaSize(java.lang.Long dnaSize) {
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

    public Genome withNumContigs(java.lang.Long numContigs) {
        this.numContigs = numContigs;
        return this;
    }

    @JsonProperty("molecule_type")
    public java.lang.String getMoleculeType() {
        return moleculeType;
    }

    @JsonProperty("molecule_type")
    public void setMoleculeType(java.lang.String moleculeType) {
        this.moleculeType = moleculeType;
    }

    public Genome withMoleculeType(java.lang.String moleculeType) {
        this.moleculeType = moleculeType;
        return this;
    }

    @JsonProperty("contig_lengths")
    public List<Long> getContigLengths() {
        return contigLengths;
    }

    @JsonProperty("contig_lengths")
    public void setContigLengths(List<Long> contigLengths) {
        this.contigLengths = contigLengths;
    }

    public Genome withContigLengths(List<Long> contigLengths) {
        this.contigLengths = contigLengths;
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

    public Genome withContigIds(List<String> contigIds) {
        this.contigIds = contigIds;
        return this;
    }

    @JsonProperty("source")
    public java.lang.String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public Genome withSource(java.lang.String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("source_id")
    public java.lang.String getSourceId() {
        return sourceId;
    }

    @JsonProperty("source_id")
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }

    public Genome withSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
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

    public Genome withMd5(java.lang.String md5) {
        this.md5 = md5;
        return this;
    }

    @JsonProperty("taxonomy")
    public java.lang.String getTaxonomy() {
        return taxonomy;
    }

    @JsonProperty("taxonomy")
    public void setTaxonomy(java.lang.String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public Genome withTaxonomy(java.lang.String taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    @JsonProperty("gc_content")
    public java.lang.Double getGcContent() {
        return gcContent;
    }

    @JsonProperty("gc_content")
    public void setGcContent(java.lang.Double gcContent) {
        this.gcContent = gcContent;
    }

    public Genome withGcContent(java.lang.Double gcContent) {
        this.gcContent = gcContent;
        return this;
    }

    @JsonProperty("publications")
    public List<Tuple7 <Double, String, String, String, String, String, String>> getPublications() {
        return publications;
    }

    @JsonProperty("publications")
    public void setPublications(List<Tuple7 <Double, String, String, String, String, String, String>> publications) {
        this.publications = publications;
    }

    public Genome withPublications(List<Tuple7 <Double, String, String, String, String, String, String>> publications) {
        this.publications = publications;
        return this;
    }

    @JsonProperty("ontology_events")
    public List<OntologyEvent> getOntologyEvents() {
        return ontologyEvents;
    }

    @JsonProperty("ontology_events")
    public void setOntologyEvents(List<OntologyEvent> ontologyEvents) {
        this.ontologyEvents = ontologyEvents;
    }

    public Genome withOntologyEvents(List<OntologyEvent> ontologyEvents) {
        this.ontologyEvents = ontologyEvents;
        return this;
    }

    @JsonProperty("ontologies_present")
    public Map<String, Map<String, String>> getOntologiesPresent() {
        return ontologiesPresent;
    }

    @JsonProperty("ontologies_present")
    public void setOntologiesPresent(Map<String, Map<String, String>> ontologiesPresent) {
        this.ontologiesPresent = ontologiesPresent;
    }

    public Genome withOntologiesPresent(Map<String, Map<String, String>> ontologiesPresent) {
        this.ontologiesPresent = ontologiesPresent;
        return this;
    }

    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Genome withFeatures(List<Feature> features) {
        this.features = features;
        return this;
    }

    @JsonProperty("non_coding_features")
    public List<NonCodingFeature> getNonCodingFeatures() {
        return nonCodingFeatures;
    }

    @JsonProperty("non_coding_features")
    public void setNonCodingFeatures(List<NonCodingFeature> nonCodingFeatures) {
        this.nonCodingFeatures = nonCodingFeatures;
    }

    public Genome withNonCodingFeatures(List<NonCodingFeature> nonCodingFeatures) {
        this.nonCodingFeatures = nonCodingFeatures;
        return this;
    }

    @JsonProperty("cdss")
    public List<CDS> getCdss() {
        return cdss;
    }

    @JsonProperty("cdss")
    public void setCdss(List<CDS> cdss) {
        this.cdss = cdss;
    }

    public Genome withCdss(List<CDS> cdss) {
        this.cdss = cdss;
        return this;
    }

    @JsonProperty("mrnas")
    public List<MRNA> getMrnas() {
        return mrnas;
    }

    @JsonProperty("mrnas")
    public void setMrnas(List<MRNA> mrnas) {
        this.mrnas = mrnas;
    }

    public Genome withMrnas(List<MRNA> mrnas) {
        this.mrnas = mrnas;
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

    public Genome withAssemblyRef(java.lang.String assemblyRef) {
        this.assemblyRef = assemblyRef;
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

    public Genome withTaxonRef(java.lang.String taxonRef) {
        this.taxonRef = taxonRef;
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

    public Genome withGenbankHandleRef(java.lang.String genbankHandleRef) {
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

    public Genome withGffHandleRef(java.lang.String gffHandleRef) {
        this.gffHandleRef = gffHandleRef;
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

    public Genome withExternalSourceOriginationDate(java.lang.String externalSourceOriginationDate) {
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

    public Genome withRelease(java.lang.String release) {
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

    public Genome withOriginalSourceFileName(java.lang.String originalSourceFileName) {
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

    public Genome withNotes(java.lang.String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("quality_scores")
    public List<GenomeQualityScore> getQualityScores() {
        return qualityScores;
    }

    @JsonProperty("quality_scores")
    public void setQualityScores(List<GenomeQualityScore> qualityScores) {
        this.qualityScores = qualityScores;
    }

    public Genome withQualityScores(List<GenomeQualityScore> qualityScores) {
        this.qualityScores = qualityScores;
        return this;
    }

    @JsonProperty("suspect")
    public java.lang.Long getSuspect() {
        return suspect;
    }

    @JsonProperty("suspect")
    public void setSuspect(java.lang.Long suspect) {
        this.suspect = suspect;
    }

    public Genome withSuspect(java.lang.Long suspect) {
        this.suspect = suspect;
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
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("Genome"+" [id=")+ id)+", scientificName=")+ scientificName)+", domain=")+ domain)+", warnings=")+ warnings)+", genomeTiers=")+ genomeTiers)+", featureCounts=")+ featureCounts)+", geneticCode=")+ geneticCode)+", dnaSize=")+ dnaSize)+", numContigs=")+ numContigs)+", moleculeType=")+ moleculeType)+", contigLengths=")+ contigLengths)+", contigIds=")+ contigIds)+", source=")+ source)+", sourceId=")+ sourceId)+", md5=")+ md5)+", taxonomy=")+ taxonomy)+", gcContent=")+ gcContent)+", publications=")+ publications)+", ontologyEvents=")+ ontologyEvents)+", ontologiesPresent=")+ ontologiesPresent)+", features=")+ features)+", nonCodingFeatures=")+ nonCodingFeatures)+", cdss=")+ cdss)+", mrnas=")+ mrnas)+", assemblyRef=")+ assemblyRef)+", taxonRef=")+ taxonRef)+", genbankHandleRef=")+ genbankHandleRef)+", gffHandleRef=")+ gffHandleRef)+", externalSourceOriginationDate=")+ externalSourceOriginationDate)+", release=")+ release)+", originalSourceFileName=")+ originalSourceFileName)+", notes=")+ notes)+", qualityScores=")+ qualityScores)+", suspect=")+ suspect)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
