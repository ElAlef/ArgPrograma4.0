package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
}
