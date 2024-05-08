package com.example.Galaxy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Galaxy.entities.BlackHole;
import com.example.Galaxy.repository.BlackHoleRepository;

@Service
public class BlackHoleServices {

	@Autowired
	BlackHoleRepository bhRepo;
	
	
	public List<BlackHole> getAll(){
		return bhRepo.findAll();
	}
	
	public BlackHole getById(Long id) {
		Optional<BlackHole> blackHole = bhRepo.findById(id);
		return blackHole.orElse(null);
	}
}
