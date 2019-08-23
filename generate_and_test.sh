#!/usr/bin/env bash

./generate_template.sh
cd generated-project

case $TEMPLATE in
    bobcat-bdd|bobcat-junit5)
        ./gradlew clean test -Dwebdriver.type=remote -Dwebdriver.url=https://${BROWSERSTACK_USERNAME}:${BROWSERSTACK_ACCESS_KEY}@hub-cloud.browserstack.com/wd/hub -Dwebdriver.cap.browserName=chrome -Dwebdriver.cap.os=WINDOWS
        ;;
    bobcat-appium)
        ./gradlew clean test -Dwebdriver.type=ios -Dwebdriver.url=https://${BROWSERSTACK_USERNAME}:${BROWSERSTACK_ACCESS_KEY}@hub-cloud.browserstack.com/wd/hub -Dwebdriver.cap.device="iPhone XR" -Dwebdriver.cap.os_version=12 -Dwebdriver.cap.realMobile=true
        ;;
    *)
        ./gradlew clean assemble
        ;;
esac
