
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
 * <p>Original spec-file type: CDS</p>
 * <pre>
 * Structure for a single feature CDS
 *   flags are flag fields in GenBank format. This will be a controlled vocabulary.
 *     Initially Acceptable values are pseudo, ribosomal_slippage, and trans_splicing
 *     Md5 is the md5 of dna_sequence.
 *     @optional parent_mrna functions ontology_terms note flags warnings
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
    "protein_md5",
    "parent_gene",
    "parent_mrna",
    "note",
    "functions",
    "ontology_terms",
    "flags",
    "warnings",
    "inference_data",
    "protein_translation",
    "protein_translation_length",
    "aliases",
    "db_xrefs",
    "dna_sequence",
    "dna_sequence_length"
})
public class CDS {

    @JsonProperty("id")
    private java.lang.String id;
    @JsonProperty("location")
    private List<Tuple4 <String, Long, String, Long>> location;
    @JsonProperty("md5")
    private java.lang.String md5;
    @JsonProperty("protein_md5")
    private java.lang.String proteinMd5;
    @JsonProperty("parent_gene")
    private java.lang.String parentGene;
    @JsonProperty("parent_mrna")
    private java.lang.String parentMrna;
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
    @JsonProperty("protein_translation")
    private java.lang.String proteinTranslation;
    @JsonProperty("protein_translation_length")
    private java.lang.Long proteinTranslationLength;
    @JsonProperty("aliases")
    private List<us.kbase.common.service.Tuple2 <String, String>> aliases;
    @JsonProperty("db_xrefs")
    private List<us.kbase.common.service.Tuple2 <String, String>> dbXrefs;
    @JsonProperty("dna_sequence")
    private java.lang.String dnaSequence;
    @JsonProperty("dna_sequence_length")
    private java.lang.Long dnaSequenceLength;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("id")
    public java.lang.String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(java.lang.String id) {
        this.id = id;
    }

    public CDS withId(java.lang.String id) {
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

    public CDS withLocation(List<Tuple4 <String, Long, String, Long>> location) {
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

    public CDS withMd5(java.lang.String md5) {
        this.md5 = md5;
        return this;
    }

    @JsonProperty("protein_md5")
    public java.lang.String getProteinMd5() {
        return proteinMd5;
    }

    @JsonProperty("protein_md5")
    public void setProteinMd5(java.lang.String proteinMd5) {
        this.proteinMd5 = proteinMd5;
    }

    public CDS withProteinMd5(java.lang.String proteinMd5) {
        this.proteinMd5 = proteinMd5;
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

    public CDS withParentGene(java.lang.String parentGene) {
        this.parentGene = parentGene;
        return this;
    }

    @JsonProperty("parent_mrna")
    public java.lang.String getParentMrna() {
        return parentMrna;
    }

    @JsonProperty("parent_mrna")
    public void setParentMrna(java.lang.String parentMrna) {
        this.parentMrna = parentMrna;
    }

    public CDS withParentMrna(java.lang.String parentMrna) {
        this.parentMrna = parentMrna;
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

    public CDS withNote(java.lang.String note) {
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

    public CDS withFunctions(List<String> functions) {
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

    public CDS withOntologyTerms(Map<String, Map<String, List<Long>>> ontologyTerms) {
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

    public CDS withFlags(List<String> flags) {
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

    public CDS withWarnings(List<String> warnings) {
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

    public CDS withInferenceData(List<InferenceInfo> inferenceData) {
        this.inferenceData = inferenceData;
        return this;
    }

    @JsonProperty("protein_translation")
    public java.lang.String getProteinTranslation() {
        return proteinTranslation;
    }

    @JsonProperty("protein_translation")
    public void setProteinTranslation(java.lang.String proteinTranslation) {
        this.proteinTranslation = proteinTranslation;
    }

    public CDS withProteinTranslation(java.lang.String proteinTranslation) {
        this.proteinTranslation = proteinTranslation;
        return this;
    }

    @JsonProperty("protein_translation_length")
    public java.lang.Long getProteinTranslationLength() {
        return proteinTranslationLength;
    }

    @JsonProperty("protein_translation_length")
    public void setProteinTranslationLength(java.lang.Long proteinTranslationLength) {
        this.proteinTranslationLength = proteinTranslationLength;
    }

    public CDS withProteinTranslationLength(java.lang.Long proteinTranslationLength) {
        this.proteinTranslationLength = proteinTranslationLength;
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

    public CDS withAliases(List<us.kbase.common.service.Tuple2 <String, String>> aliases) {
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

    public CDS withDbXrefs(List<us.kbase.common.service.Tuple2 <String, String>> dbXrefs) {
        this.dbXrefs = dbXrefs;
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

    public CDS withDnaSequence(java.lang.String dnaSequence) {
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

    public CDS withDnaSequenceLength(java.lang.Long dnaSequenceLength) {
        this.dnaSequenceLength = dnaSequenceLength;
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
        return ((((((((((((((((((((((((((((((((((((((("CDS"+" [id=")+ id)+", location=")+ location)+", md5=")+ md5)+", proteinMd5=")+ proteinMd5)+", parentGene=")+ parentGene)+", parentMrna=")+ parentMrna)+", note=")+ note)+", functions=")+ functions)+", ontologyTerms=")+ ontologyTerms)+", flags=")+ flags)+", warnings=")+ warnings)+", inferenceData=")+ inferenceData)+", proteinTranslation=")+ proteinTranslation)+", proteinTranslationLength=")+ proteinTranslationLength)+", aliases=")+ aliases)+", dbXrefs=")+ dbXrefs)+", dnaSequence=")+ dnaSequence)+", dnaSequenceLength=")+ dnaSequenceLength)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
