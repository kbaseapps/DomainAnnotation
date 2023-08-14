FROM kbase/kbase:sdkbase2.latest
MAINTAINER John-Marc Chandonia
# -----------------------------------------

# Insert instructions here to install
# any required dependencies for your module.

WORKDIR /kb/module
RUN mkdir -p /kb/module/dependencies/bin

# get java from old Ubuntu version
RUN add-apt-repository ppa:openjdk-r/ppa \
	&& sudo apt-get update \
	&& sudo apt-get -y install openjdk-8-jdk ant \
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

# update apt/dpkg so that further upgrades will work
RUN apt-get -y upgrade

# NCBI blast needs GOMP_4.0 library, so move from trusty to xenial
RUN grep trusty /etc/apt/sources.list | sed -e s/trusty/xenial/ >> /etc/apt/sources.list
RUN apt-get update && apt-get -y install g++-4.9

WORKDIR /kb/module/dependencies/bin
RUN curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.13.0/ncbi-blast-2.13.0+-x64-linux.tar.gz'
RUN tar -zxvf blast.tar.gz ./ncbi-blast-2.13.0+/bin/makeprofiledb ./ncbi-blast-2.13.0+/bin/rpsblast
RUN mv ./ncbi-blast-2.13.0+/bin/makeprofiledb makeprofiledb.linux
RUN mv ./ncbi-blast-2.13.0+/bin/rpsblast rpsblast.linux
RUN rmdir ./ncbi-blast-2.13.0+/bin
RUN rmdir ./ncbi-blast-2.13.0+
RUN rm ./blast.tar.gz

WORKDIR /kb/module/dependencies/bin
ENV HMMER_VERSION='3.3.2'
RUN \
    curl http://eddylab.org/software/hmmer/hmmer-${HMMER_VERSION}.tar.gz > hmmer-${HMMER_VERSION}.tar.gz && \
    tar xvf hmmer-${HMMER_VERSION}.tar.gz && \
    ln -s hmmer-${HMMER_VERSION} hmmer && \
    rm -f hmmer-${HMMER_VERSION}.tar.gz    
WORKDIR /kb/module/dependencies/bin/hmmer
RUN \
  ./configure --prefix /kb/module/dependencies/bin/hmmer && \
  make && \
  make install
WORKDIR	/kb/module/dependencies/bin
RUN mv ./hmmer/bin/hmmpress hmmpress.linux
RUN mv ./hmmer/bin/hmmscan hmmscan.linux

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
