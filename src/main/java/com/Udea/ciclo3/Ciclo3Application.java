package com.Udea.ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class Ciclo3Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola :P";

	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
		System.out.println("Hola Mundo");
	}

}
