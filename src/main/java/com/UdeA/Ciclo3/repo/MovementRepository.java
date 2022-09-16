package com.UdeA.Ciclo3.repo;

import com.UdeA.Ciclo3.modelos.MovimientoDinero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MovementRepository extends CrudRepository<MovimientoDinero, Integer> {

    //buscar movimientos por empleado
    @Query(value ="select * from transaction where elempleado_id = ?1", nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmployee (Integer id);

    //buscar movimientos por empresa
    @Query (value = "select * from transaction  where elempleado_id in (select id from employee where enterprise_id = ?1)", nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEnterprise(Integer id);
}
