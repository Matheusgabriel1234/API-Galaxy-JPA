package com.example.Galaxy.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_stars")
public class Stars implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String color;
	private String typeMass;
	private Double tempKelvin;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "galaxy_system_id", nullable = false)
    private GalaxySystem system;
	
	
	
	public Stars() {
		
	}

	

	public Stars(Long id, String name, String color, String typeMass, Double tempKelvin, GalaxySystem system) {
		super();
		Id = id;
		this.name = name;
		this.color = color;
		this.typeMass = typeMass;
		this.tempKelvin = tempKelvin;
		this.system = system;
	}



	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTypeMass() {
		return typeMass;
	}

	public void setTypeMass(String typeMass) {
		this.typeMass = typeMass;
	}

	public Double getTempKelvin() {
		return tempKelvin;
	}

	public void setTempKelvin(Double tempKelvin) {
		this.tempKelvin = tempKelvin;
	}
	
	
	

	public GalaxySystem getSystem() {
		return system;
	}

	public void setSystem(GalaxySystem system) {
		this.system = system;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stars other = (Stars) obj;
		return Objects.equals(Id, other.Id);
	}
	
	
	
	
	
	
	

	
	
	
	
	

}
