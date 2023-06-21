package com.artworks.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaWebAppDemoApplication {

	@GetMapping("/")
	public String home() {
		return ("<H1> Hello World <H1> <br> </br> <p> <ul> <li> Code </li> <li> Read </li> <ul> </p>");
	}

	Movie movies = new Movie();
	

	public static void main(String[] args) {
		SpringApplication.run(JavaWebAppDemoApplication.class, args);
		System.out.println("mom");
	}

}
