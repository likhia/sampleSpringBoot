oc create configmap spring-app-config --from-literal=greeter.message=“%s %s”

## Deploy into openshift
oc new-app ubi8-openjdk-8:1.3~https://github.com/likhia/sampleSpringBoot.git --name=rest-http-s2i  

oc expose service/rest-http-s2i

## After deployed into openshift
oc describe bc/rest-http-s2i

[![CircleCI](https://circleci.com/gh/snowdrop/rest-http-example/tree/master.svg?style=shield)](https://circleci.com/gh/snowdrop/rest-http-example/tree/master)

https://appdev.openshift.io/docs/spring-boot-runtime.html#mission-http-api-spring-boot


