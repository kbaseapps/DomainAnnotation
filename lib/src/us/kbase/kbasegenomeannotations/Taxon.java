
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
 * <p>Original spec-file type: Taxon</p>
 * <pre>
 * The Taxon object holds the data associated with a taxon.  This taxon could be a leaf or branch in the taxonomic tree.
 * We lost reference_genome_annotation_id 
 * @optional aliases genetic_code scientific_lineage parent_taxon_ref kingdom rank embl_code inherited_div_flag inherited_GC_flag mitochondrial_genetic_code inherited_MGC_flag GenBank_hidden_flag hidden_subtree_flag division_id comments
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "taxonomy_id",
    "scientific_name",
    "scientific_lineage",
    "rank",
    "kingdom",
    "domain",
    "aliases",
    "genetic_code",
    "parent_taxon_ref",
    "embl_code",
    "inherited_div_flag",
    "inherited_GC_flag",
    "mitochondrial_genetic_code",
    "inherited_MGC_flag",
    "GenBank_hidden_flag",
    "hidden_subtree_flag",
    "division_id",
    "comments"
})
public class Taxon {

    @JsonProperty("taxonomy_id")
    private Long taxonomyId;
    @JsonProperty("scientific_name")
    private java.lang.String scientificName;
    @JsonProperty("scientific_lineage")
    private java.lang.String scientificLineage;
    @JsonProperty("rank")
    private java.lang.String rank;
    @JsonProperty("kingdom")
    private java.lang.String kingdom;
    @JsonProperty("domain")
    private java.lang.String domain;
    @JsonProperty("aliases")
    private List<String> aliases;
    @JsonProperty("genetic_code")
    private Long geneticCode;
    @JsonProperty("parent_taxon_ref")
    private java.lang.String parentTaxonRef;
    @JsonProperty("embl_code")
    private java.lang.String emblCode;
    @JsonProperty("inherited_div_flag")
    private Long inheritedDivFlag;
    @JsonProperty("inherited_GC_flag")
    private Long inheritedGCFlag;
    @JsonProperty("mitochondrial_genetic_code")
    private Long mitochondrialGeneticCode;
    @JsonProperty("inherited_MGC_flag")
    private Long inheritedMGCFlag;
    @JsonProperty("GenBank_hidden_flag")
    private Long GenBankHiddenFlag;
    @JsonProperty("hidden_subtree_flag")
    private Long hiddenSubtreeFlag;
    @JsonProperty("division_id")
    private Long divisionId;
    @JsonProperty("comments")
    private java.lang.String comments;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("taxonomy_id")
    public Long getTaxonomyId() {
        return taxonomyId;
    }

    @JsonProperty("taxonomy_id")
    public void setTaxonomyId(Long taxonomyId) {
        this.taxonomyId = taxonomyId;
    }

