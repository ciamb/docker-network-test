FROM openjdk:17 as build
WORKDIR /app
COPY ./target/spring-docker-test-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "spring-docker-test-0.0.1-SNAPSHOT.jar"]
