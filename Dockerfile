FROM openjdk
EXPOSE 8080
ADD target/lab6_db-1.0-SNAPSHOT.jar lab6_db-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "/lab6_db-1.0-SNAPSHOT.jar"]

