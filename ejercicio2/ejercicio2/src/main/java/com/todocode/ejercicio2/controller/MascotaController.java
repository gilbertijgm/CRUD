 
package com.todocode.ejercicio2.controller;

import com.todocode.ejercicio2.dto.MascoDuenioDTO;
import com.todocode.ejercicio2.model.Mascota;
import com.todocode.ejercicio2.service.IMascotaService;
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
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServi;
    
    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas(){
        return mascoServi.getMascotas();
    }
    
    @PostMapping("/mascota/crear")
    public String saveMasco(@RequestBody Mascota masco){
        mascoServi.saveMascota(masco);
        
        return "Mascota creada correctamente";
    }
    
    @DeleteMapping("/mascota/eliminar/{id}")
    public String deleteMasco(@PathVariable Long id){
        mascoServi.deleteMasco(id);
        
        return "Mascota eliminada con exito";
    }
    
    @PutMapping("/mascota/edit")
    public Mascota editMasco(@RequestBody Mascota masco){
        mascoServi.editMasco(masco);
        
        return mascoServi.findMascoById(masco.getId_mascota());
    }
    
    //4-Obtener datos combinados de mascota y dueño
    @GetMapping("/mascota/mascodu")
    public List<MascoDuenioDTO> mascoDu() {
       return mascoServi.mascoDu();

    }
    
    @GetMapping("/mascota/traer-caniches")
    public List<Mascota> traerCaniches() {
        return mascoServi.getCaniches();
    }
}
