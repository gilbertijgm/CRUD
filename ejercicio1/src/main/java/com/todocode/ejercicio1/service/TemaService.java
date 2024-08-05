
package com.todocode.ejercicio1.service;

import com.todocode.ejercicio1.model.Curso;
import com.todocode.ejercicio1.model.Tema;
import com.todocode.ejercicio1.repository.ICursoRepository;
import com.todocode.ejercicio1.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{
    
    @Autowired
    private ITemaRepository temaRepo;
    private ICursoRepository cursoRepo;

    @Override
    public List<Tema> getTemas() {
        List<Tema> listaTemas = temaRepo.findAll();
        
        return listaTemas;
    }

    @Override
    public void saveTema(Tema tema) {
        
        temaRepo.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public Tema getByIdTema(Long id) {
        Tema tema = temaRepo.findById(id).orElse(null);
        
        return tema;
    }

    @Override
    public void editTema(Tema tema) {
        this.saveTema(tema);
    }
    
    
}
