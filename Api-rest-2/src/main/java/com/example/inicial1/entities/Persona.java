package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Persona")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Persona extends Base {

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "PersonaLibro", joinColumns = @JoinColumn(name = "persona_id"), inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private List<Libro> libros = new ArrayList<>();

}

