package com.example.Galaxy.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

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
@Table(name= "tb_planets")
public class Planets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String type;
	private Double diameter;
	private String imgUrl;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "galaxy_system_id", nullable = false)
    private GalaxySystem system;
	

	public Planets() {
		
	}



	public Planets(Long id, String name, String type, Double diameter, String imgUrl, GalaxySystem system) {
		super();
		Id = id;
		this.name = name;
		this.type = type;
		this.diameter = diameter;
		this.imgUrl = imgUrl;
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
		Planets other = (Planets) obj;
		return Objects.equals(Id, other.Id);
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getDiameter() {
		return diameter;
	}

	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public GalaxySystem getSystem() {
		return system;
	}

	public void setSystem(GalaxySystem system) {
		this.system = system;
	}
	
	
	
	
	
	
    

}
