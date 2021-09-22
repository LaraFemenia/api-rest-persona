package com.example.persona.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persona.entities.Localidad;
import com.example.persona.entities.Persona;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.LocalidadRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

	@Autowired
	private LocalidadRepository localidadRepository;
	
	public LocalidadServiceImpl(BaseRepository<Localidad, Long>baseRepository){
		
		super(baseRepository);
		
	}
	
	

}
