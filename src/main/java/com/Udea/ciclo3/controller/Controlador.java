package com.Udea.ciclo3.controller;


import com.Udea.ciclo3.modelos.Employee;
import com.Udea.ciclo3.modelos.Enterprise;
import com.Udea.ciclo3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Controller

public class Controlador {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping({"/","/verEmpresas"})
    public String viewEnterprise(Model model){
        //CREO UNA LISTA TOMADA DE LA ENTREPRISESERVICES
        List<Enterprise> listaEnterprise= enterpriseService.getAllEnterprise();
        model.addAttribute("emplist",listaEnterprise);
        return "verEmpresas";
    }

}
