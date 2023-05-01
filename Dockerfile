FROM eclipse-temurin:17 as build
WORKDIR /build
ADD ./ .
RUN ./gradlew clean build

FROM openjdk:21-ea-17-jdk-slim as run
COPY --from=build "/build/build/libs/playground-open-id-connect-0.0.1-SNAPSHOT.jar" ./
EXPOSE 8080
CMD java -jar ./playground-open-id-connect-0.0.1-SNAPSHOT.jar