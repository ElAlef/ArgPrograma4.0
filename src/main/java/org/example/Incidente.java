package org.example;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Incidente")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String tipoProblema;
    @Enumerated(EnumType.STRING)
    private EstadoIncidente estado;
    private Date fechaIngreso;
    private Date fechaResolucionEstimada;
    private Date fechaResolucionReal;
}
