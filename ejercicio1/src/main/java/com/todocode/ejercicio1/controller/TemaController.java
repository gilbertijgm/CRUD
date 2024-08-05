 
package com.todocode.ejercicio1.controller;

import com.todocode.ejercicio1.model.Curso;
import com.todocode.ejercicio1.model.Tema;
import com.todocode.ejercicio1.service.ITemaService;
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
public class TemaController {
    
    @Autowired
    private ITemaService temaServi;
    
    @GetMapping("/tema/traer")
    public List<Tema> getTemas(){
        return temaServi.getTemas();
    }
    
    @PostMapping("/tema/crear")
    public String saveTema(@RequestBody Tema tema){
         System.out.println("Recibido: " + tema.getCurso());
        temaServi.saveTema(tema);
        
        return "Tema creado con exito";
    }
    
    @DeleteMapping("/tema/delete/{id}")
    public String deleteTema(@PathVariable Long id){
        temaServi.deleteTema(id);
        
        return "Tema borrado con exito";
    }
    
    @PutMapping("/tema/edit")
    public Tema editTema(@RequestBody Tema tema){
        temaServi.editTema(tema);
        
        return temaServi.getByIdTema(tema.getId_tema());
    }
}
