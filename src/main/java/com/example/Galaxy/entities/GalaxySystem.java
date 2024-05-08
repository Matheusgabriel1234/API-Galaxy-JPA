package com.example.Galaxy.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	    private List<Stars> estrelas = new ArrayList<>();
		
		@OneToMany(mappedBy = "system", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Planets> planetas = new ArrayList<>();
		
		@JsonIgnore
		@ManyToOne
	    @JoinColumn(name = "galaxy_id", nullable = false)
		private Galaxy galaxy;
		
		
		
		public GalaxySystem() {
			
		}

		
		
	
		
		public GalaxySystem(Long id, String name, String distance, Galaxy galaxy) {
			super();
			this.id = id;
			this.name = name;
			this.distance = distance;
			this.galaxy = galaxy;
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




		public List<Stars> getEstrelas() {
			return estrelas;
		}




		public void setEstrelas(List<Stars> estrelas) {
			this.estrelas = estrelas;
		}




		public List<Planets> getPlanetas() {
			return planetas;
		}




		public void setPlanetas(List<Planets> planetas) {
			this.planetas = planetas;
		}


           



        
		
		
		


		
		
		
		

		

	}

