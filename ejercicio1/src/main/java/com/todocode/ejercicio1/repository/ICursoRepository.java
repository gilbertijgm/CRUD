 
package com.todocode.ejercicio1.repository;

import com.todocode.ejercicio1.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long>{
    
}
