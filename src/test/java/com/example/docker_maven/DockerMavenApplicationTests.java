package com.example.docker_maven;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DockerMavenApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(DockerMavenApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.info("Test case executing...");
        assertEquals(true, true);
    }

}
