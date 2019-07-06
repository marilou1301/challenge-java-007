package fr.wildcodeschool.java07;

public class Boat extends Vehicle {

	public Boat (String strand) {  
	    super(strand);  
	}
	
	@Override
    public String doStuff() {
        // return "glou glou!"; 
		return "Je suis " + getBrand() + " et je fais glou glou";
	}

}
