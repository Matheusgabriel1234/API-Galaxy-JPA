package com.example.Galaxy.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_galaxy")
public class Galaxy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String distance;
	
	@OneToMany(mappedBy = "galaxy",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<GalaxySystem> systems = new ArrayList<>();
	
	public Galaxy() {
		
	}

	

	public Galaxy(Long id, String name, String distance) {
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

	public List<GalaxySystem> getSystems() {
		return systems;
	}

	public void setSystems(List<GalaxySystem> systems) {
		this.systems = systems;
	}
	
	
	
	

}
