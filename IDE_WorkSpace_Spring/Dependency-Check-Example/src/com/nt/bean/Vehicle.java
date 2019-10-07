package com.nt.bean;


public class Vehicle {
	
	private int id;
	private Engine engine;

	public void setId(int id) {
		this.id = id;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", engine=" + engine + "]";
	}
	
	
	
	
	

}
