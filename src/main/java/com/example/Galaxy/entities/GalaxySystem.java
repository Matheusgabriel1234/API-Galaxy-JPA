package com.example.Galaxy.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Systems")
public class GalaxySystem implements Serializable{
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private String distance;
		
		@OneToMany(mappedBy = "system", cascade = CascadeType.ALL, orphanRemoval = true)
	    private Set<Stars> estrelas = new HashSet<>();
		
		@OneToMany(mappedBy = "system", cascade = CascadeType.ALL, orphanRemoval = true)
	    private Set<Planets> planetas = new HashSet<>();
		
		
		
		public GalaxySystem() {
			
		}

		
		
		
		public GalaxySystem(Long id, String name, String distance) {
			super();
			this.id = id;
			this.name = name;
			this.distance = distance;
		}







	public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDistance() {
			return distance;
		}

		public void setDistance(String distance) {
			this.distance = distance;
		}




		public Set<Stars> getEstrelas() {
			return estrelas;
		}




		public void setEstrelas(Set<Stars> estrelas) {
			this.estrelas = estrelas;
		}




		public Set<Planets> getPlanetas() {
			return planetas;
		}




		public void setPlanetas(Set<Planets> planetas) {
			this.planetas = planetas;
		}


        
		
		
		


		
		
		
		

		

	}

