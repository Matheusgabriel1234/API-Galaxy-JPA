package com.example.Galaxy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Galaxy.entities.Planets;
import com.example.Galaxy.services.PlanetServices;

@RestController
@RequestMapping("/planets")
public class PlanetsResources  {

	@Autowired
     PlanetServices serv;
	
	@GetMapping 
	public ResponseEntity<List<Planets>> findAll(){
		List<Planets> planets = serv.findAll();
		return ResponseEntity.ok().body(planets);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Planets> findById(@PathVariable Long id){
		Planets planets = serv.findById(id);
		return ResponseEntity.ok().body(planets);
		
	}
	
}
