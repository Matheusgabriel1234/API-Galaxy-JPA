package com.example.Galaxy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Galaxy.entities.Galaxy;
import com.example.Galaxy.services.GalaxyService;

@RestController
@RequestMapping("/galaxies")
public class GalaxyResource {
	@Autowired
	GalaxyService galaxyServ;
	
	@GetMapping
	public ResponseEntity<List<Galaxy>> getAll(){
		List<Galaxy> obj = galaxyServ.getAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Galaxy> getById(@PathVariable Long Id){
	 Galaxy obj = galaxyServ.getById(Id);
	 return ResponseEntity.ok().body(obj);
	 
	}

}
