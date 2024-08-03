package com.camilo.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@RestController
	public static class HelloWorldController {
		@GetMapping("/")
		public String helloWorld() {
			return "If the pipeline works as desired, then this message should show up";
		}
	}

}
