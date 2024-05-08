package com.example.Galaxy.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_BlackHole")
public class BlackHole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String mass;
	private String type;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "galaxy_id", nullable = false)
	private GalaxySystem system;	
	
	public BlackHole() {
		
	}

	
public BlackHole(Long id, String name, String mass, String type, GalaxySystem system) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.type = type;
		this.system = system;
	}


 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

	
}
