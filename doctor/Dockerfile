# Use an official Java runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the local JAR file into the container
COPY target/doctor-1.0-SNAPSHOT.jar doctor-service.jar

# Expose the port the app runs on
EXPOSE 8081

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "doctor-service.jar"]

