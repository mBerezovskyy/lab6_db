FROM openjdk:8
EXPOSE 8080
ADD target/lab6_db-1.0-SNAPSHOT.jar lab6_db-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/lab6_db-1.0-SNAPSHOT.jar"]