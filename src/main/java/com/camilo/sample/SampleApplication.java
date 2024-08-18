package com.camilo.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleApplication {

  // este es un comentario que tiene que aparecer en la rama remota
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}

// este es simplemente otro comentario que quiero agregar
