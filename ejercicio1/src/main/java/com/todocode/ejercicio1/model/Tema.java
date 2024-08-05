
package com.todocode.ejercicio1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tema;
    private String nombre_tema;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    @JsonBackReference
    private Curso curso;
    
    
    public Tema() {
    }

    public Tema(Long id_tema, String nombre_tema, String descripcion, Curso curso) {
        this.id_tema = id_tema;
        this.nombre_tema = nombre_tema;
        this.descripcion = descripcion;
        this.curso = curso;
    }

    
    
    
}
