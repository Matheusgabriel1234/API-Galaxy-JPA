package com.example.Galaxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Galaxy.entities.Galaxy;

public interface GalaxyRepository extends JpaRepository<Galaxy, Long> {

}
