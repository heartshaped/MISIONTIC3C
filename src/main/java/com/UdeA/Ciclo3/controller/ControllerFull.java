package com.UdeA.Ciclo3.controller;


import com.UdeA.Ciclo3.modelos.Enterprise;
import com.UdeA.Ciclo3.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControllerFull {
    @Autowired
    EnterpriseService enterpriseService;

    @GetMapping ({"/","/VerEmpresas"})
    public String viewEnterprise(Model model){
        List<Enterprise> listaEnterprise= enterpriseService.getAllEnterprise();
        model.addAttribute("emplist",listaEnterprise);
        return "verEmpresas"; //Llamamos al HTML
    }


}
