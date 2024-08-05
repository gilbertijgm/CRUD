 
package com.todocode.ejercicio2.controller;

import com.todocode.ejercicio2.model.Duenio;
import com.todocode.ejercicio2.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duServi;
    
    @GetMapping("/duenio/traer")
    public List<Duenio> getDuenios(){
        return duServi.getDuenios();
    }
    
    @PostMapping("/duenio/crear")
    public String saveDuenio(@RequestBody Duenio du){
        duServi.saveDuenio(du);
        
        return "Duenio creada correctamente";
    }
    
    @DeleteMapping("/duenio/eliminar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        duServi.deleteDuenio(id);
        
        return "Duenio eliminada con exito";
    }
    
    @PutMapping("/duenio/edit")
    public Duenio editDuenio(@RequestBody Duenio du){
        duServi.editDuenio(du);
        
        return duServi.findDuenioById(du.getId_duenio());
    }
}
