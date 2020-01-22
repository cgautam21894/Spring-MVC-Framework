package com.gautam.springmvc.model;

public class Alien {

	String name;
	int id;
	
	public Alien(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + "]";
	}

}
