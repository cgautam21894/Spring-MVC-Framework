package com.gautam.springmvc;

public class Developer {

	int id;
	String name;

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
