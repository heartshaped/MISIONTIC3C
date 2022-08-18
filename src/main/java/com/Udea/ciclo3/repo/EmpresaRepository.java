package com.Udea.ciclo3.repo;

import com.Udea.ciclo3.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // anotacion que le dice a Spring que esta clase es un repositorio
public interface EmpresaRepository extends JpaRepository <Empresa,Integer>{
    //se crea el repositorio para comunicar la entidad Empresa y pide un entero para empezar a trabajar
}
