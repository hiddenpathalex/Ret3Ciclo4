/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.misiontic.ciclo4.reto2.reto2.repository;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.ciclo4.reto2.reto2.crudRepository.OrdenCrudRepository;
import mintic.misiontic.ciclo4.reto2.reto2.model.Orden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hiddenpath
 */
@Repository
public class OrdenRepository {
    @Autowired
    OrdenCrudRepository ordenCrudRepository;
    
    public List<Orden> getAll(){
        return (List<Orden>) ordenCrudRepository.findAll();
    }
    
    public Optional<Orden> getOrden(int id){
        return ordenCrudRepository.findById(id);
    }
    
    public Orden save(Orden o){
        return ordenCrudRepository.save(o);
    }
    
    public void update(Orden o){
        ordenCrudRepository.save(o);
    }
    
    public List<Orden> getZone(String zone){
        return ordenCrudRepository.findBySalesManZone(zone);
    }
    
}
