package com.example.Galaxy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Galaxy.entities.Planets;
import com.example.Galaxy.repository.PlanetsRepository;

@Service
public class PlanetServices{
	
	@Autowired
	PlanetsRepository planetsRepo;
	
	public List<Planets> findAll(){
	return planetsRepo.findAll();
	}
	
	public Planets findById(Long id) {
		Optional<Planets> planets = planetsRepo.findById(id);
		return planets.orElse(null);
	}
	
	public Planets findByName(String name) {
		Optional<Planets> planets = planetsRepo.findByName(name);
		return planets.orElse(null);
	}
}
