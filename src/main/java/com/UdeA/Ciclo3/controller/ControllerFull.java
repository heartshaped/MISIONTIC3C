package com.UdeA.Ciclo3.controller;

import com.UdeA.Ciclo3.modelos.Empresa;
import com.UdeA.Ciclo3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ControllerFull { // este es el controlador aca es donde se empieza a interactuar con los servicios creados previamente, desde aca digamos que me maneja "todo el back"
    @Autowired
    EnterpriseService empresaServicio;

    // para manejar las Empresas
    @GetMapping("/Empresas") //Ver json de todas las empresas
    public List<Empresa> listaEmpresas(){
        return empresaServicio.getAllEnterprise();
    }

    @PostMapping("/Empresas") //Guardar el json del body como una nueva empresa o registro en nuestra bd
    public Empresa guardaLaEmpresa(@RequestBody Empresa comp){
        return this.empresaServicio.saveOrUpdateEmpresa(comp);
    }

    @GetMapping(path = "Empresas/{id}")
    public Empresa empresaPorID(@PathVariable("id") Integer id){
        return this.empresaServicio.getEnterpriseById(id);
    }

    @PatchMapping("/Empresas/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id, @RequestBody Empresa empresa){
        Empresa comp = empresaServicio.getEnterpriseById(id);
        comp.setName(empresa.getName());
        comp.setAddress(empresa.getAddress());
        comp.setPhone(empresa.getPhone());
        comp.setDocument(empresa.getDocument());
        return empresaServicio.saveOrUpdateEmpresa(comp);

    }

    @DeleteMapping (path= "Empresas/{id}") //Eliminar registro de la bd
    public String DeleteEmpresa(@PathVariable("id") Integer id){
        boolean respuesta= this.empresaServicio.deleteEnterprise(id);
        if (respuesta){  //Si respuesta es verdadera
            return "Se ha eliminado la empresa con el id" +id;
        }
        else{
            return "No se ha podido eliminar la empresa con el id"+id;
        }
    }

}