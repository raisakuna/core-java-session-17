#get the base image: ubuntu
FROM ubuntu

# install java inside ubuntu
RUN apt-get update && apt-get install -y openjdk-17-jar

#copy the jar from the system dir to your container repo
COPY core-java-session-17.jar timesnow.jar

#run the command java -jar  core-java-session-17.jar
CMD ["java", "-jar","timesnow.jar"]