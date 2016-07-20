FROM kbase/kbase:sdkbase.latest
MAINTAINER John-Marc Chandonia
# -----------------------------------------

# Insert instructions here to install
# any required dependencies for your module.

# get a particular version of FEBA code (for provenance/stability):

RUN mkdir -p /kb/module/work/bin

WORKDIR /kb/module/work/bin
RUN curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.2.30/ncbi-blast-2.2.30+-x64-linux.tar.gz'
RUN tar -zxvf blast.tar.gz ncbi-blast-2.2.30+/bin/makeprofiledb ncbi-blast-2.2.30+/bin/rpsblast
RUN mv ./ncbi-blast-2.2.30+/bin/makeprofiledb ../bin/makeprofiledb.linux
RUN mv ./ncbi-blast-2.2.30+/bin/rpsblast ../bin/rpsblast.linux
RUN rmdir ./ncbi-blast-2.2.30+/bin
RUN rmdir ./ncbi-blast-2.2.30+
RUN rm ./blast.tar.gz

WORKDIR /kb/module/work/bin
RUN curl -o hmmer.tar.gz 'http://eddylab.org/software/hmmer3/3.1b1/hmmer-3.1b1-linux-intel-x86_64.tar.gz'
RUN tar -zxvf hmmer.tar.gz hmmer-3.1b1-linux-intel-x86_64/binaries/hmmscan hmmer-3.1b1-linux-intel-x86_64/binaries/hmmpress
RUN mv ./hmmer-3.1b1-linux-intel-x86_64/binaries/hmmscan ../bin/hmmscan.linux
RUN mv ./hmmer-3.1b1-linux-intel-x86_64/binaries/hmmpress ../bin/hmmpress.linux
RUN rmdir ./hmmer-3.1b1-linux-intel-x86_64/binaries
RUN rmdir ./hmmer-3.1b1-linux-intel-x86_64
RUN rm ./hmmer.tar.gz

# -----------------------------------------

COPY ./ /kb/module
RUN mkdir -p /kb/module/work

WORKDIR /kb/module

RUN make

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
