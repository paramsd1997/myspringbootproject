package com.locationLess.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocationLess {
	@Id
	private long id;
	private String name;
	private String city;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
