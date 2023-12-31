FROM maven:3.8.5-openjdk-17 as build
COPY . . 
Run mvn clean package -DskipTests

From openjdk:17.0.1-jdk-slim
COPY --from=build /target/TravelGo-0.0.1-SNAPSHOT.jar TravelGo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "TravelGo.jar"]