package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.EstudianteEntity;

public interface IEstudiantesRepository extends JpaRepository<EstudianteEntity, Integer> {
    
}
