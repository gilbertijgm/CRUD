 
package com.todocode.ejercicio2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascoDuenioDTO {
    
    private String nombre_masco;
    private String especie;
    private String raza;
    private String nombre_duenio;

    public MascoDuenioDTO() {
    }  

    public MascoDuenioDTO(String nombre_masco, String especie, String raza, String nombre_duenio) {
        
        this.nombre_masco = nombre_masco;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
    }
    
}
