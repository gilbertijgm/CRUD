 
package com.todocode.ejercicio1.dto;

import com.todocode.ejercicio1.model.Tema;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

 
@Getter @Setter
public class CursoTemaDTO {
    
    private String nombreCurso;
    private List<Tema> listaTemas;

    public CursoTemaDTO() {
    }

    public CursoTemaDTO(String nombreCurso, List<Tema> listaTemas) {
        this.nombreCurso = nombreCurso;
        this.listaTemas = listaTemas;
    }
}
