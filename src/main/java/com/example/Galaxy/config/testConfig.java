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
		GalaxySystem solarSystem = new GalaxySystem(null,"Solar","0 Light Years");
		GalaxySystem alphaCentauri = new GalaxySystem(null,"Alpha Centauri","4.37 Light Years");
		
		
		
        
		Planets mercury = new Planets(null,"Mercury","Terrestrial Planet",4.879,"https://static.mundoeducacao.uol.com.br/mundoeducacao/conteudo_legenda/e8a8426182d5c9d3ce5d4d6e6358b128.jpg",solarSystem);
		Planets venus = new Planets(null,"Venus","Terrestrial Planet",12.104,"https://www.astronomy.com/wp-content/uploads/sites/2/2021/09/venus_500.jpg?fit=500%2C500",solarSystem);
		Planets earth = new Planets(null,"Earth", "Terrestrial Planet", 12.742, "https://static.todamateria.com.br/upload/pl/an/planetaterra-cke.jpg?auto_optimize=low",solarSystem);
		Planets mars = new Planets(null,"Mars", "Terrestrial Planet", 6.794, "https://static.todamateria.com.br/upload/ma/rt/marte-0.jpg",solarSystem);
	    Planets jupiter = new Planets(null,"Jupiter", "Gas Giant", 139.820, "https://static.todamateria.com.br/upload/pl/an/planetajupiter.jpg?auto_optimize=low",solarSystem);
        Planets saturn = new Planets(null,"Saturn","Gas Giant", 120.536,"https://ichef.bbci.co.uk/news/976/cpsprodpb/3E97/production/_131632061_gettyimages-482675385-1.jpg",solarSystem);
		Planets uranus = new Planets(null,"Uranus","Gas Giant",50.724,"https://ichef.bbci.co.uk/images/ic/480xn/p0257vk5.jpg.webp",solarSystem);
        Planets neptune = new Planets(null,"Neptune","Gas Giant",49.244,"https://cdn.mos.cms.futurecdn.net/PezBzd9Fehsq9XWgWMauVV-1200-80.jpg",solarSystem);
        
        Stars alphaCentauriA = new Stars(null,"Alpha Centauri A","Yellow","Main Sequence",5790.0,alphaCentauri);
        Stars alphaCentauriB = new Stars(null,"Alpha Centauri B","Orange","Main Sequence",5260.0,alphaCentauri);
        Stars proximaCentauri = new Stars(null,"Proxima Centauri","Red","Red Dwarf",3042.0,alphaCentauri);
        Stars sun = new Stars(null,"Sun", "Yellow", "Low Massive", 5.800,solarSystem);
		Stars rigel = new Stars(null,"Rigel", "Blue", "High massive", 11.500,solarSystem);
  
	
        gsRepo.saveAll(Arrays.asList(solarSystem,alphaCentauri));

        starsRepo.saveAll(Arrays.asList(sun, rigel,alphaCentauriA,alphaCentauriB,proximaCentauri));

        planetRepo.saveAll(Arrays.asList(mercury,venus,earth, mars, jupiter,saturn,uranus,neptune));
	
		
		
	
	
	}
	
	

}
