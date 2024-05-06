package com.example.Galaxy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Galaxy.entities.GalaxySystem;
import com.example.Galaxy.entities.Stars;

public interface StarsRepository extends JpaRepository<Stars, Long>{
	Optional<Stars> findByName(String name);
	
}
