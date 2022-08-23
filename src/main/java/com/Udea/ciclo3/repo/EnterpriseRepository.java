package com.Udea.ciclo3.repo;

import com.Udea.ciclo3.modelos.Employee;
import com.Udea.ciclo3.modelos.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // anotacion que le dice a Spring que esta clase es un repositorio
public interface EnterpriseRepository extends JpaRepository <Enterprise,Integer>{
    //se crea el repositorio para comunicar la entidad Empresa y pide un entero para empezar a trabajar
}
