package com.UdeA.Ciclo3.repo;

import com.UdeA.Ciclo3.modelos.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value="SELECT * FROM employee where enterprises_id = ?1", nativeQuery=true)
    public abstract ArrayList<Employee> findByEmpresa(Long id);
}
