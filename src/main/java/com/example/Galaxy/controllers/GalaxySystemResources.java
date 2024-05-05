package com.example.Galaxy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Galaxy.entities.GalaxySystem;
import com.example.Galaxy.services.GalaxySystemServices;

@RestController
@RequestMapping("/systems")
public class GalaxySystemResources {

	@Autowired
	GalaxySystemServices glSystems;
	
	@GetMapping
	public ResponseEntity<List<GalaxySystem>> getAll(){
		List<GalaxySystem> gs = glSystems.getAll();
		return ResponseEntity.ok().body(gs);		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GalaxySystem> getById(@PathVariable Long id){
	GalaxySystem gs = glSystems.getById(id);
	return ResponseEntity.ok().body(gs);
		
	}
}
