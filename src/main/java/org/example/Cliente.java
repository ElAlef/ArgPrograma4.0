package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cuit;
    private String razonSocial;
    private String email;
}
