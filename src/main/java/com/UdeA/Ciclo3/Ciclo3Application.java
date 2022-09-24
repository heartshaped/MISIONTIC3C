package com.UdeA.Ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication (exclude ={SecurityAutoConfiguration.class})
public class Ciclo3Application {

	//@GetMapping("/hello")
	//public String hello(){
	//	return "Hola Ciclo 3... Saldremos vivos de esto!";
	//}

	/*@GetMapping("/company")
	public String[] company() {
		// Crear una Nueva Empresa
		Empresa miempresa = new Empresa("Apollo", "90099887", "123654789", "calle de la buena vida", "Empleado 1", "100");

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
		Empleado miempleado = new Empleado("Pepe","Zeus","pepe@zeus.com","empleado");

		miempleado.setNombreEmpleado("Paco"); //cambiamos el nombre del empleado
		miempleado.setLaEmpresa("Apollo"); //cambiamos el nombre de la empresa donde trabaja el empleado
		miempleado.setEmail("paco@apollo.com"); // cambiamos el nombre del correo
		miempleado.setRole("Supervisor"); //cambiamos el rol del empleado

		String[] array2 = new String[4];
		array2[0] = miempleado.getNombreEmpleado();
		array2[1] = miempleado.getLaEmpresa();
		array2[2] = miempleado.getEmail();
		array2[3] = miempleado.getRole();

		return array2;
	}

	@GetMapping("/transactions")
		public String [] transactions (){
		//crear un movimiento
		MovimientoDinero movimiento = new MovimientoDinero("pago de nomina",547822.76f,"Pepe Trueno");

				movimiento.setConcept("deduccion prestamo con intereses"); //cambiamos el concepto
				movimiento.setAmount(-24100.41f); //cambiamos el valor del movimiento
				movimiento.setElEmpleado("Paco Perez"); //cambiamos el nombre del empleado

		String s = String.valueOf(movimiento.getAmount()); //me toca cnvertir el float del valor del movimeitno a string para llevarlo al array

		String[] array3 = new String[3];
		array3[0] = movimiento.getConcept();
		array3[1] = s;
		array3[2] = movimiento.getElEmpleado();

		return array3;
	}*/
	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}


