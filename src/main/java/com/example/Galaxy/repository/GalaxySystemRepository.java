package com.example.Galaxy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Galaxy.entities.GalaxySystem;

public interface GalaxySystemRepository extends JpaRepository<GalaxySystem, Long> {
Optional<GalaxySystem> getByName(String name);
}
