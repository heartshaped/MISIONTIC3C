package com.UdeA.Ciclo3.service;

import com.UdeA.Ciclo3.modelos.Employee;
import com.UdeA.Ciclo3.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    //consultamos el listado de todos los empleados
    public List<Employee> getAllEmployee(){
        List<Employee> empleadoList = new ArrayList<>();
        employeeRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }
// ahora vamos a buscar los empleados por id
    public Optional<Employee> getEmployeeById (Long id){
        return employeeRepository.findById(id);
    }

//para buscar empleados por empresa
    public ArrayList<Employee> buscaPorEmpresa(Long id){
        return employeeRepository.findByEmpresa(id);
    }
    // para guardar o actualizar informacion de los empleados
    public Boolean saveOrUpdateEmployee(Employee empleado) {
        Employee worker = employeeRepository.save(empleado);
        if (employeeRepository.findById(worker.getId()) != null) {
            return true;
        }
        return false;
    }
    // para eliminar un empleado por el registro del id
    public Boolean deleteEmployee(Long id){
        employeeRepository.findById(id);
        if (this.employeeRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }
}
