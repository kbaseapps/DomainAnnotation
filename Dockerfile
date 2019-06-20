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

RUN add-apt-repository ppa:openjdk-r/ppa \
	&& sudo apt-get update \
	&& sudo apt-get -y install openjdk-8-jdk \
	&& echo java versions: \
	&& java -version \
	&& javac -version \
	&& echo $JAVA_HOME \
	&& ls -l /usr/lib/jvm \
	&& cd /kb/runtime \
	&& rm java \
	&& ln -s /usr/lib/jvm/java-8-openjdk-amd64 java \
	&& ls -l

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

# get most up to date jars, note will be cached so change this RUN to update
RUN cd /kb/dev_container/modules/jars \
    && git pull \
    && . /kb/dev_container/user-env.sh \
    && make deploy \
    && echo "this is only here to force an update: 1"

# -----------------------------------------

COPY ./ /kb/module
RUN mkdir -p /kb/module/work
RUN chmod a+rw -R /kb/module

WORKDIR /kb/module

RUN make all

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
