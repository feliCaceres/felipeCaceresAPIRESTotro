package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "Localidad")
@Data
@Builder
public class Localidad extends Base {

    @Column(name = "Denominacion")
    private String denominacion;

}
