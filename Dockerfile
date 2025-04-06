FROM openjdk:21-jdk-slim

WORKDIR /app

COPY backend/target/backend*.jar todo.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "todo.jar"]