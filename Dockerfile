FROM amazoncorretto:17
MAINTAINER Rolon
COPY target/ap-0.0.1-SNAPSHOT.jar ap-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/bap-0.0.1-SNAPSHOT.jar"]