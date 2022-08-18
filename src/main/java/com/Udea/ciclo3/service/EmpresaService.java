package com.Udea.ciclo3.service;

import com.Udea.ciclo3.modelos.Empresa;
import com.Udea.ciclo3.repo.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public List<Empresa> getAllEmpresa(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa));

        return empresaList;
    }
//METODO QUE ME TRAE UN OBJETO DE TIPO EMPRESA CUANDO CUENTO CON UN ID
    public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).get();
    }

    public boolean saveOrUpdateEmpresa(Empresa empresa)
    {
        //metodo para guardar empresa haciendo una busqueda de id y si es verdadero hace el cambio y en caso contrario no
        // se usa el findbyid y el get para busca el id de la empresa
        Empresa emp=empresaRepository.save(empresa);
        if (empresaRepository.findById(emp.getId())!=null)
        {
            return true;
        }
        return false;
    }

}
