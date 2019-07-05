package fr.wildcodeschool.java07;

import java.util.ArrayList;

public class Hangar {

	public static void main(String[] args) {
		// nouvelles instances
		
		Car opel = new Car ("Opel");
		Car ford = new Car ("Ford");
		Boat titanic = new Boat ("Titanic");
		Boat france = new Boat ("France");
		
	
    	// il est possible de les stocker dans une même ArrayList
    	ArrayList<Vehicle> vehiclesList = new ArrayList<>();
    	vehiclesList.add(opel);
    	vehiclesList.add(ford);
    	vehiclesList.add(titanic);
    	vehiclesList.add(france);
    	
    	// parcours de la liste
    	for (Vehicle vehicle : vehiclesList) {
    		System.out.println("Je suis " + vehicle.getBrand() + " et je fais " + vehicle.doStuff());
    
    	}
	}

}
