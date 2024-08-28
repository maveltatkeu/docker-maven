package com.example.docker_maven;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DockerMavenApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(DockerMavenApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing second statements ...");
        assertEquals(9, 1+1);
    }

}
