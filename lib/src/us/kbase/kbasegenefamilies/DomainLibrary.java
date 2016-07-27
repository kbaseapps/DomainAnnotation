
package us.kbase.kbasegenefamilies;

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
 * <p>Original spec-file type: DomainLibrary</p>
 * <pre>
 * id - id of library
 * source - source of library (e.g., Cog, Pfam, ...)
 * source_url - ftp/http url where library can be downloaded 
 * version - version of library release
 * release_date - release date of library
 * program - program for running domain search
 * domain_prefix - prefix of domain accession defining library
 * dbxref_prefix - url prefix for db-external referencing
 * library_files - library files stored in Shock storage
 * domains - domain information
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "source",
    "source_url",
    "version",
    "release_date",
    "program",
    "domain_prefix",
    "dbxref_prefix",
    "library_files",
    "domains"
})
public class DomainLibrary {

    @JsonProperty("id")
    private java.lang.String id;
    @JsonProperty("source")
    private java.lang.String source;
    @JsonProperty("source_url")
    private java.lang.String sourceUrl;
    @JsonProperty("version")
    private java.lang.String version;
    @JsonProperty("release_date")
    private java.lang.String releaseDate;
    @JsonProperty("program")
    private java.lang.String program;
    @JsonProperty("domain_prefix")
    private java.lang.String domainPrefix;
    @JsonProperty("dbxref_prefix")
    private java.lang.String dbxrefPrefix;
    @JsonProperty("library_files")
    private List<Handle> libraryFiles;
    @JsonProperty("domains")
    private Map<String, DomainModel> domains;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("id")
    public java.lang.String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(java.lang.String id) {
        this.id = id;
    }

    public DomainLibrary withId(java.lang.String id) {
        this.id = id;
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

    public DomainLibrary withSource(java.lang.String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("source_url")
    public java.lang.String getSourceUrl() {
        return sourceUrl;
    }

    @JsonProperty("source_url")
    public void setSourceUrl(java.lang.String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public DomainLibrary withSourceUrl(java.lang.String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    @JsonProperty("version")
    public java.lang.String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    public DomainLibrary withVersion(java.lang.String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("release_date")
    public java.lang.String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public DomainLibrary withReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @JsonProperty("program")
    public java.lang.String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(java.lang.String program) {
        this.program = program;
    }

    public DomainLibrary withProgram(java.lang.String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("domain_prefix")
    public java.lang.String getDomainPrefix() {
        return domainPrefix;
    }

    @JsonProperty("domain_prefix")
    public void setDomainPrefix(java.lang.String domainPrefix) {
        this.domainPrefix = domainPrefix;
    }

    public DomainLibrary withDomainPrefix(java.lang.String domainPrefix) {
        this.domainPrefix = domainPrefix;
        return this;
    }

    @JsonProperty("dbxref_prefix")
    public java.lang.String getDbxrefPrefix() {
        return dbxrefPrefix;
    }

    @JsonProperty("dbxref_prefix")
    public void setDbxrefPrefix(java.lang.String dbxrefPrefix) {
        this.dbxrefPrefix = dbxrefPrefix;
    }

    public DomainLibrary withDbxrefPrefix(java.lang.String dbxrefPrefix) {
        this.dbxrefPrefix = dbxrefPrefix;
        return this;
    }

    @JsonProperty("library_files")
    public List<Handle> getLibraryFiles() {
        return libraryFiles;
    }

    @JsonProperty("library_files")
    public void setLibraryFiles(List<Handle> libraryFiles) {
        this.libraryFiles = libraryFiles;
    }

    public DomainLibrary withLibraryFiles(List<Handle> libraryFiles) {
        this.libraryFiles = libraryFiles;
        return this;
    }

    @JsonProperty("domains")
    public Map<String, DomainModel> getDomains() {
        return domains;
    }

    @JsonProperty("domains")
    public void setDomains(Map<String, DomainModel> domains) {
        this.domains = domains;
    }

    public DomainLibrary withDomains(Map<String, DomainModel> domains) {
        this.domains = domains;
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
        return ((((((((((((((((((((((("DomainLibrary"+" [id=")+ id)+", source=")+ source)+", sourceUrl=")+ sourceUrl)+", version=")+ version)+", releaseDate=")+ releaseDate)+", program=")+ program)+", domainPrefix=")+ domainPrefix)+", dbxrefPrefix=")+ dbxrefPrefix)+", libraryFiles=")+ libraryFiles)+", domains=")+ domains)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
