/*package com.UdeA.Ciclo3.controller;

import com.UdeA.Ciclo3.modelos.Employee;
import com.UdeA.Ciclo3.modelos.Empresa;
import com.UdeA.Ciclo3.modelos.MovimientoDinero;
import com.UdeA.Ciclo3.service.EmployeeService;
import com.UdeA.Ciclo3.service.EnterpriseService;
import com.UdeA.Ciclo3.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerFull { // este es el controlador aca es donde se empieza a interactuar con los servicios creados previamente, desde aca digamos que me maneja "todo el back"
    @Autowired
    EnterpriseService empresaServicio;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    MovementService movementService;

    // para manejar las Empresas
    @GetMapping("/Companies") //Ver json de todas las empresas
    public List<Empresa> listaEmpresas(){
        return empresaServicio.getAllEnterprise();
    }

    @PostMapping("/Companies") //Guardar el json del body como una nueva empresa o registro en nuestra bd
    public Empresa guardaLaEmpresa(@RequestBody Empresa comp){

        return empresaServicio.saveOrUpdateEmpresa(comp);
    }

    @GetMapping(path = "Companies/{id}") //ver empresas por id
    public Empresa empresaPorID(@PathVariable("id") Integer id){
        return this.empresaServicio.getEnterpriseById(id);
    }

    @PatchMapping("/Companies/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id, @RequestBody Empresa empresa){
        Empresa comp = empresaServicio.getEnterpriseById(id);
        comp.setName(empresa.getName());
        comp.setAddress(empresa.getAddress());
        comp.setPhone(empresa.getPhone());
        comp.setDocument(empresa.getDocument());
        return empresaServicio.saveOrUpdateEmpresa(comp);

    }

    @DeleteMapping (path= "/Companies/{id}") //Eliminar registro de la bd
    public String DeleteEmpresa(@PathVariable("id") Integer id){
        boolean respuesta = this.empresaServicio.deleteEnterprise(id);
        if (respuesta){  //Si respuesta es verdadera
            return " No Se ha eliminado la empresa con el id" + id;
        }
        else{
            return "se ha podido eliminar la empresa con el id" + id;
        }
    }

    // para manejar los empleados
    @GetMapping ("/Collaborator") //vemos el listado de todos los empleados
    public List<Employee> seeEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping ("/Collaborator")   //metodo para guardar un nuevo empleado
    public Optional<Employee> saveEmpleado(@RequestBody Employee worker){
        return Optional.ofNullable(employeeService.saveOrUpdateEmployee(worker));
    }

    @GetMapping (path = "Collaborator/{id}")      //buscar empleados por id
    public Optional<Employee> employeeByEnterprise (@PathVariable("id")Integer id){
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/Companies/{id}/Collaborator") //consultar los empleados que pertencecen a una empresa
    public ArrayList<Employee> EmployeeByEnterprise(@PathVariable("id")Integer id){
        return employeeService.buscaPorEmpresa(id);
    }

    @PatchMapping("Collaborator/{id}") // actualizamos la informacion del empleado en la base de datos
    public Employee actualizaEmployee(@PathVariable("id")Integer id, @RequestBody Employee empleado){
        Employee worker = employeeService.getEmployeeById(id).get();
        worker.setNombreEmpleado(empleado.getNombreEmpleado());
        worker.setEmail(empleado.getEmail());
        worker.setLaEmpresa(empleado.getLaEmpresa());
        worker.setRole(empleado.getRole());
        return employeeService.saveOrUpdateEmployee(worker);

    }

    @DeleteMapping("/Collaborator/{id}")    //eliminamos un empleado por id
    public String DeleteEmplyee(@PathVariable("id")Integer id){
        boolean answer = employeeService.deleteEmployee(id);
        if (answer){
            return "Se ha eliminado correctamente el empleado con el id" + id;
        }
        return "No se ha eliminado correctamente el empleado con el id" + id;
    }
    // para manejar los movimientos
    @GetMapping("/Transactions") //Consultar todos los movimientos
    public List<MovimientoDinero> verMovimientos(){
        return movementService.getAllMovement();
    }

    @PostMapping("/Transactions")
    public Optional<MovimientoDinero> saveMovimiento (@RequestBody MovimientoDinero movimiento) {
        return Optional.ofNullable(movementService.saveOrUpdateMovement(movimiento));
    }
    public MovimientoDinero guardarMovimiento(@RequestBody MovimientoDinero move){
        return movementService.saveOrUpdateMovement(move);
    }

    @GetMapping("/Transactions/{id}") //Consultar movimiento por id
    public MovimientoDinero movimientoPorId(@PathVariable("id") Integer id){
        return movementService.getMovementById(id);
    }

    @PatchMapping("/Transactions/{id}")//Editar o actualizar un movimiento
    public MovimientoDinero actualizarMovimiento(@PathVariable("id") Integer id, @RequestBody MovimientoDinero movimiento){
        MovimientoDinero move = movementService.getMovementById(id);
        move.setConcept(movimiento.getConcept());
        move.setAmount(movimiento.getAmount());
        move.setElEmpleado(movimiento.getElEmpleado());
        return movementService.saveOrUpdateMovement(move);
    }

    @DeleteMapping("/Transactions/{id}")
    public String deleteMovimiento(@PathVariable("id") Integer id){
        boolean respuesta= movementService.deleteMovement(id);
        if (respuesta){
            return "Se elimino correctamente el movimiento con id " + id;
        }
        return "No se pudo eliminar el movimiento con id " + id;
    }

    @GetMapping("/Collaborator/{id}/Transactions") //Consultar movimientos por id del empleado
    public ArrayList<MovimientoDinero> movimientosPorEmpleado(@PathVariable("id") Integer id){
        return movementService.getByEmployee(id);
    }

    @GetMapping("/Companies/{id}/Transactions") //Consultar movimientos que pertenecen a una empresa por el id de la empresa
    public ArrayList<MovimientoDinero> movimientosPorEmpresa(@PathVariable("id") Integer id){
        return movementService.getByEnterprise(id);
    }


}*/

