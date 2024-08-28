#Start with a base image containing Java Runtime
FROM openjdk:21

LABEL authors="mavel.tatkeu.mbiakop"
#Make port 8080 available to the world outside thid container
EXPOSE 8080

ADD target/docker-maven.jar docker-maven.jar
#Run the Jar file
ENTRYPOINT ["java", "-jar", "docker-maven.jar"]