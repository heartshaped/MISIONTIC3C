package com.UdeA.Ciclo3.service;

import com.UdeA.Ciclo3.modelos.MovimientoDinero;
import com.UdeA.Ciclo3.repo.MovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovementService {
    @Autowired
    MovementRepository movementRepository;

    public List<MovimientoDinero> getAllMovement (){    //aca podemos ver todos los movimientos de dinero
        List<MovimientoDinero> MovementList = new ArrayList<>();
        movementRepository.findAll().forEach(movimientoDinero -> MovementList.add(movimientoDinero));
        return MovementList;

    }
    public MovimientoDinero getMovementById(Integer id){    //ver movimientos por id
        return movementRepository.findById(id).get();
    }
    public MovimientoDinero saveOrUpdateMovement (MovimientoDinero movimientoDinero){ //Guardamos o actualizamos un movimento de dinero
        MovimientoDinero move = movementRepository.save(movimientoDinero);
        return move;

    }

    public boolean deleteMovement (Integer id){ //ELIMINAR MOVIMENIENTOS
        movementRepository.deleteById(id);
        if (this.movementRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }
    public ArrayList <MovimientoDinero> getByEmployee(Integer id){ //eliminar movimeientos por el id del empleado
        return movementRepository.findByEmployee(id);
    }
    public ArrayList<MovimientoDinero> getByEnterprise(Integer id){  //liminar movimeientos por el id de la empresa
        return movementRepository.findByEnterprise(id);
    }


}
