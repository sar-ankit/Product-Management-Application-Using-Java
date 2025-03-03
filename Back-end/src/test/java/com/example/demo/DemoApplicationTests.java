package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {ProjectApplicationTests.YourTestConfiguration.class})

@SpringBootTest
class ProjectApplicationTests {
	@Test
	void contextLoads() {
		// Your test logic here
	}

	@Configuration
	static class YourTestConfiguration {
		// Custom beans or configuration for testing
	}
}
