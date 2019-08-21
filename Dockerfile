FROM kbase/kbase:sdkbase2.latest
MAINTAINER John-Marc Chandonia
# -----------------------------------------

# Insert instructions here to install
# any required dependencies for your module.

WORKDIR /kb/module
RUN mkdir -p /kb/module/dependencies/bin

WORKDIR /kb/module/dependencies/bin
RUN curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.9.0/ncbi-blast-2.9.0+-x64-linux.tar.gz'
RUN tar -zxvf blast.tar.gz ncbi-blast-2.9.0+/bin/makeprofiledb ncbi-blast-2.9.0+/bin/rpsblast
RUN mv ./ncbi-blast-2.9.0+/bin/makeprofiledb makeprofiledb.linux
RUN mv ./ncbi-blast-2.9.0+/bin/rpsblast rpsblast.linux
RUN rmdir ./ncbi-blast-2.9.0+/bin
RUN rmdir ./ncbi-blast-2.9.0+
RUN rm ./blast.tar.gz

WORKDIR /kb/module/dependencies/bin
RUN wget https://anaconda.org/bioconda/hmmer/3.2.1/download/linux-64/hmmer-3.2.1-hf484d3e_1.tar.bz2
RUN tar xvf hmmer-3.2.1-hf484d3e_1.tar.bz2 bin/hmmpress bin/hmmscan
RUN mv ./bin/hmmpress hmmpress.linux
RUN mv ./bin/hmmscan hmmscan.linux
RUN rmdir ./bin
RUN rm ./hmmer-3.2.1-hf484d3e_1.tar.bz2

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
