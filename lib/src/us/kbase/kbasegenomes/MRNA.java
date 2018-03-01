
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
import us.kbase.common.service.Tuple4;


/**
 * <p>Original spec-file type: mRNA</p>
 * <pre>
 * Structure for a single feature mRNA
 *   flags are flag fields in GenBank format. This will be a controlled vocabulary.
 *     Initially Acceptable values are pseudo, ribosomal_slippage, and trans_splicing
 *     Md5 is the md5 of dna_sequence.
 *     @optional cds functions ontology_terms note flags warnings
 *     @optional inference_data dna_sequence aliases db_xrefs
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "location",
    "md5",
    "parent_gene",
    "cds",
    "dna_sequence",
    "dna_sequence_length",
    "note",
    "functions",
    "ontology_terms",
    "flags",
    "warnings",
    "inference_data",
    "aliases",
    "db_xrefs"
})
public class MRNA {

    @JsonProperty("id")
    private java.lang.String id;
    @JsonProperty("location")
    private List<Tuple4 <String, Long, String, Long>> location;
    @JsonProperty("md5")
    private java.lang.String md5;
    @JsonProperty("parent_gene")
    private java.lang.String parentGene;
    @JsonProperty("cds")
    private java.lang.String cds;
    @JsonProperty("dna_sequence")
    private java.lang.String dnaSequence;
    @JsonProperty("dna_sequence_length")
    private java.lang.Long dnaSequenceLength;
    @JsonProperty("note")
    private java.lang.String note;
    @JsonProperty("functions")
    private List<String> functions;
    @JsonProperty("ontology_terms")
    private Map<String, Map<String, List<Long>>> ontologyTerms;
    @JsonProperty("flags")
    private List<String> flags;
    @JsonProperty("warnings")
    private List<String> warnings;
    @JsonProperty("inference_data")
    private List<InferenceInfo> inferenceData;
    @JsonProperty("aliases")
    private List<us.kbase.common.service.Tuple2 <String, String>> aliases;
    @JsonProperty("db_xrefs")
    private List<us.kbase.common.service.Tuple2 <String, String>> dbXrefs;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("id")
    public java.lang.String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(java.lang.String id) {
        this.id = id;
    }

    public MRNA withId(java.lang.String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("location")
    public List<Tuple4 <String, Long, String, Long>> getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(List<Tuple4 <String, Long, String, Long>> location) {
        this.location = location;
    }

    public MRNA withLocation(List<Tuple4 <String, Long, String, Long>> location) {
        this.location = location;
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

    public MRNA withMd5(java.lang.String md5) {
        this.md5 = md5;
        return this;
    }

    @JsonProperty("parent_gene")
    public java.lang.String getParentGene() {
        return parentGene;
    }

    @JsonProperty("parent_gene")
    public void setParentGene(java.lang.String parentGene) {
        this.parentGene = parentGene;
    }

    public MRNA withParentGene(java.lang.String parentGene) {
        this.parentGene = parentGene;
        return this;
    }

    @JsonProperty("cds")
    public java.lang.String getCds() {
        return cds;
    }

    @JsonProperty("cds")
    public void setCds(java.lang.String cds) {
        this.cds = cds;
    }

    public MRNA withCds(java.lang.String cds) {
        this.cds = cds;
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

    public MRNA withDnaSequence(java.lang.String dnaSequence) {
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

    public MRNA withDnaSequenceLength(java.lang.Long dnaSequenceLength) {
        this.dnaSequenceLength = dnaSequenceLength;
        return this;
    }

    @JsonProperty("note")
    public java.lang.String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    public MRNA withNote(java.lang.String note) {
        this.note = note;
        return this;
    }

    @JsonProperty("functions")
    public List<String> getFunctions() {
        return functions;
    }

    @JsonProperty("functions")
    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }

    public MRNA withFunctions(List<String> functions) {
        this.functions = functions;
        return this;
    }

    @JsonProperty("ontology_terms")
    public Map<String, Map<String, List<Long>>> getOntologyTerms() {
        return ontologyTerms;
    }

    @JsonProperty("ontology_terms")
    public void setOntologyTerms(Map<String, Map<String, List<Long>>> ontologyTerms) {
        this.ontologyTerms = ontologyTerms;
    }

    public MRNA withOntologyTerms(Map<String, Map<String, List<Long>>> ontologyTerms) {
        this.ontologyTerms = ontologyTerms;
        return this;
    }

    @JsonProperty("flags")
    public List<String> getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public MRNA withFlags(List<String> flags) {
        this.flags = flags;
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

    public MRNA withWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    @JsonProperty("inference_data")
    public List<InferenceInfo> getInferenceData() {
        return inferenceData;
    }

    @JsonProperty("inference_data")
    public void setInferenceData(List<InferenceInfo> inferenceData) {
        this.inferenceData = inferenceData;
    }

    public MRNA withInferenceData(List<InferenceInfo> inferenceData) {
        this.inferenceData = inferenceData;
        return this;
    }

    @JsonProperty("aliases")
    public List<us.kbase.common.service.Tuple2 <String, String>> getAliases() {
        return aliases;
    }

    @JsonProperty("aliases")
    public void setAliases(List<us.kbase.common.service.Tuple2 <String, String>> aliases) {
        this.aliases = aliases;
    }

    public MRNA withAliases(List<us.kbase.common.service.Tuple2 <String, String>> aliases) {
        this.aliases = aliases;
        return this;
    }

    @JsonProperty("db_xrefs")
    public List<us.kbase.common.service.Tuple2 <String, String>> getDbXrefs() {
        return dbXrefs;
    }

    @JsonProperty("db_xrefs")
    public void setDbXrefs(List<us.kbase.common.service.Tuple2 <String, String>> dbXrefs) {
        this.dbXrefs = dbXrefs;
    }

    public MRNA withDbXrefs(List<us.kbase.common.service.Tuple2 <String, String>> dbXrefs) {
        this.dbXrefs = dbXrefs;
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
        return ((((((((((((((((((((((((((((((((("MRNA"+" [id=")+ id)+", location=")+ location)+", md5=")+ md5)+", parentGene=")+ parentGene)+", cds=")+ cds)+", dnaSequence=")+ dnaSequence)+", dnaSequenceLength=")+ dnaSequenceLength)+", note=")+ note)+", functions=")+ functions)+", ontologyTerms=")+ ontologyTerms)+", flags=")+ flags)+", warnings=")+ warnings)+", inferenceData=")+ inferenceData)+", aliases=")+ aliases)+", dbXrefs=")+ dbXrefs)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
