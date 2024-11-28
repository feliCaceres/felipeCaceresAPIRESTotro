package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import org.hibernate.query.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {
    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}
