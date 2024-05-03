package com.example.Galaxy.entities;

import java.io.Serializable;
import java.util.Objects;

public class Planets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Id;
	private String name;
	private String type;
	private Double diameter;
	private String imgUrl;
	
	public Planets() {
		
	}

	public Planets(Long id, String name, String type, Double diameter, String imgUrl) {
		super();
		Id = id;
		this.name = name;
		this.type = type;
		this.diameter = diameter;
		this.imgUrl = imgUrl;
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
	
	
	
	
	
	
    

}
