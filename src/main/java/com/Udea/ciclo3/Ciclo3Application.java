package com.Udea.ciclo3;

import com.Udea.ciclo3.modelos.Enterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Collections;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@RestController

public class Ciclo3Application {
	//desactivo para pasar el controlador a metodo controlador en paquete controllador
	//@GetMapping("/hello")
	//public String hello (){
	//	return "Sobreviviendo a java";
	//}

	//ESTA ES UNA PRUEBA DE INSERCION DE DATOS
	//@GetMapping({"/test"})
	//public String test(){
		//LocalDate hoy = LocalDate.now();
		//Enterprise Emp = new Enterprise("tukituki","798sds","987897546","direccion de prueba","admin","cero",
		//		Collections.emptyList(),Collections.emptyList(),LocalDate.now(),LocalDate.now());

	//	return Emp.getName();
	//}



	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);

	}

}
