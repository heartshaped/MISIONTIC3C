package com.Udea.ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@RestController

public class Ciclo3Application {
	//desactivo para pasar el controlador a metodo controlador en paquete controllador
	//@GetMapping("/hello")
	//public String hello (){
	//	return "Sobreviviendo a java";
	//}

	//@GetMapping("/test")
	//public String test (){
	//	Empresa Emp = new Empresa("TukiTuki","donde no sopla el viento","12356465","78956421");

	//	return Emp.getNombre();
	//}



	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);

	}

}
