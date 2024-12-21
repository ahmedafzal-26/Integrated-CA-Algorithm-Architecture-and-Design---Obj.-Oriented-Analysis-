/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;

/**
 * 
 * @author ahmed
 */

//Represents a Fish, inheriting from the abstract class Animal.
//Adds specific behavior for displaying fish-related information.
public class Fish extends Animal{

    
    //different attributes
    private String waterType;
    private String scaleType; // Help fish to swim
    
    //Constructor to initialize a fish - animal type with specific attributes.
    public Fish(String name, int age, double weight, String habitat, String healthStatus, String behavior, String dietType, String Type, String waterType, String scaleType) {
        super(name, age, weight, habitat, healthStatus, behavior, dietType, Type);
        
        this.waterType = waterType;
        this.scaleType = scaleType;
    }
    
    
    //Getter and Setter  - For different attributes
    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String getScaleType() {
        return scaleType;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }

    
    
    
    //Abstract Function implementation for displaying detailed information about the animal.
    @Override
    public void displayInfo() {
        
        System.out.println("Type: " + getType());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Health Status: " + getHealthStatus());
        System.out.println("Behavior: " + getBehavior());
        System.out.println("Diet: " + getDietType());
        System.out.println("Water Type: " + getWaterType());
        System.out.println("Scale Type: " + getScaleType());
        
    }

    
    
}
