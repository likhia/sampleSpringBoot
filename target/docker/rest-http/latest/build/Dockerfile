FROM registry.access.redhat.com/ubi8/openjdk-8:1.3
ENV JAVA_APP_DIR=/deployments
LABEL org.label-schema.description="Spring Boot - HTTP Example" org.label-schema.version=2.3.2-1-SNAPSHOT org.label-schema.schema-version=1.0 org.label-schema.build-date=2021-04-23T07:13:56.296 org.label-schema.name="Spring Boot - HTTP Example" org.label-schema.vcs-ref=d1eda16fc506388f9800c9af27629c778738a4de org.label-schema.url=https://www.snowdrop.dev/rest-http org.label-schema.vcs-url=https://github.com/likhia/sampleSpringBoot.git
EXPOSE 8080 8778 9779
COPY maven /deployments/
