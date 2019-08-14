#!/bin/bash
cd data
mkdir -p bin
mkdir -p tmp
cd ./tmp
unamestr=`uname`
if [[ "$unamestr" == 'Linux' ]]; then
	echo "OS architecture: linux"
	########### BLAST #############
	if [ ! -f ../bin/rpsblast.linux ]; then
		echo "Downloading blast..."
		curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.9.0/ncbi-blast-2.9.0+-x64-linux.tar.gz'
		tar -zxvf blast.tar.gz ncbi-blast-2.9.0+/bin/makeprofiledb ncbi-blast-2.9.0+/bin/rpsblast
		mv ./ncbi-blast-2.9.0+/bin/makeprofiledb ../bin/makeprofiledb.linux
		mv ./ncbi-blast-2.9.0+/bin/rpsblast ../bin/rpsblast.linux
		rmdir ./ncbi-blast-2.9.0+/bin
		rmdir ./ncbi-blast-2.9.0+
		rm ./blast.tar.gz
	fi
	########### HMMER #############
	if [ ! -f ../bin/hmmscan.linux ]; then
		echo "Downloading hmmer..."
		curl -o hmmer.tar.gz 'http://eddylab.org/software/hmmer3/3.2.1/hmmer-3.2.1-linux-intel-x86_64.tar.gz'
		tar -zxvf hmmer.tar.gz hmmer-3.2.1-linux-intel-x86_64/binaries/hmmscan hmmer-3.2.1-linux-intel-x86_64/binaries/hmmpress
		mv ./hmmer-3.2.1-linux-intel-x86_64/binaries/hmmscan ../bin/hmmscan.linux
		mv ./hmmer-3.2.1-linux-intel-x86_64/binaries/hmmpress ../bin/hmmpress.linux
		rmdir ./hmmer-3.2.1-linux-intel-x86_64/binaries
		rmdir ./hmmer-3.2.1-linux-intel-x86_64
		rm ./hmmer.tar.gz
	fi
elif [[ "$unamestr" == 'Darwin' ]]; then
	echo "OS architecture: mac os x"
	########### BLAST #############
	if [ ! -f ../bin/rpsblast.macosx ]; then
		echo "Downloading blast..."
		curl -o blast.tar.gz 'ftp://ftp.ncbi.nlm.nih.gov/blast/executables/blast+/2.9.0/ncbi-blast-2.9.0+-universal-macosx.tar.gz'
		tar -zxvf blast.tar.gz ncbi-blast-2.9.0+/bin/makeprofiledb ncbi-blast-2.9.0+/bin/rpsblast
		mv ./ncbi-blast-2.9.0+/bin/makeprofiledb ../bin/makeprofiledb.macosx
		mv ./ncbi-blast-2.9.0+/bin/rpsblast ../bin/rpsblast.macosx
		rmdir ./ncbi-blast-2.9.0+/bin
		rmdir ./ncbi-blast-2.9.0+
		rm ./blast.tar.gz
	fi
	########### HMMER #############
	if [ ! -f ../bin/hmmscan.macosx ]; then
		echo "Downloading hmmer..."
		curl -o hmmer.tar.gz 'http://eddylab.org/software/hmmer3/3.2.1/hmmer-3.2.1-macosx-intel.tar.gz'
		tar -zxvf hmmer.tar.gz hmmer-3.2.1-macosx-intel/binaries/hmmscan hmmer-3.2.1-macosx-intel/binaries/hmmpress
		mv ./hmmer-3.2.1-macosx-intel/binaries/hmmscan ../bin/hmmscan.macosx
		mv ./hmmer-3.2.1-macosx-intel/binaries/hmmpress ../bin/hmmpress.macosx
		rmdir ./hmmer-3.2.1-macosx-intel/binaries
		rmdir ./hmmer-3.2.1-macosx-intel
		rm ./hmmer.tar.gz
	fi
else
	echo "Unknown OS architecture: $unamestr"
fi
