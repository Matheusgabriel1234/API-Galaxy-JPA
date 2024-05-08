package com.example.Galaxy.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.Galaxy.entities.Galaxy;
import com.example.Galaxy.entities.GalaxySystem;
import com.example.Galaxy.entities.Planets;
import com.example.Galaxy.entities.Stars;
import com.example.Galaxy.repository.BlackHoleRepository;
import com.example.Galaxy.repository.GalaxyRepository;
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
	
	@Autowired
	BlackHoleRepository bhRepo;
	
	@Autowired
	GalaxyRepository galaxyRepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		Galaxy milkyWay = new Galaxy( null,"Milky Way", "0.0 Light Years");
		
		
		GalaxySystem tauCetiSystem = new GalaxySystem(null,"Tau Ceti","12 Light Years",milkyWay);
		GalaxySystem solarSystem = new GalaxySystem(null,"Solar","0 Light Years",milkyWay);
		GalaxySystem alphaCentauri = new GalaxySystem(null,"Alpha Centauri","4.37 Light Years",milkyWay);
		GalaxySystem rigelStarSystem = new GalaxySystem(null,"Rigel Star System","860 Light Years",milkyWay);
		
		
		
		
		
        
		Planets mercury = new Planets(null,"Mercury","Terrestrial Planet",4.879,"https://static.mundoeducacao.uol.com.br/mundoeducacao/conteudo_legenda/e8a8426182d5c9d3ce5d4d6e6358b128.jpg",solarSystem);
		Planets venus = new Planets(null,"Venus","Terrestrial Planet",12.104,"https://www.astronomy.com/wp-content/uploads/sites/2/2021/09/venus_500.jpg?fit=500%2C500",solarSystem);
		Planets earth = new Planets(null,"Earth", "Terrestrial Planet", 12.742, "https://static.todamateria.com.br/upload/pl/an/planetaterra-cke.jpg?auto_optimize=low",solarSystem);
		Planets mars = new Planets(null,"Mars", "Terrestrial Planet", 6.794, "https://static.todamateria.com.br/upload/ma/rt/marte-0.jpg",solarSystem);
	    Planets jupiter = new Planets(null,"Jupiter", "Gas Giant", 139.820, "https://static.todamateria.com.br/upload/pl/an/planetajupiter.jpg?auto_optimize=low",solarSystem);
        Planets saturn = new Planets(null,"Saturn","Gas Giant", 120.536,"https://ichef.bbci.co.uk/news/976/cpsprodpb/3E97/production/_131632061_gettyimages-482675385-1.jpg",solarSystem);
		Planets uranus = new Planets(null,"Uranus","Gas Giant",50.724,"https://ichef.bbci.co.uk/images/ic/480xn/p0257vk5.jpg.webp",solarSystem);
        Planets neptune = new Planets(null,"Neptune","Gas Giant",49.244,"https://cdn.mos.cms.futurecdn.net/PezBzd9Fehsq9XWgWMauVV-1200-80.jpg",solarSystem);
        Planets tauCetiE = new Planets(null,"Tau Ceti E","Rocky Planet",11.536,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Termoplaneta.jpg/1200px-Termoplaneta.jpg",tauCetiSystem);
        Planets tauCetiF = new Planets(null,"Tau Ceti F","Rocky Planet",11.536,"https://cdn.mos.cms.futurecdn.net/uwaVUkqzLqzSdcCW8XUtDE.jpg",tauCetiSystem);
        
        Stars tauCeti = new Stars(null,"Tau Ceti","Yellow","Low Massive",5.344,tauCetiSystem);
        Stars alphaCentauriA = new Stars(null,"Alpha Centauri A","Yellow","Main Sequence",5790.0,alphaCentauri);
        Stars alphaCentauriB = new Stars(null,"Alpha Centauri B","Orange","Main Sequence",5260.0,alphaCentauri);
        Stars proximaCentauri = new Stars(null,"Proxima Centauri","Red","Red Dwarf",3042.0,alphaCentauri);
        Stars sun = new Stars(null,"Sun", "Yellow", "Low Massive", 5.800,solarSystem);
		Stars rigel = new Stars(null,"Rigel", "Blue", "High massive", 11.500,rigelStarSystem);
  
	    galaxyRepo.save(milkyWay);
		
        gsRepo.saveAll(Arrays.asList(solarSystem,alphaCentauri,tauCetiSystem,rigelStarSystem));

        starsRepo.saveAll(Arrays.asList(sun, rigel,alphaCentauriA,alphaCentauriB,proximaCentauri,tauCeti));

        planetRepo.saveAll(Arrays.asList(mercury,venus,earth, mars, jupiter,saturn,uranus,neptune,tauCetiE,tauCetiF));
	
		
		
	
	
	}
	
	

}
