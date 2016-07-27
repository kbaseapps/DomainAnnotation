[![Build Status](https://travis-ci.org/jmc/DomainAnnotation.svg?branch=master)](https://travis-ci.org/jmc/DomainAnnotation)

# DomainAnnotation
---

DomainAnnotation is a SDK port of the old Gene Families service, which
finds domains (from public protein domain libraries such as COGs and
Pfam) in proteins in a user-supplied genome.

SETUP:

DomainAnnotation requires binaries from HMMER and RPS-BLAST, which are
retrieved using the "download_3rd_party_bins.sh" script, and used to
format the libraries.  It also adds them to the Docker image.  This is
done automatically as part of the "make" process.

DomainAnnotation requires several public PSSM and HMM libraries, which
are retrieved using the "prepare_3rd_party_dbs.sh" script.  The script
also formats the libraries for use by HMMER or RPS-BLAST.  This is
done automatically as part of the "make" process.

The libraries have to be parsed and stored in DomainModelSet objects
in a public KBase workspace called "KBasePublicGeneDomains."  This
needs to be done once every time a new version of the libraries is
desired (and once each per KBase environment, e.g., ci vs appdev vs
production).  The code to do this is in
domainannotation.DomainModelLibPreparation and needs to be run by a
developer with write access to that workspace.

Once the libraries are downloaded using the script above, the
developer needs to set environment variables: KB_AUTH_TOKEN (e.g., to
`kbase-whoami -t`) and KB_DEPLOYMENT_CONFIG (e.g., to
"/kb/dev_container/modules/kb_sdk/DomainAnnotation/test_local/workdir/config.properties"),
then run "make prepare-library-objects" to create the workspace and
all the library objects needed for this to run.
