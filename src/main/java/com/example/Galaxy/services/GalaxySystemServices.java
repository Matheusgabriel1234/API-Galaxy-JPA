package com.example.Galaxy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Galaxy.entities.GalaxySystem;
import com.example.Galaxy.repository.GalaxySystemRepository;

@Service
public class GalaxySystemServices {
	
	@Autowired
	GalaxySystemRepository gsRepo;
	
	public List<GalaxySystem> getAll(){
		return gsRepo.findAll();
	}
	
	public GalaxySystem getById(Long id) {
		Optional<GalaxySystem> galaxySystem = gsRepo.findById(id);
		return galaxySystem.orElse(null);
		
	}
	
	public GalaxySystem getByName(String name) {
		Optional<GalaxySystem> system = gsRepo.getByName(name);
		return system.orElse(null);
	}
	
	 

}
