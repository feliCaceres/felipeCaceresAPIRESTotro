package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Domicilio")
@Data
@Builder
public class Domicilio extends Base {

    @Column(name = "Calle")
    private String calle;

    @Column(name = "Numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_Localidad")
    private Localidad localidad;
}
