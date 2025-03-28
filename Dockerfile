# Use Eclipse Temurin JDK 17
FROM eclipse-temurin:17-jdk-focal

# Set working directory inside the container
WORKDIR /app

# Expose port 8081
EXPOSE 8081

# Copy the JAR file into the container
ADD target/flights.jar flights.jar

# Copy flights.csv into the container's resources folder
COPY src/main/resources/flights.csv /app/resources/flights.csv

# Run the application
ENTRYPOINT ["java", "-jar", "flights.jar"]

