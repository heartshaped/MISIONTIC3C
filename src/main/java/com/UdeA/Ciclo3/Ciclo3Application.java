package com.UdeA.Ciclo3;

import com.UdeA.Ciclo3.modelos.Employee;
import com.UdeA.Ciclo3.modelos.Enterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication (exclude ={SecurityAutoConfiguration.class})
public class Ciclo3Application {

	//@GetMapping("/hello")
	//public String hello(){
	//	return "Hola Ciclo 3... Saldremos vivos de esto!";
	//}

	@GetMapping("/company")
	public String[] company() {
		// Crear una Nueva Empresa
		Enterprise miempresa = new Enterprise("Apollo", "90099887", "123654789", "calle de la buena vida", "Empleado 1", "100");

			miempresa.setName("Zeus"); //cambiamos el nombre de la empresa
			miempresa.setAddress("carrera a la victoria"); //cambiamos el nombre de la direccion
			miempresa.setPhone("3013013014"); // cambiamos el nombre del telefono
			miempresa.setDocument("900555888"); //cambiamos el nombre del NIT

			String[] array1 = new String[4];
			array1[0] = miempresa.getName();
			array1[1] = miempresa.getAddress();
			array1[2] = miempresa.getPhone();
			array1[3] = miempresa.getDocument();

		return array1;
	}
	@GetMapping("/employee")
	public String[] employee() {
		// Crear un Nuevo Empleado
		Employee miempleado = new Employee("Pepe","Zeus","pepe@zeus.com","empleado");

		miempleado.setNombreEmpleado("Paco"); //cambiamos el nombre de la empresa
		miempleado.setLaEmpresa("Apollo"); //cambiamos el nombre de la direccion
		miempleado.setEmail("paco@apollo.com"); // cambiamos el nombre del telefono
		miempleado.setRole("Supervisor"); //cambiamos el nombre del NIT

		String[] array2 = new String[4];
		array2[0] = miempleado.getNombreEmpleado();
		array2[1] = miempleado.getLaEmpresa();
		array2[2] = miempleado.getEmail();
		array2[3] = miempleado.getRole();

		return array2;
	}


	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}


