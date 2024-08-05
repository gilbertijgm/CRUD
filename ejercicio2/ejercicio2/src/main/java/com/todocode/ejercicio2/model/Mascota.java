 
package com.todocode.ejercicio2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mascota;
    private String nombre_masco;
    private String especie;
    private String raza;
    private String color;
    @OneToOne
    @JoinColumn(name = "un_duenio_id_duenio", referencedColumnName = "id_duenio")
    private Duenio unDuenio;
    
    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre_masco, String especie, String raza, String color, Duenio unDuenio) {
        this.id_mascota = id_mascota;
        this.nombre_masco = nombre_masco;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.unDuenio = unDuenio;
    }
    
    
    
}
