package com.example.Galaxy.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.Galaxy.entities.Planets;
import com.example.Galaxy.repository.PlanetsRepository;

@Configuration
public class testConfig implements CommandLineRunner {
	
	@Autowired
	PlanetsRepository planetRepo;

	@Override
	public void run(String... args) throws Exception {
	Planets earth = new Planets(null,"Earth","Terrestrial Planet",12.742,"https://static.todamateria.com.br/upload/pl/an/planetaterra-cke.jpg?auto_optimize=low");
	Planets mars = new Planets(null,"Mars","Terrestrial Planet",6.794,"https://static.todamateria.com.br/upload/ma/rt/marte-0.jpg");
	Planets jupiter = new Planets(null,"Jupiter","Gas Giant",142.985,"https://static.todamateria.com.br/upload/pl/an/planetajupiter.jpg?auto_optimize=low");
	
	planetRepo.saveAll(Arrays.asList(earth,mars,jupiter));
	}
	
	

}
