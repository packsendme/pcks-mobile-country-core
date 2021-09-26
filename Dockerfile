FROM openjdk:8-jdk-alpine
EXPOSE 9095
COPY /target/pcks-account-country-core-0.0.1-SNAPSHOT.jar pcks-account-country-core-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/pcks-account-country-core-0.0.1-SNAPSHOT.jar"]