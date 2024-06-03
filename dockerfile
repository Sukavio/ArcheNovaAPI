# Phase 1: Build
FROM gradle:8-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# Phase 2: Run
FROM openjdk:21
WORKDIR /app
COPY --from=build /app/build/libs/*-SNAPSHOT.jar /app/archenova.jar
ENTRYPOINT ["java", "-jar", "/app/archenova.jar"]
