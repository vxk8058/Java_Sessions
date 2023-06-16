package com.ram;

public class Vehicle {
	public String name;
	public boolean wheels;
	public boolean engine;
	
	public Vehicle () {
		
	}
	
	public Vehicle (String name, boolean wheels, boolean engine) {
		this.name = name;
		this.wheels = wheels;
		this.engine = engine;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean hasWheels() {
		return wheels;
	}
	
	public void setWheels(boolean wheels) {
		this.wheels = wheels;
	}
	
	public boolean hasEngine() {
		return engine;
	}
	
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
}
