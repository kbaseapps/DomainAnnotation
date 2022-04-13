#!/bin/bash
cd /data
mkdir -p bin
mkdir -p tmp
cd ./tmp
unamestr=`uname`
if [[ "$unamestr" == 'Linux' ]]; then
	echo "OS architecture: linux"
	########### BLAST #############
	if [ ! -f ../bin/rpsblast.linux ]; then
		echo "Downloading blast..."
		curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.13.0/ncbi-blast-2.13.0+-x64-linux.tar.gz'
		tar -zxvf blast.tar.gz ncbi-blast-2.13.0+/bin/makeprofiledb ncbi-blast-2.13.0+/bin/rpsblast
		mv ./ncbi-blast-2.13.0+/bin/makeprofiledb ../bin/makeprofiledb.linux
		mv ./ncbi-blast-2.13.0+/bin/rpsblast ../bin/rpsblast.linux
		rmdir ./ncbi-blast-2.13.0+/bin
		rmdir ./ncbi-blast-2.13.0+
		rm ./blast.tar.gz
	fi
	########### HMMER #############
	if [ ! -f ../bin/hmmscan.linux ]; then
		echo "Downloading hmmer..."
		wget https://anaconda.org/bioconda/hmmer/3.3.2/download/linux-64/hmmer-3.3.2-h1b792b2_1.tar.bz2
		tar xvf hmmer-3.3.2-h1b792b2_1.tar.bz2 bin/hmmpress bin/hmmscan
		mv ./bin/hmmpress ../bin/hmmpress.linux
		mv ./bin/hmmscan ../bin/hmmscan.linux
		rmdir ./bin
		rm ./hmmer-3.3.2-h1b792b2_1.tar.bz2
	fi
elif [[ "$unamestr" == 'Darwin' ]]; then
	echo "OS architecture: mac os x"
	########### BLAST #############
	if [ ! -f ../bin/rpsblast.macosx ]; then
		echo "Downloading blast..."
		curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.13.0/ncbi-blast-2.13.0+-universal-macosx.tar.gz'
		tar -zxvf blast.tar.gz ncbi-blast-2.13.0+/bin/makeprofiledb ncbi-blast-2.13.0+/bin/rpsblast
		mv ./ncbi-blast-2.13.0+/bin/makeprofiledb ../bin/makeprofiledb.macosx
		mv ./ncbi-blast-2.13.0+/bin/rpsblast ../bin/rpsblast.macosx
		rmdir ./ncbi-blast-2.13.0+/bin
		rmdir ./ncbi-blast-2.13.0+
		rm ./blast.tar.gz
	fi
	########### HMMER #############
	if [ ! -f ../bin/hmmscan.macosx ]; then
		echo "Downloading hmmer..."
		wget https://anaconda.org/bioconda/hmmer/3.3.2/download/osx-64/hmmer-3.3.2-h589c0e0_1.tar.bz2
		tar xvf hmmer-3.3.2-h589c0e0_1.tar.bz2 bin/hmmpress bin/hmmscan
		mv ./bin/hmmpress ../bin/hmmpress.macosx
		mv ./bin/hmmscan ../bin/hmmscan.macosx
		rmdir ./bin
		rm ./hmmer-3.3.2-h589c0e0_1.tar.bz2
	fi
else
	echo "Unknown OS architecture: $unamestr"
fi
