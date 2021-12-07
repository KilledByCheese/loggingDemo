package de.rotation.praktikum.logging.LoggingDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingDemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingDemoApplication.class);

	public static void main(String[] args) {
		logger.info("Starting Spring Application");
		SpringApplication.run(LoggingDemoApplication.class, args);
		logger.info("Startup Completet");
	}

}
