package com.UdeA.Ciclo3.repo;

import com.UdeA.Ciclo3.modelos.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise,Integer> {
//SE CREA EL REPO PARA COMUNICAR LA ENTIDAD ENTERPRISE Y PIDE UN ENTERO PARA INICIAR A FUNCIONAR

}
