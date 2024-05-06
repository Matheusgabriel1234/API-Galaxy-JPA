package com.example.Galaxy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Galaxy.entities.GalaxySystem;
import com.example.Galaxy.entities.Stars;
import com.example.Galaxy.repository.StarsRepository;

@Service
public class StarsServices{

	@Autowired
	StarsRepository starRepo;
	
	public List<Stars> getAll(){
		return starRepo.findAll();
	}
	
	public Stars getById(Long id) {
	Optional<Stars> star = starRepo.findById(id);
	return star.orElse(null);
	}
	
	public Stars getByName(String name) {
		Optional<Stars> star = starRepo.findByName(name);
	   return star.orElse(null);
	}
	
}
