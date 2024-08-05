package com.todocode.ejercicio1.service;

import com.todocode.ejercicio1.dto.CursoTemaDTO;
import com.todocode.ejercicio1.model.Curso;
import com.todocode.ejercicio1.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCurso = cursoRepo.findAll();

        return listaCurso;
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso getByIdCurso(Long id) {
        Curso curso = cursoRepo.findById(id).orElse(null);

        return curso;
    }

    @Override
    public void editCurso(Curso curso) {
        this.saveCurso(curso);
    }

    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {
        //creo una instancia de la clase dto
        CursoTemaDTO curTemDTO = new CursoTemaDTO();

        //busco el curso por id usando el metodo getByIdCurso
        Curso curso = this.getByIdCurso(id_curso);
        //seteo los valores del curso al dto
        curTemDTO.setNombreCurso(curso.getNombre());
        curTemDTO.setListaTemas(curso.getListaTemas());
        //y lo retorno
        return curTemDTO;
    }

    @Override
    public List<Curso> getCursosJava() {
        // Declaro una constante con la palabra "Java" que se usará para buscar en los nombres de los cursos.
        String palabra = "Java";
        // Variable para almacenar temporalmente el nombre del curso que se va a comparar.
        String textoComparar;

        // Obtengo la lista de todos los cursos disponibles llamando a un método (presumiblemente en el mismo
        // objeto/clase) que devuelve esta lista.
        List<Curso> listaCursos = this.getCursos();
        // Creo una nueva lista que almacenará solo los cursos que contienen la palabra "Java" en su nombre.
        List<Curso> listaCursosJava = new ArrayList<Curso>();

        // Itero sobre cada curso en la lista de cursos disponibles.
        for (Curso cur : listaCursos) {
            // Obtengo el nombre del curso actual.
            textoComparar = cur.getNombre();
            // Verifico si el nombre del curso contiene la palabra "Java".
            boolean contieneJava = textoComparar.contains(palabra);
            // Si el nombre del curso contiene la palabra "Java", añado el curso a la lista `listaCursosJava`.
            if (contieneJava == true) {
                listaCursosJava.add(cur);
            }
        }
        // Devuelvo la lista de cursos que contienen la palabra "Java" en su nombre.
        return listaCursosJava;
    }

}
