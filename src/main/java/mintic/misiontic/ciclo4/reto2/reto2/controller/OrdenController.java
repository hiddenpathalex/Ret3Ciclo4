/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.misiontic.ciclo4.reto2.reto2.controller;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.ciclo4.reto2.reto2.model.Orden;
import mintic.misiontic.ciclo4.reto2.reto2.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hiddenpath
 */
@RestController
@RequestMapping("/api/order")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;
    
    @GetMapping("/all")
    public List<Orden> getAll(){
        return ordenService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Orden> getOrder(@PathVariable("id") int id){
        return ordenService.getOrder(id);
    }
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Orden save (@RequestBody Orden o){
        return ordenService.save(o);
    }
    
    @GetMapping("/zona/{zone}")
    public List<Orden> getZone(@PathVariable("zone") String zone){
        return ordenService.getZone(zone);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Orden update(@RequestBody Orden order){
        return ordenService.update(order);
    } 
}
