package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "autor")
@Data
@Builder
public class Autor extends Base {
    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Biografia", length = 1500)
    private String biografia;
}
