
FROM openjdk:8-jdk-alpine
EXPOSE 9095
COPY /target/packsendme-country-server-0.0.1-SNAPSHOT.jar packsendme-country-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/packsendme-country-server-0.0.1-SNAPSHOT.jar"]

