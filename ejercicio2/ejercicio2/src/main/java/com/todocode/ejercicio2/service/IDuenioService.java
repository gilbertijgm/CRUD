 
package com.todocode.ejercicio2.service;

import com.todocode.ejercicio2.model.Duenio;
import java.util.List;

 
public interface IDuenioService {
    
    public List<Duenio> getDuenios();
    
    public void saveDuenio(Duenio duenio);
    
    public Duenio findDuenioById(Long id);
    
    public void deleteDuenio(Long id);
    
    public void editDuenio(Duenio duenio);
}
