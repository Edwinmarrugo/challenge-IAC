# Dockerfile multi-stage
FROM openjdk:21-jdk-alpine AS build
WORKDIR /app
COPY ..
RUN ./gradlew build

FROM openjdk:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/iac-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]