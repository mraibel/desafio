package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estudiantes")
public class EstudianteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rut;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
}
