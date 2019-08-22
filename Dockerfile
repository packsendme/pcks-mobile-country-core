
FROM java:8
EXPOSE 9095
ADD /target/packsendme-countryloc-server-0.0.1-SNAPSHOT.jar packsendme-countryloc-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/packsendme-countryloc-server-0.0.1-SNAPSHOT.jar"]

