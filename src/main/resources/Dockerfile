FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /build
COPY src/build/src
COPY pom.xml /build/pom.xml
RUN mvn clean package

FROM eclipse-temurin:21-jre-alpine
COPY --from=build /build/target/*.jar /opt/app.jar
CMD["java", "-jar", "/opt/app.jar"]

# docker run -d --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=local -p 5432:5432 postgres:17.2