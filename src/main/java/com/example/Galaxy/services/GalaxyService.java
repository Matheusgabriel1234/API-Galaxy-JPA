package com.example.Galaxy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Galaxy.entities.Galaxy;
import com.example.Galaxy.repository.GalaxyRepository;

@Service
public class GalaxyService {
	
	@Autowired
    GalaxyRepository galaxyRepo;
	
	public List<Galaxy> getAll(){
		return galaxyRepo.findAll();
	}
	
	public Galaxy getById(Long id) {
	Optional<Galaxy> obj = galaxyRepo.findById(id);
	return obj.orElse(null);
	}

}
