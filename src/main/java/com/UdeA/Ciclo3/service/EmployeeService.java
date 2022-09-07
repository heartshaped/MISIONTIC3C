package com.UdeA.Ciclo3.service;

import com.UdeA.Ciclo3.modelos.Empleado;
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
    public List<Empleado> getAllEmployee(){
        List<Empleado> empleadoList = new ArrayList<>();
        employeeRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }
// ahora vamos a buscar los empleados por id
    public Optional<Empleado> getEmployeeById (Integer id){
        return employeeRepository.findById(id);
    }

//para buscar empleados por empresa
    public ArrayList<Empleado> buscaPorEmpresa(Integer id){
        return employeeRepository.findByEmpresa(id);
    }
    // para guardar o actualizar informacion de los empleados
    public Empleado saveOrUpdateEmployee(Empleado empleado){
        return employeeRepository.save(empleado);
    }
    // para eliminar un empleado por el registro del id
    public boolean deleteEmployee(Integer id){
        employeeRepository.findById(id);
        if (this.employeeRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }
}
