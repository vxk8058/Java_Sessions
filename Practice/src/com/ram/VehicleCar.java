package com.ram;

public class VehicleCar extends Vehicle{
	public String make;
	public String model;
	
	public VehicleCar(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public String getMake()
    {
        return make;
    }
	
	public void setMake (String make) {
		this.make = make;
	}
    
    public String getModel()
    {
        return model;
    }
    
    public void setModel (String model) {
    	this.model = model;
    }
    
    @Override
    public String getName() {
    	return make + " " + model;
    }
    
    public String toString() {
    	return "A " + this.getName() + ".";
    }
}
