package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Tecnico")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
}
