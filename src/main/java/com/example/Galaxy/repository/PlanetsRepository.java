package com.example.Galaxy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Galaxy.entities.Planets;

public interface PlanetsRepository extends JpaRepository<Planets, Long> {
Optional<Planets> findByName(String name);
}
