package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Tecnico_especialidad")
public class TecnicoEspecialidad {

    @Id
    @ManyToOne
    @JoinColumn(name = "tecnico1_id")
    private Tecnico tecnico;

    @Id
    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad;
}