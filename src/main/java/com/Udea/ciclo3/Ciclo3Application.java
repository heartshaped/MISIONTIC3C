package com.Udea.ciclo3;

import com.Udea.ciclo3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@RestController

public class Ciclo3Application {

	@GetMapping("/hello")
	public String hello (){
		return "Sobreviviendo a java";
	}

	@GetMapping("/test")
	public String test (){
		Empresa Emp = new Empresa("TukiTuki","donde no sopla el viento","12356465","78956421");

		return Emp.getNombre();
	}



	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);

	}

}
