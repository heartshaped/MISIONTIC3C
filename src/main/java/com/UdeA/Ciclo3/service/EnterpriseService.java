package com.UdeA.Ciclo3.service;

import com.UdeA.Ciclo3.modelos.Enterprise;
import com.UdeA.Ciclo3.repo.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service    //indicamos que estamos creando el servicio, que mas adelante nos va permitir realizar el crud es decir manipular la base de datos
public class EnterpriseService {
    @Autowired  //Conectamos esta clase con el repository de Empresa
    EnterpriseRepository enterpriseRepository;  //aca es donde hacemos uso de clase abstracta y es donde la implementamos a traves de un objeto llamado "empresaRepository"

    public List<Enterprise> getAllEnterprise() {    //creo una clase arraylist de las empresas y lo voy a guardar en getallenterprise
        List<Enterprise> enterpriseList = new ArrayList<>();   //creo un array que me va a traer el listado de todas las empresas y me lo guarda en el array empresalist
        enterpriseRepository.findAll().forEach(enterprise -> enterpriseList.add(enterprise)); // otra forma de hacer la agregacion de listas -> enterpriseList.addAll());

        return enterpriseList;
    }

    //METODO QUE ME TRAE UN OBJETO DE TIPO EMPRESA CUANDO CUENTO CON UN ID
    public Enterprise getEnterpriseById(long id) {
        return enterpriseRepository.findById(id).get();
    }

    public Boolean saveOrUpdateEnterprise(Enterprise empresa) {
        Enterprise comp = enterpriseRepository.save(empresa);
        if (enterpriseRepository.findById(comp.getId())!=null) {
            return true;
        }
        return false;
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
    public Boolean deleteEnterprise(Long id)
    {
        enterpriseRepository.deleteById(id);
        if(enterpriseRepository.findById(id)!=null)
        {
            return true;
        }
        return false;
    }
}
