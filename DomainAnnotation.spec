/*
This is a port of the KBaseGeneFamilies module to the SDK.
*/

module DomainAnnotation {
    /*
    enum: CDD, SMART, Pfam, etc
    */
    typedef string domain_source;

    /*
    date in ISO 8601 format; e.g., 2014-11-26
    */
    typedef string date;

    /*
    enum: hmmscan-3.1b1, rpsblast-2.2.30
    */
    typedef string program_version;

    /*
    enum: PSSM, HMM-Family, HMM-Domain, HMM-Repeat, HMM-Motif
    */
    typedef string model_type;

    typedef string domain_accession;

    /*
    accession - accession of domain model (e.g., PF00244.1, or COG0001)
    cdd_id - (optional) in case of CDD its inner id reported by rps-blast program
    name - name of domain model
    description - description of domain model
    length - length of profile
    model_type - domain model type
    trusted_cutoff - (optional) trusted cutoff of domain model for HMM libraries
    @optional cdd_id trusted_cutoff
    */
    typedef structure {
        domain_accession accession;
        string cdd_id;
        string name;
        string description;
        int length;
        model_type model_type;
        float trusted_cutoff;
    } DomainModel;

    typedef structure {
        string file_name;
        string shock_id;
    } Handle;

    /* @id ws KBaseGeneFamilies.DomainLibrary */
    typedef string ws_lib_id;

    /*
    id - id of library
    source - source of library (e.g., Cog, Pfam, ...)
    source_url - ftp/http url where library can be downloaded 
    version - version of library release
    release_date - release date of library
    program - program for running domain search
    domain_prefix - prefix of domain accession defining library
    dbxref_prefix - url prefix for db-external referencing
    library_files - library files stored in Shock storage
    domains - domain information
    */
    typedef structure {
        ws_lib_id id;
        domain_source source;
        string source_url;
        string version;
        date release_date;
        program_version program;
        string domain_prefix;
        string dbxref_prefix;
        list<Handle> library_files;
        mapping<domain_accession accession, DomainModel> domains;
    } DomainLibrary;

    /* 
    @id ws KBaseGeneFamilies.DomainModelSet
    */
    typedef string dms_ref;

    /*
    string set_name - name of model set
    */
    typedef structure {
        string set_name;
        mapping<string domain_prefix, ws_lib_id> domain_libs;
        mapping<string domain_prefix, string dbxref_prefix> domain_prefix_to_dbxref_url;
        mapping<domain_accession domain_accession, string description> domain_accession_to_description;
    } DomainModelSet;

    /* 
    @id ws KBaseGenomes.Genome
    */
    typedef string genome_ref;

    typedef tuple<int start_in_feature,int stop_in_feature,float evalue,
    float bitscore, float domain_coverage> domain_place;

    typedef tuple<string feature_id,int feature_start,int feature_stop,int feature_dir,mapping<domain_accession,list<domain_place>>> annotation_element;

    typedef string contig_id;

    /*
    genome_ref genome_ref - reference to genome
    dms_ref used_dms_ref - domain models used for search
    mapping<contig_id, list<annotation_element>> data - 
    list of entrances of different domains into proteins of annotated genome
    (annotation_element -> typedef tuple<string feature_id,int feature_start,int feature_stop,
        int feature_dir,mapping<domain_accession,list<domain_place>>>;
        domain_place -> tuple<int start_in_feature,int stop_in_feature,float evalue,
        float bitscore,float domain_coverage>).
    mapping<contig_id, tuple<int size,int features>> contig_to_size_and_feature_count - 
    feature count and nucleotide size of every contig
    mapping<string feature_id, tuple<contig_id,int feature_index> feature_to_contig_and_index - 
    index of every feature in feature list in every contig
    */
    typedef structure {
        genome_ref genome_ref;
        dms_ref used_dms_ref;
        mapping<contig_id, list<annotation_element>> data;
        mapping<contig_id, tuple<int size,int features>> contig_to_size_and_feature_count;
        mapping<string feature_id, tuple<contig_id,int feature_index>> feature_to_contig_and_index;
    } DomainAnnotation;

    /* 
    @id ws KBaseGeneFamilies.DomainAnnotation
    */
    typedef string domain_annotation_ref;

    /*
    genome_ref genome - genome for domain annotation process
    dms_ref dms_ref - set of domain models that will be searched in defined genome
    string ws - workspace
    string output_result_id - id of resulting object of type DomainAnnotation
    */
    typedef structure {
        genome_ref genome_ref;
        dms_ref dms_ref;
        string ws;
        domain_annotation_ref output_result_id;
    } SearchDomainsInput;

    /*
    Output is a report, and a DomainAnnotation object
    */
    typedef structure {
	domain_annotation_ref output_result_id;
	string report_name;
	string report_ref;
    } SearchDomainsOutput;

    /*
    Search for domains in a genome
    */
    funcdef search_domains(SearchDomainsInput input) returns (SearchDomainsOutput output) authentication required;

    /* returns version number of service */
    funcdef version() returns (string version);
};
