
FROM java:8
EXPOSE 9095
ADD /target/packsendme-country-server-0.0.1-SNAPSHOT.jar packsendme-country-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/packsendme-country-server-0.0.1-SNAPSHOT.jar"]

