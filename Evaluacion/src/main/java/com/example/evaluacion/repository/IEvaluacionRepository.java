package com.example.evaluacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evaluacion.entities.EvaluacionEntity;

public interface IEvaluacionRepository extends JpaRepository<EvaluacionEntity, Integer> {
    
}
