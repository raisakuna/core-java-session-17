#get the base image: ubuntu
#FROM ubuntu

# install java inside ubuntu
#RUN apt-get update && apt-get install -y openjdk-17-jar

#copy the jar from the system dir to your container repo
#COPY core-java-session-17.jar timesnow.jar

#run the command java -jar  core-java-session-17.jar
#CMD ["java", "-jar","timesnow.jar"]

#=============================================

# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Expose the port your application runs on (change if necessary)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
