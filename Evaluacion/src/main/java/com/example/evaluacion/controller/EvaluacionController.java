package com.example.evaluacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.evaluacion.entities.EvaluacionEntity;
import com.example.evaluacion.repository.IEvaluacionRepository;

@RestController
@RequestMapping("/api/evaluaciones")
public class EvaluacionController {


    @Autowired
    private IEvaluacionRepository evaluacionRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EvaluacionEntity> getAllUsers(){
        return (List<EvaluacionEntity>) evaluacionRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<EvaluacionEntity> getByIdUser(@PathVariable Integer id){
        return evaluacionRepository.findById(id)
                .map(resource -> ResponseEntity.ok(resource))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody EvaluacionEntity producto){
        evaluacionRepository.save(producto);
    }
    
}
