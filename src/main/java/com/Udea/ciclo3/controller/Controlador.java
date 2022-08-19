package com.Udea.ciclo3.controller;

import com.Udea.ciclo3.modelos.Empresa;
import com.Udea.ciclo3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class Controlador {
    @Autowired
    EmpresaService empresaService;

    @GetMapping({"/Empresas","/verEmpresas"})
    public String viewEmpresas(Model model){
        //creo una lista tomada de la empresa services
        List<Empresa> listaEmpresas=empresaService.getAllEmpresa();
        model.addAttribute("emplist",listaEmpresas);
        return "VerEmpresa";
    }
}
