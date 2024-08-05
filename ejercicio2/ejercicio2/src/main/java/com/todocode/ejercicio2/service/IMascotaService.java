 
package com.todocode.ejercicio2.service;

import com.todocode.ejercicio2.dto.MascoDuenioDTO;
import com.todocode.ejercicio2.model.Mascota;
import java.util.List;

 
public interface IMascotaService {
    
    public List<Mascota> getMascotas();
    
    public void saveMascota(Mascota masco);
    
    public Mascota findMascoById(Long id);
    
    public void deleteMasco(Long id);
    
    public void editMasco(Mascota masco);
    
    public List<MascoDuenioDTO> mascoDu();
    
    public List<Mascota> getCaniches();
}
