 
package com.todocode.ejercicio2.service;

import com.todocode.ejercicio2.dto.MascoDuenioDTO;
import com.todocode.ejercicio2.model.Mascota;
import com.todocode.ejercicio2.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMasco = mascoRepo.findAll();
        
        return listaMasco;
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public Mascota findMascoById(Long id) {
        Mascota masco = mascoRepo.findById(id).orElse(null);
        
        return masco;
    }

    @Override
    public void deleteMasco(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public void editMasco(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public List<MascoDuenioDTO> mascoDu() {
        MascoDuenioDTO mascodu = new MascoDuenioDTO();
        List<Mascota> listaMasco = this.getMascotas();
        List<MascoDuenioDTO> listaMascoDu = new ArrayList<MascoDuenioDTO>();
        
        for (Mascota masco : listaMasco) {
            mascodu.setNombre_masco(masco.getNombre_masco());
            mascodu.setEspecie(masco.getEspecie());
            mascodu.setRaza(masco.getRaza());
            mascodu.setNombre_duenio(masco.getUnDuenio().getNombre_duenio());
            
            listaMascoDu.add(mascodu);
            mascodu = new MascoDuenioDTO();
        }
        return listaMascoDu;
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();
        
        
        for (Mascota masco:listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                listaCaniches.add(masco);
            }
        }
        return listaCaniches;
    }

    
    
    
    
}
