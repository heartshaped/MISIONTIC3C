package com.Udea.ciclo3.controller;


import com.Udea.ciclo3.modelos.Enterprise;
import com.Udea.ciclo3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class Controlador {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping({"/","/verEmpresas"})
    public String viewEnterprise(Model model){
        //creo una lista tomada de la empresa services
        List<Enterprise> listaEnterprise= enterpriseService.getAllEnterprise();
        model.addAttribute("emplist",listaEnterprise);
        return "verEmpresas";
    }
}
