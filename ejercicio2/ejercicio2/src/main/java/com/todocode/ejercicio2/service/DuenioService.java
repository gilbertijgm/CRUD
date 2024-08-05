 
package com.todocode.ejercicio2.service;

import com.todocode.ejercicio2.model.Duenio;
import com.todocode.ejercicio2.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{
    
    @Autowired
    private IDuenioRepository duRepo;

    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> listaDue = duRepo.findAll();
        
        return listaDue;
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duRepo.save(duenio);
    }

    @Override
    public Duenio findDuenioById(Long id) {
        Duenio du = duRepo.findById(id).orElse(null);
        
        return du;
    }

    @Override
    public void deleteDuenio(Long id) {
        duRepo.deleteById(id);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }
    
    
    
}
