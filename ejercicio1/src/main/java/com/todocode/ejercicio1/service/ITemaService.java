 
package com.todocode.ejercicio1.service;

import com.todocode.ejercicio1.model.Tema;
import java.util.List;

 
public interface ITemaService {
    
    //mostrar todos los cursos
    public List<Tema> getTemas();
    
    //crear curso
    public void saveTema(Tema tema);
    
    //eliminar curso
    public void deleteTema(Long id);
    
    //buscar persona por id
    public Tema getByIdTema(Long id);
    
    //editar curso
    public void editTema(Tema tema);
}
