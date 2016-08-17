
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
 * <p>Original spec-file type: contig</p>
 * <pre>
 * The Contig is an individual contiguous sequence.
 * This is the result of an assembly, it can be complete (ex: full chromosome or circular DNA), it can also be partial
 * due to the limitations of the assembly itself.
 * is_complete - is an indication of complete chromosome, plasmid, etc.
 * is_circular - True, False and Unknown are viable values, could make an int(bool). If field not present viewed as unknown.
 * @optional name description is_complete
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "contig_id",
    "length",
    "md5",
    "name",
    "description",
    "is_complete",
    "is_circular",
    "start_position",
    "num_bytes",
    "gc_content",
    "Ncount"
})
public class Contig {

    @JsonProperty("contig_id")
    private String contigId;
    @JsonProperty("length")
    private Long length;
    @JsonProperty("md5")
    private String md5;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("is_complete")
    private Long isComplete;
    @JsonProperty("is_circular")
    private String isCircular;
    @JsonProperty("start_position")
    private Long startPosition;
    @JsonProperty("num_bytes")
    private Long numBytes;
    @JsonProperty("gc_content")
    private Double gcContent;
    @JsonProperty("Ncount")
    private Long Ncount;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contig_id")
    public String getContigId() {
        return contigId;
    }

    @JsonProperty("contig_id")
    public void setContigId(String contigId) {
        this.contigId = contigId;
    }

    public Contig withContigId(String contigId) {
        this.contigId = contigId;
        return this;
    }

    @JsonProperty("length")
    public Long getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Long length) {
        this.length = length;
    }

    public Contig withLength(Long length) {
        this.length = length;
        return this;
    }

    @JsonProperty("md5")
    public String getMd5() {
        return md5;
    }

    @JsonProperty("md5")
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Contig withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Contig withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Contig withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("is_complete")
    public Long getIsComplete() {
        return isComplete;
    }

    @JsonProperty("is_complete")
    public void setIsComplete(Long isComplete) {
        this.isComplete = isComplete;
    }

    public Contig withIsComplete(Long isComplete) {
        this.isComplete = isComplete;
        return this;
    }

    @JsonProperty("is_circular")
    public String getIsCircular() {
        return isCircular;
    }

    @JsonProperty("is_circular")
    public void setIsCircular(String isCircular) {
        this.isCircular = isCircular;
    }

    public Contig withIsCircular(String isCircular) {
        this.isCircular = isCircular;
        return this;
    }

    @JsonProperty("start_position")
    public Long getStartPosition() {
        return startPosition;
    }

    @JsonProperty("start_position")
    public void setStartPosition(Long startPosition) {
        this.startPosition = startPosition;
    }

    public Contig withStartPosition(Long startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    @JsonProperty("num_bytes")
    public Long getNumBytes() {
        return numBytes;
    }

    @JsonProperty("num_bytes")
    public void setNumBytes(Long numBytes) {
        this.numBytes = numBytes;
    }

    public Contig withNumBytes(Long numBytes) {
        this.numBytes = numBytes;
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

    public Contig withGcContent(Double gcContent) {
        this.gcContent = gcContent;
        return this;
    }

    @JsonProperty("Ncount")
    public Long getNcount() {
        return Ncount;
    }

    @JsonProperty("Ncount")
    public void setNcount(Long Ncount) {
        this.Ncount = Ncount;
    }

    public Contig withNcount(Long Ncount) {
        this.Ncount = Ncount;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((("Contig"+" [contigId=")+ contigId)+", length=")+ length)+", md5=")+ md5)+", name=")+ name)+", description=")+ description)+", isComplete=")+ isComplete)+", isCircular=")+ isCircular)+", startPosition=")+ startPosition)+", numBytes=")+ numBytes)+", gcContent=")+ gcContent)+", Ncount=")+ Ncount)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
