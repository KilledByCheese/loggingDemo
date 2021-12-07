package de.rotation.praktikum.logging.LoggingDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@GetMapping("/hello")
	public ResponseEntity<String> hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("/hello called");
		logger.debug("name={}", name);
		if(name.equals("World")) {
			logger.warn("No name provided");
		}
		String returnValue = String.format("Hello %s!", name);
		logger.debug("returning: {}", returnValue);
		return ResponseEntity.ok(returnValue);
	}
	
}
