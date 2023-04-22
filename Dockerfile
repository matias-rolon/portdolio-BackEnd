FROM amazoncorretto:11-alpine-jdk
MAINTAINER Rolon
COPY target/ap-0.0.1-SNAPSHOT.jar back-ap.jar
ENTRYPOINT ["java","-jar","/back-ap.jar"]
