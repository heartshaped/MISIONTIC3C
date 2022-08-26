package com.UdeA.Ciclo3.service;

import com.UdeA.Ciclo3.modelos.Empresa;
import com.UdeA.Ciclo3.repo.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public List<Empresa> getAllEnterprise(){
        List<Empresa> enterpriseList = new ArrayList<>();
        enterpriseRepository.findAll().forEach(enterpriseList::add); // otra forma de hacer la agregacion de listas -> enterpriseList.addAll());

        return enterpriseList;
    }
    //METODO QUE ME TRAE UN OBJETO DE TIPO EMPRESA CUANDO CUENTO CON UN ID
    public Empresa getEnterpriseById(int id)
    {

        return enterpriseRepository.findById(id).get();
    }

    //ESTO ESTA DESCTIVADO Y COEMNTADO POR QUE NO SE BIEN COMO MANEJARLO POR EL TIPO DE BUSQUEDA DE ID EN LONG

    //public boolean saveOrUpdateEnterprise(Enterprise enterprise)
    //{
    //metodo para guardar empresa haciendo una busqueda de id y si es verdadero hace el cambio y en caso contrario no
    // se usa el findbyid y el get para busca el id de la empresa
    // Enterprise emp= enterpriseRepository.save(enterprise);
    // if (enterpriseRepository.findById(emp.getId())!=null)
    // {
    //      return true;
    // }
    // return false;
    // }

    //METODO ELIMINAR EMPRESA
    public boolean deleteEnterprise(Integer id)
    {
        enterpriseRepository.deleteById(id);
        if(getEnterpriseById(id)!=null)
        {
            return false;
        }
        return true;
    }
}
