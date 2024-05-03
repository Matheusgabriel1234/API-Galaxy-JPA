package com.example.Galaxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Galaxy.entities.Planets;

public interface PlanetsRepository extends JpaRepository<Planets, Long> {

}
