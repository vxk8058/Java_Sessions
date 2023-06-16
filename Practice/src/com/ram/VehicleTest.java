package com.ram;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle tesla = new VehicleCar("Tesla", "Model 3");
		Vehicle trek = new Vehicle("Bike", true, true);
        Vehicle boat = new Vehicle("Boat", false, true);
        
        Vehicle[] transportation = new Vehicle[3];
        transportation[0] = tesla;
        transportation[1] = trek;
        transportation[2] = boat;
        
        for (int i = 0; i < transportation.length; i++){
            System.out.println("Name: " + transportation[i].getName()); 
         }
	}

}
