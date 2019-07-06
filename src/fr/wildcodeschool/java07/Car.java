package fr.wildcodeschool.java07;

public class Car extends Vehicle {

	public Car (String strand) {  
	    super(strand);  
	}
	
	@Override
    public String doStuff() {
        //return "vroum vroum!";
		return "Je suis " + getBrand() + " et je fais vroum vroum";
	}
	
}
