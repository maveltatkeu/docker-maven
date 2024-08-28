package com.example.docker_maven;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DockerMavenApplication {

    public static Logger logger = LoggerFactory.getLogger(DockerMavenApplication.class);

    public static void main(String[] args) {
        logger.info("Application Executed");
        SpringApplication.run(DockerMavenApplication.class, args);
    }

    @PostConstruct
    public void init() {
        logger.info("Application Started");
    }

}
