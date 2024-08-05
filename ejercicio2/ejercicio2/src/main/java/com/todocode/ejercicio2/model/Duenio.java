 
package com.todocode.ejercicio2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

 @Getter @Setter
@Entity
public class Duenio {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id_duenio;
     private String dni;
     private String nombre_duenio;
     private String celular;

    public Duenio() {
    }

    public Duenio(Long id_duenio, String dni, String nombre_duenio, String celular) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre_duenio = nombre_duenio;
        this.celular = celular;
    }
     
     
}
