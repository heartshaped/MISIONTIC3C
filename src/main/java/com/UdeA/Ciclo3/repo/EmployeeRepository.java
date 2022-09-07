package com.UdeA.Ciclo3.repo;

import com.UdeA.Ciclo3.modelos.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends CrudRepository<Empleado, Integer> {
    @Query(value="SELECT * FROM employee where enterprise_id = ?1", nativeQuery=true)
    public abstract ArrayList<Empleado> findByEmpresa(Integer id);
}
