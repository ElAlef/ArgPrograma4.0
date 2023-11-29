package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String tipoProblema;
}
