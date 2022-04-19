#!/bin/bash
cd /data
mkdir -p db
mkdir -p tmp
cd ./tmp
unamestr=`uname`

if [[ "$unamestr" == 'Linux' ]]; then
    OS='linux'
elif [[ "$unamestr" == 'Darwin' ]]; then
    OS='macos'
fi

########### Pfam #############
if [ ! -f ../db/Pfam-A.hmm.h3f ]; then
    echo "Downloading Pfam..."
    curl -o ../db/Pfam-A.full.gz 'ftp://ftp.ebi.ac.uk/pub/databases/Pfam/releases/Pfam35.0/Pfam-A.full.gz'
    curl -o ../db/Pfam-A.hmm.gz 'ftp://ftp.ebi.ac.uk/pub/databases/Pfam/releases/Pfam35.0/Pfam-A.hmm.gz'
    gzip -d ../db/Pfam-A.hmm.gz
    ../bin/hmmpress.$OS ../db/Pfam-A.hmm
fi

########### TIGRFAMS #############
if [ ! -f ../db/TIGRFAMs_15.0_HMM.LIB.h3f ]; then
    echo "Downloading TIGRFAMs..."
    curl -o ../db/TIGRFAMs_15.0_HMM.LIB.gz 'https://ftp.ncbi.nlm.nih.gov/hmm/TIGRFAMs/release_15.0/TIGRFAMs_15.0_HMM.LIB.gz'
    gzip -d ../db/TIGRFAMs_15.0_HMM.LIB.gz
    ../bin/hmmpress.$OS ../db/TIGRFAMs_15.0_HMM.LIB
fi

########### NCBIFAMS #############
if [ ! -f ../db/hmm_PGAP.LIB.h3f ]; then
    echo "Downloading NCBIFAMs..."
    curl -o ../db/hmm_PGAP.LIB 'https://ftp.ncbi.nlm.nih.gov/hmm/8.0/hmm_PGAP.LIB'
    # fix bug where PRK11594.1 appears twice: remove second instance
    head -n +6493307 ../db/hmm_PGAP.LIB > hmm_PGAP.LIB.tmp
    tail -n +6493536 ../db/hmm_PGAP.LIB >> hmm_PGAP.LIB.tmp
    mv hmm_PGAP.LIB.tmp ../db/hmm_PGAP.LIB
    # now hmmpress should run without error
    ../bin/hmmpress.$OS ../db/hmm_PGAP.LIB
fi

########### CDD #############
if [ ! -f ../db/Csd.rps ]; then
    echo "Downloading CDD..."
    curl -o ../db/cddid.tbl.gz 'ftp://ftp.ncbi.nlm.nih.gov/pub/mmdb/cdd/cddid.tbl.gz'
    curl -o cdd.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/pub/mmdb/cdd/cdd.tar.gz'
    mkdir smp
    cd smp
    # need to do this in multiple steps so we don't run out of disk space
    tar --wildcards -xf ../cdd.tar.gz 'COG*.smp'
    ls -1 COG*.smp > Cog
    ../../bin/makeprofiledb.$OS -in Cog -threshold 9.82 -scale 100.0 -dbtype rps -index true
    mv Cog* ../../db
    rm *.smp

    echo "doing smart"
    tar --wildcards -xf ../cdd.tar.gz 'smart*.smp'
    ls -1 smart*.smp > Smart
    ../../bin/makeprofiledb.$OS -in Smart -threshold 9.82 -scale 100.0 -dbtype rps -index true
    mv Smart* ../../db
    rm *.smp

    echo "doing prk"
    tar --wildcards -xf ../cdd.tar.gz 'PRK*.smp'
    ls -1 PRK*.smp > Prk
    ../../bin/makeprofiledb.$OS -in Prk -threshold 9.82 -scale 100.0 -dbtype rps -index true
    mv Prk* ../../db
    rm *.smp

    echo "doing cdd"
    tar --wildcards -xf ../cdd.tar.gz 'cd*.smp'
    ls -1 cd*.smp > Cdd
    ../../bin/makeprofiledb.$OS -in Cdd -threshold 9.82 -scale 100.0 -dbtype rps -index true
    mv Cdd* ../../db
    rm *.smp

    echo "doing csd"
    tar --wildcards -xf ../cdd.tar.gz 'sd*.smp'
    ls -1 sd*.smp > Csd
    ../../bin/makeprofiledb.$OS -in Csd -threshold 9.82 -scale 100.0 -dbtype rps -index true
    mv Csd* ../../db
    rm *.smp
    cd ..
    rm -rf smp
    rm cdd.tar.gz
fi
