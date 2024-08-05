package com.todocode.ejercicio1.controller;

import com.todocode.ejercicio1.dto.CursoTemaDTO;
import com.todocode.ejercicio1.model.Curso;
import com.todocode.ejercicio1.service.ICursoService;
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
public class CursoController {

    @Autowired
    private ICursoService cursoServi;

    @GetMapping("/curso/traer")
    public List<Curso> getCursos() {
        return cursoServi.getCursos();
    }

    @PostMapping("/curso/crear")
    public String saveCurso(@RequestBody Curso curso) {
        cursoServi.saveCurso(curso);

        return "Curso creado con exito";
    }

    @DeleteMapping("/curso/delete/{id}")
    public String deleteCurso(@PathVariable Long id) {
        cursoServi.deleteCurso(id);

        return "Curso borrado con exito";
    }

    @PutMapping("/curso/edit")
    public Curso editCurso(@RequestBody Curso curso) {
        cursoServi.editCurso(curso);

        return cursoServi.getByIdCurso(curso.getId_curso());
    }

    //4-Obtener los temas de un determinado curso
    @GetMapping("/curso/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso(@PathVariable Long id_curso) {
        return cursoServi.temasPorCurso(id_curso);

    }

    //5-Obtener todos los cursos que tengan como nombre la palabra "Java
    @GetMapping("/curso/java")
    public List<Curso> getCursosJava() {
        return cursoServi.getCursosJava();

    }
}
