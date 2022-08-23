package com.Udea.ciclo3.repo;

import com.Udea.ciclo3.modelos.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




// anotacion que le dice a Spring que esta clase es un repositorio
@Repository
public interface EnterpriseRepository extends JpaRepository <Enterprise,Integer>{
//SE CREA EL REPO PARA COMUNICAR LA ENTIDAD ENTERPRISE Y PIDE UN ENTERO PARA INICIAR A FUNCIONAR
}