    public Taxon withTaxonomyId(Long taxonomyId) {
        this.taxonomyId = taxonomyId;
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

    public Taxon withScientificName(java.lang.String scientificName) {
        this.scientificName = scientificName;
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

    public Taxon withScientificLineage(java.lang.String scientificLineage) {
        this.scientificLineage = scientificLineage;
        return this;
    }

    @JsonProperty("rank")
    public java.lang.String getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(java.lang.String rank) {
        this.rank = rank;
    }

    public Taxon withRank(java.lang.String rank) {
        this.rank = rank;
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

    public Taxon withKingdom(java.lang.String kingdom) {
        this.kingdom = kingdom;
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

    public Taxon withDomain(java.lang.String domain) {
        this.domain = domain;
        return this;
    }

    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    @JsonProperty("aliases")
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Taxon withAliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    @JsonProperty("genetic_code")
    public Long getGeneticCode() {
        return geneticCode;
    }

    @JsonProperty("genetic_code")
    public void setGeneticCode(Long geneticCode) {
        this.geneticCode = geneticCode;
    }

    public Taxon withGeneticCode(Long geneticCode) {
        this.geneticCode = geneticCode;
        return this;
    }

    @JsonProperty("parent_taxon_ref")
    public java.lang.String getParentTaxonRef() {
        return parentTaxonRef;
    }

    @JsonProperty("parent_taxon_ref")
    public void setParentTaxonRef(java.lang.String parentTaxonRef) {
        this.parentTaxonRef = parentTaxonRef;
    }

    public Taxon withParentTaxonRef(java.lang.String parentTaxonRef) {
        this.parentTaxonRef = parentTaxonRef;
        return this;
    }

    @JsonProperty("embl_code")
    public java.lang.String getEmblCode() {
        return emblCode;
    }

    @JsonProperty("embl_code")
    public void setEmblCode(java.lang.String emblCode) {
        this.emblCode = emblCode;
    }

    public Taxon withEmblCode(java.lang.String emblCode) {
        this.emblCode = emblCode;
        return this;
    }

    @JsonProperty("inherited_div_flag")
    public Long getInheritedDivFlag() {
        return inheritedDivFlag;
    }

    @JsonProperty("inherited_div_flag")
    public void setInheritedDivFlag(Long inheritedDivFlag) {
        this.inheritedDivFlag = inheritedDivFlag;
    }

    public Taxon withInheritedDivFlag(Long inheritedDivFlag) {
        this.inheritedDivFlag = inheritedDivFlag;
        return this;
    }

    @JsonProperty("inherited_GC_flag")
    public Long getInheritedGCFlag() {
        return inheritedGCFlag;
    }

    @JsonProperty("inherited_GC_flag")
    public void setInheritedGCFlag(Long inheritedGCFlag) {
        this.inheritedGCFlag = inheritedGCFlag;
    }

    public Taxon withInheritedGCFlag(Long inheritedGCFlag) {
        this.inheritedGCFlag = inheritedGCFlag;
        return this;
    }

    @JsonProperty("mitochondrial_genetic_code")
    public Long getMitochondrialGeneticCode() {
        return mitochondrialGeneticCode;
    }

    @JsonProperty("mitochondrial_genetic_code")
    public void setMitochondrialGeneticCode(Long mitochondrialGeneticCode) {
        this.mitochondrialGeneticCode = mitochondrialGeneticCode;
    }

    public Taxon withMitochondrialGeneticCode(Long mitochondrialGeneticCode) {
        this.mitochondrialGeneticCode = mitochondrialGeneticCode;
        return this;
    }

    @JsonProperty("inherited_MGC_flag")
    public Long getInheritedMGCFlag() {
        return inheritedMGCFlag;
    }

    @JsonProperty("inherited_MGC_flag")
    public void setInheritedMGCFlag(Long inheritedMGCFlag) {
        this.inheritedMGCFlag = inheritedMGCFlag;
    }

    public Taxon withInheritedMGCFlag(Long inheritedMGCFlag) {
        this.inheritedMGCFlag = inheritedMGCFlag;
        return this;
    }

    @JsonProperty("GenBank_hidden_flag")
    public Long getGenBankHiddenFlag() {
        return GenBankHiddenFlag;
    }

    @JsonProperty("GenBank_hidden_flag")
    public void setGenBankHiddenFlag(Long GenBankHiddenFlag) {
        this.GenBankHiddenFlag = GenBankHiddenFlag;
    }

    public Taxon withGenBankHiddenFlag(Long GenBankHiddenFlag) {
        this.GenBankHiddenFlag = GenBankHiddenFlag;
        return this;
    }

    @JsonProperty("hidden_subtree_flag")
    public Long getHiddenSubtreeFlag() {
        return hiddenSubtreeFlag;
    }

    @JsonProperty("hidden_subtree_flag")
    public void setHiddenSubtreeFlag(Long hiddenSubtreeFlag) {
        this.hiddenSubtreeFlag = hiddenSubtreeFlag;
    }

    public Taxon withHiddenSubtreeFlag(Long hiddenSubtreeFlag) {
        this.hiddenSubtreeFlag = hiddenSubtreeFlag;
        return this;
    }

    @JsonProperty("division_id")
    public Long getDivisionId() {
        return divisionId;
    }

    @JsonProperty("division_id")
    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public Taxon withDivisionId(Long divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    @JsonProperty("comments")
    public java.lang.String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    public Taxon withComments(java.lang.String comments) {
        this.comments = comments;
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
        return ((((((((((((((((((((((((((((((((((((((("Taxon"+" [taxonomyId=")+ taxonomyId)+", scientificName=")+ scientificName)+", scientificLineage=")+ scientificLineage)+", rank=")+ rank)+", kingdom=")+ kingdom)+", domain=")+ domain)+", aliases=")+ aliases)+", geneticCode=")+ geneticCode)+", parentTaxonRef=")+ parentTaxonRef)+", emblCode=")+ emblCode)+", inheritedDivFlag=")+ inheritedDivFlag)+", inheritedGCFlag=")+ inheritedGCFlag)+", mitochondrialGeneticCode=")+ mitochondrialGeneticCode)+", inheritedMGCFlag=")+ inheritedMGCFlag)+", GenBankHiddenFlag=")+ GenBankHiddenFlag)+", hiddenSubtreeFlag=")+ hiddenSubtreeFlag)+", divisionId=")+ divisionId)+", comments=")+ comments)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
