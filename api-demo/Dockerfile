FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app
COPY . /app
RUN mvn clean package

FROM eclipse-temurin:21-jre
COPY --from=build /app/target/api-demo-0.0.1-SNAPSHOT.jar ./my-app.jar
CMD ["java", "-jar", "my-app.jar"]