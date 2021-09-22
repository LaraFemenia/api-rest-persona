package com.example.persona.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.persona.entities.Persona;

public interface PersonaService extends BaseService<Persona, Long> {
	List<Persona> search(String filtro) throws Exception;
	Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}
