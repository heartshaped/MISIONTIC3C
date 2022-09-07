package com.UdeA.Ciclo3.controller;

import com.UdeA.Ciclo3.modelos.Empleado;
import com.UdeA.Ciclo3.modelos.Empresa;
import com.UdeA.Ciclo3.service.EmployeeService;
import com.UdeA.Ciclo3.service.EnterpriseService;
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

    // para manejar las Empresas
    @GetMapping("/Companies") //Ver json de todas las empresas
    public List<Empresa> listaEmpresas(){
        return empresaServicio.getAllEnterprise();
    }

    @PostMapping("/Companies") //Guardar el json del body como una nueva empresa o registro en nuestra bd
    public Empresa guardaLaEmpresa(@RequestBody Empresa comp){
        return this.empresaServicio.saveOrUpdateEmpresa(comp);
    }

    @GetMapping(path = "Companies/{id}")
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
            return "Se ha eliminado la empresa con el id" +id;
        }
        else{
            return "No se ha podido eliminar la empresa con el id"+id;
        }
    }

    // para manejar los empleados
    @GetMapping ("/Collaborator") //vemos el listado de todos los empleados
    public List<Empleado> seeEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping ("/Collaborator")   //metodo para guardar un nuevo empleado
    public Optional<Empleado> saveEmpleado(@RequestBody Empleado worker){
        return Optional.ofNullable(this.employeeService.saveOrUpdateEmployee(worker));
    }

    @GetMapping (path = "Collaborator/{id}")      //buscar empleados por id
    public Optional<Empleado> employeeByEnterprise (@PathVariable("id")Integer id){
        return this.employeeService.getEmployeeById(id);
    }
    @GetMapping("/Companies/{id}/Collaborator") //consultar los empleados que pertencecen a una empresa
    public ArrayList<Empleado> EmployeeByEnterprise(@PathVariable("id")Integer id){
        return this.employeeService.buscaPorEmpresa(id);
    }

    @PatchMapping("Collaborator/{id}") // actualizamos la informacion del empleado en la base de datos
    public Empleado actualizaEmployee(@PathVariable("id")Integer id,@RequestBody Empleado empleado){
        Empleado worker = employeeService.getEmployeeById(id).get();
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
}