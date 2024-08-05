 
package com.todocode.ejercicio1.repository;

import com.todocode.ejercicio1.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long>{
    
}
