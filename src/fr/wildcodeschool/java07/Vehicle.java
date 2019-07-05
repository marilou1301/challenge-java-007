package fr.wildcodeschool.java07;

public abstract class Vehicle {

	// attributs  
    private String brand;  
    private int kilometers;  
    
    // constructeurs  
    public Vehicle(String brand) {  
        this.brand = brand;  
        this.kilometers = 0; 
    }
        
    // accesseurs et mutateurs  
    public String getBrand() {  
        return this.brand;  
    }  
      
    public void setBrand(String brand) {  
        this.brand = brand;  
    }  
      
    //méthode "Faire quelque chose" 
    public abstract String doStuff();
}
