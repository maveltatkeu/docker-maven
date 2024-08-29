FROM openjdk:21

EXPOSE 8080

LABEL authors="mavel.tatkeu.mbiakop"

ADD target/docker-maven.jar docker-maven.jar

ENTRYPOINT ["java", "-jar", "docker-maven.jar"]