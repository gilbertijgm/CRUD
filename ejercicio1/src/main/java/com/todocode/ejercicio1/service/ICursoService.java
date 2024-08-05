 
package com.todocode.ejercicio1.service;

import com.todocode.ejercicio1.dto.CursoTemaDTO;
import com.todocode.ejercicio1.model.Curso;
import java.util.List;

 
public interface ICursoService {
    
    //mostrar todos los cursos
    public List<Curso> getCursos();
    
    //crear curso
    public void saveCurso(Curso curso);
    
    //eliminar curso
    public void deleteCurso(Long id);
    
    //buscar persona por id
    public Curso getByIdCurso(Long id);
    
    //editar curso
    public void editCurso(Curso curso);
    
    //traer tema de un determinado curso
    public CursoTemaDTO temasPorCurso(Long id_curso);

    //obtener los cursos que contengan como nombre la palabra java
    public List<Curso> getCursosJava();
}
