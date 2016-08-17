
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
 * <p>Original spec-file type: Assembly</p>
 * <pre>
 * The Assembly object contains the information about an Assembly of Reads. The sequence data for this would be stored within a shock node.
 * The assembly itself is a collection of Contig subobjects.
 * Type is a controlled vocabulary.  Example Finished, Draft.
 * reads_handle_ref and fasta_handle_ref are handle service references to shock.
 * assembly_stats assembly_stats; - should be in there, but needs to be flushed out by Fang Fang
 * @metadata ws gc_content as GC content
 * @metadata ws md5 as MD5
 * @metadata ws name as Name
 * @metadata ws dna_size as Size
 * @optional name external_source external_source_id external_source_origination_date reads_handle_ref notes taxon_ref
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "assembly_id",
    "name",
    "md5",
    "external_source",
    "external_source_id",
    "external_source_origination_date",
    "gc_content",
    "type",
    "reads_handle_ref",
    "fasta_handle_ref",
    "contigs",
    "dna_size",
    "num_contigs",
    "notes",
    "taxon_ref",
    "base_counts"
})
public class Assembly {

    @JsonProperty("assembly_id")
    private java.lang.String assemblyId;
    @JsonProperty("name")
    private java.lang.String name;
    @JsonProperty("md5")
    private java.lang.String md5;
    @JsonProperty("external_source")
    private java.lang.String externalSource;
    @JsonProperty("external_source_id")
    private java.lang.String externalSourceId;
    @JsonProperty("external_source_origination_date")
    private java.lang.String externalSourceOriginationDate;
    @JsonProperty("gc_content")
    private Double gcContent;
    @JsonProperty("type")
    private java.lang.String type;
    @JsonProperty("reads_handle_ref")
    private java.lang.String readsHandleRef;
    @JsonProperty("fasta_handle_ref")
    private java.lang.String fastaHandleRef;
    @JsonProperty("contigs")
    private Map<String, Contig> contigs;
    @JsonProperty("dna_size")
    private java.lang.Long dnaSize;
    @JsonProperty("num_contigs")
    private java.lang.Long numContigs;
    @JsonProperty("notes")
    private java.lang.String notes;
    @JsonProperty("taxon_ref")
    private java.lang.String taxonRef;
    @JsonProperty("base_counts")
    private Map<String, Long> baseCounts;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("assembly_id")
    public java.lang.String getAssemblyId() {
        return assemblyId;
    }

    @JsonProperty("assembly_id")
    public void setAssemblyId(java.lang.String assemblyId) {
        this.assemblyId = assemblyId;
    }

    public Assembly withAssemblyId(java.lang.String assemblyId) {
        this.assemblyId = assemblyId;
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

    public Assembly withName(java.lang.String name) {
        this.name = name;
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

    public Assembly withMd5(java.lang.String md5) {
        this.md5 = md5;
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

    public Assembly withExternalSource(java.lang.String externalSource) {
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

    public Assembly withExternalSourceId(java.lang.String externalSourceId) {
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

    public Assembly withExternalSourceOriginationDate(java.lang.String externalSourceOriginationDate) {
        this.externalSourceOriginationDate = externalSourceOriginationDate;
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

    public Assembly withGcContent(Double gcContent) {
        this.gcContent = gcContent;
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

    public Assembly withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("reads_handle_ref")
    public java.lang.String getReadsHandleRef() {
        return readsHandleRef;
    }

    @JsonProperty("reads_handle_ref")
    public void setReadsHandleRef(java.lang.String readsHandleRef) {
        this.readsHandleRef = readsHandleRef;
    }

    public Assembly withReadsHandleRef(java.lang.String readsHandleRef) {
        this.readsHandleRef = readsHandleRef;
        return this;
    }

    @JsonProperty("fasta_handle_ref")
    public java.lang.String getFastaHandleRef() {
        return fastaHandleRef;
    }

    @JsonProperty("fasta_handle_ref")
    public void setFastaHandleRef(java.lang.String fastaHandleRef) {
        this.fastaHandleRef = fastaHandleRef;
    }

    public Assembly withFastaHandleRef(java.lang.String fastaHandleRef) {
        this.fastaHandleRef = fastaHandleRef;
        return this;
    }

    @JsonProperty("contigs")
    public Map<String, Contig> getContigs() {
        return contigs;
    }

    @JsonProperty("contigs")
    public void setContigs(Map<String, Contig> contigs) {
        this.contigs = contigs;
    }

    public Assembly withContigs(Map<String, Contig> contigs) {
        this.contigs = contigs;
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

    public Assembly withDnaSize(java.lang.Long dnaSize) {
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

    public Assembly withNumContigs(java.lang.Long numContigs) {
        this.numContigs = numContigs;
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

    public Assembly withNotes(java.lang.String notes) {
        this.notes = notes;
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

    public Assembly withTaxonRef(java.lang.String taxonRef) {
        this.taxonRef = taxonRef;
        return this;
    }

    @JsonProperty("base_counts")
    public Map<String, Long> getBaseCounts() {
        return baseCounts;
    }

    @JsonProperty("base_counts")
    public void setBaseCounts(Map<String, Long> baseCounts) {
        this.baseCounts = baseCounts;
    }

    public Assembly withBaseCounts(Map<String, Long> baseCounts) {
        this.baseCounts = baseCounts;
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
        return ((((((((((((((((((((((((((((((((((("Assembly"+" [assemblyId=")+ assemblyId)+", name=")+ name)+", md5=")+ md5)+", externalSource=")+ externalSource)+", externalSourceId=")+ externalSourceId)+", externalSourceOriginationDate=")+ externalSourceOriginationDate)+", gcContent=")+ gcContent)+", type=")+ type)+", readsHandleRef=")+ readsHandleRef)+", fastaHandleRef=")+ fastaHandleRef)+", contigs=")+ contigs)+", dnaSize=")+ dnaSize)+", numContigs=")+ numContigs)+", notes=")+ notes)+", taxonRef=")+ taxonRef)+", baseCounts=")+ baseCounts)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
