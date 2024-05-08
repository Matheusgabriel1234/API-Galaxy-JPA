package com.example.Galaxy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Galaxy.entities.BlackHole;
import com.example.Galaxy.services.BlackHoleServices;

@RestController
@RequestMapping("/blackholes")
public class BlackHoleResources {

	@Autowired
	BlackHoleServices bhServ;
	
	@GetMapping
	public ResponseEntity<List<BlackHole>> findAll(){
		List<BlackHole> bh = bhServ.getAll();
		return ResponseEntity.ok().body(bh);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BlackHole> getById(@PathVariable Long id){
		BlackHole bh = bhServ.getById(id);
		return ResponseEntity.ok().body(bh);
	}
	
}
