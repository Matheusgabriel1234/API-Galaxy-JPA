package com.example.Galaxy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Galaxy.entities.Stars;
import com.example.Galaxy.services.StarsServices;

@RestController
@RequestMapping("/stars")
public class StarResources {

    @Autowired
    StarsServices serv;
	
    @GetMapping
	public ResponseEntity<List<Stars>> getAll(){
	 List<Stars> star = serv.getAll();
	 return ResponseEntity.ok().body(star);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Stars> getByID(@PathVariable Long id){
		Stars obj = serv.getById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
