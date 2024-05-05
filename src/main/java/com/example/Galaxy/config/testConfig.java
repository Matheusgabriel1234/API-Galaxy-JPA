package com.example.Galaxy.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.Galaxy.entities.GalaxySystem;
import com.example.Galaxy.entities.Planets;
import com.example.Galaxy.entities.Stars;
import com.example.Galaxy.repository.GalaxySystemRepository;
import com.example.Galaxy.repository.PlanetsRepository;
import com.example.Galaxy.repository.StarsRepository;

@Configuration
public class testConfig implements CommandLineRunner {
	
	@Autowired
	StarsRepository starsRepo;
	
	@Autowired
	PlanetsRepository planetRepo;
	
	@Autowired
	GalaxySystemRepository gsRepo;

	@Override
	public void run(String... args) throws Exception {
		GalaxySystem solarSystem = new GalaxySystem(null,"Solar System","0 Light Years");
		

		Planets earth = new Planets(null,"Earth", "Terrestrial Planet", 12.742, "https://static.todamateria.com.br/upload/pl/an/planetaterra-cke.jpg?auto_optimize=low",solarSystem);
		Planets mars = new Planets(null,"Mars", "Terrestrial Planet", 6.794, "https://static.todamateria.com.br/upload/ma/rt/marte-0.jpg",solarSystem);
		Planets jupiter = new Planets(null,"Jupiter", "Gas Giant", 142.985, "https://static.todamateria.com.br/upload/pl/an/planetajupiter.jpg?auto_optimize=low",solarSystem);

		Stars sun = new Stars(null,"Sun", "Yellow", "Low Massive", 5.800,solarSystem);
		Stars rigel = new Stars(null,"Rigel", "Blue", "High massive", 11.500,solarSystem);
  
	
        gsRepo.save(solarSystem);

        starsRepo.saveAll(Arrays.asList(sun, rigel));

        planetRepo.saveAll(Arrays.asList(earth, mars, jupiter));
	
		
		
	
	
	}
	
	

}
