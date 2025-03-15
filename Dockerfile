# Use a minimal OpenJDK image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target folder into the container
COPY ./target/java-calculator-1.0-SNAPSHOT.jar /app/java-calculator.jar

# Set the default command to run the application
CMD ["java", "-jar", "/app/java-calculator.jar"]