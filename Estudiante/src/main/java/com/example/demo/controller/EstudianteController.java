package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.EstudianteEntity;
import com.example.demo.repository.IEstudiantesRepository;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {
    
    @Autowired
    private IEstudiantesRepository estudiantesRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EstudianteEntity> getAllUsers(){
        return (List<EstudianteEntity>) estudiantesRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<EstudianteEntity> getByIdUser(@PathVariable Integer id){
        return estudiantesRepository.findById(id)
                .map(resource -> ResponseEntity.ok(resource))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody EstudianteEntity producto){
        estudiantesRepository.save(producto);
    }
}
