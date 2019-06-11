FROM kbase/kbase:sdkbase2.latest
MAINTAINER John-Marc Chandonia
# -----------------------------------------

# Insert instructions here to install
# any required dependencies for your module.

WORKDIR /kb/module
RUN mkdir -p /kb/module/dependencies/bin

WORKDIR /kb/module/dependencies/bin
RUN curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.2.31/ncbi-blast-2.2.31+-x64-linux.tar.gz'
RUN tar -zxvf blast.tar.gz ncbi-blast-2.2.31+/bin/makeprofiledb ncbi-blast-2.2.31+/bin/rpsblast
RUN mv ./ncbi-blast-2.2.31+/bin/makeprofiledb ../bin/makeprofiledb.linux
RUN mv ./ncbi-blast-2.2.31+/bin/rpsblast ../bin/rpsblast.linux
RUN rmdir ./ncbi-blast-2.2.31+/bin
RUN rmdir ./ncbi-blast-2.2.31+
RUN rm ./blast.tar.gz

WORKDIR /kb/module/dependencies/bin
RUN curl -o hmmer.tar.gz 'http://eddylab.org/software/hmmer3/3.1b2/hmmer-3.1b2-linux-intel-x86_64.tar.gz'
RUN tar -zxvf hmmer.tar.gz hmmer-3.1b2-linux-intel-x86_64/binaries/hmmscan hmmer-3.1b2-linux-intel-x86_64/binaries/hmmpress
RUN mv ./hmmer-3.1b2-linux-intel-x86_64/binaries/hmmscan ../bin/hmmscan.linux
RUN mv ./hmmer-3.1b2-linux-intel-x86_64/binaries/hmmpress ../bin/hmmpress.linux
RUN rmdir ./hmmer-3.1b2-linux-intel-x86_64/binaries
RUN rmdir ./hmmer-3.1b2-linux-intel-x86_64
RUN rm ./hmmer.tar.gz

# -----------------------------------------

COPY ./ /kb/module
RUN mkdir -p /kb/module/work
RUN chmod a+rw -R /kb/module

WORKDIR /kb/module

RUN make all

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
