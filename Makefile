SERVICE = domainannotation
SERVICE_CAPS = DomainAnnotation
SPEC_FILE = DomainAnnotation.spec
URL = https://kbase.us/services/domainannotation
DIR = $(shell pwd)
LIB_DIR = lib
SCRIPTS_DIR = scripts
TEST_DIR = test
LBIN_DIR = bin
TARGET ?= /kb/deployment
JARS_DIR = $(TARGET)/lib/jars
EXECUTABLE_SCRIPT_NAME = run_$(SERVICE_CAPS)_async_job.sh
STARTUP_SCRIPT_NAME = start_server.sh
TEST_SCRIPT_NAME = run_tests.sh
KB_RUNTIME ?= /kb/runtime
ANT_HOME ?= $(KB_RUNTIME)/ant
ANT = $(KB_RUNTIME)/ant/bin/ant

.PHONY: test

default: compile

all: compile build build-startup-script build-executable-script build-test-script

compile-java-typespec-data:
	gen_java_types -S spec/spec/KBaseGenomes.spec -s lib/src/
	gen_java_types -S spec/spec/KBaseGeneFamilies.spec -s lib/src/
	gen_java_types -S spec/spec/KBaseCollections.spec -s lib/src/
	gen_java_types -S spec/spec/KBaseReport.spec -s lib/src/
	rm lib/src/us/kbase/kbasegenomes/KBaseGenomesClient.java
	rm lib/src/us/kbase/kbasegenomes/KBaseGenomesServer.java
	rm lib/src/us/kbase/kbasegenefamilies/KBaseGeneFamiliesClient.java
	rm lib/src/us/kbase/kbasegenefamilies/KBaseGeneFamiliesServer.java
	rm lib/src/us/kbase/kbasecollections/KBaseCollectionsClient.java
	rm lib/src/us/kbase/kbasecollections/KBaseCollectionsServer.java
	rm lib/src/us/kbase/kbasereport/KBaseReportClient.java
	rm lib/src/us/kbase/kbasereport/KBaseReportServer.java

download-thirdparty-bins:
	./download_3rd_party_bins.sh

prepare-thirdparty-dbs: download-thirdparty-bins
	./prepare_3rd_party_dbs.sh

prepare-library-objects: prepare-thirdparty-dbs compile
	java -jar dist/$(SERVICE_CAPS).jar

compile:
	kb-sdk compile $(SPEC_FILE) \
		--out $(LIB_DIR) \
		--plclname $(SERVICE_CAPS)::$(SERVICE_CAPS)Client \
		--jsclname javascript/Client \
		--pyclname $(SERVICE_CAPS).$(SERVICE_CAPS)Client \
		--javasrc src \
		--java \
		--javasrv \
		--javapackage .;
	$(ANT) war -Djars.dir=$(JARS_DIR)
	chmod +x $(SCRIPTS_DIR)/entrypoint.sh

build:
	$(ANT) war -Djars.dir=$(JARS_DIR)
	chmod +x $(SCRIPTS_DIR)/entrypoint.sh

build-executable-script:
	mkdir -p $(LBIN_DIR)
	$(ANT) build-executable-script -Djars.dir=$(JARS_DIR) -Dexec.cmd.file=$(EXECUTABLE_SCRIPT_NAME)
	chmod +x $(LBIN_DIR)/$(EXECUTABLE_SCRIPT_NAME)

build-startup-script:
	mkdir -p $(LBIN_DIR)
	echo '#!/bin/bash' > $(SCRIPTS_DIR)/$(STARTUP_SCRIPT_NAME)
	echo 'script_dir=$$(dirname "$$(readlink -f "$$0")")' >> $(SCRIPTS_DIR)/$(STARTUP_SCRIPT_NAME)
	echo 'cd $(SCRIPTS_DIR)' >> $(SCRIPTS_DIR)/$(STARTUP_SCRIPT_NAME)
	echo 'java -cp $(JARS_DIR)/jetty/jetty-start-7.0.0.jar:$(JARS_DIR)/jetty/jetty-all-7.0.0.jar:$(JARS_DIR)/servlet/servlet-api-2.5.jar \
		-DKB_DEPLOYMENT_CONFIG=$$script_dir/../deploy.cfg -Djetty.port=5000 org.eclipse.jetty.start.Main jetty.xml' >> $(SCRIPTS_DIR)/$(STARTUP_SCRIPT_NAME)
	chmod +x $(SCRIPTS_DIR)/$(STARTUP_SCRIPT_NAME)

build-test-script:
	echo '#!/bin/bash' > $(TEST_DIR)/$(TEST_SCRIPT_NAME)
	echo 'script_dir=$$(dirname "$$(readlink -f "$$0")")' >> $(TEST_DIR)/$(TEST_SCRIPT_NAME)
	echo 'export KB_DEPLOYMENT_CONFIG=$$script_dir/../deploy.cfg' >> $(TEST_DIR)/$(TEST_SCRIPT_NAME)
	echo 'export KB_AUTH_TOKEN=`cat /kb/module/work/token`' >> $(TEST_DIR)/$(TEST_SCRIPT_NAME)
	echo 'export JAVA_HOME=$(JAVA_HOME)' >> $(TEST_DIR)/$(TEST_SCRIPT_NAME)
	echo '$(ANT) test -Djars.dir=$(JARS_DIR)' >> $(TEST_DIR)/$(TEST_SCRIPT_NAME)
	chmod +x $(TEST_DIR)/$(TEST_SCRIPT_NAME)

test:
	bash $(TEST_DIR)/$(TEST_SCRIPT_NAME)

clean:
	rm -rfv $(LBIN_DIR)
