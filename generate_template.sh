#!/usr/bin/env bash

./gradlew generate -i \
    -Dgroup=com.cognifide.qa.bb \
    -Dversion=1.0-SNAPSHOT \
    -Ptemplate="${TEMPLATE}" \
    -Dname=test-"${TEMPLATE}"

chmod +x generated-project/gradlew
