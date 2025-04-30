package com.example.evaluacion.entities;

import jakarta.persistence.*;
import lombok.*;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "evaluaciones")
public class EvaluacionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rut_estudiante;
    private int semestre;
    private String asignatura;
    private int nota;
}
