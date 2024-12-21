/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;

/**
 * 
 * @author ahmed
 */

//Represents a Bird, inheriting from the abstract class Animal.
//Adds specific behavior for displaying bird-related information.
public class Bird extends Animal{

    //ifferent Attributes
    private String featherColor;
    private String nestType;
    
    
    //Constructor to initialize a bird - animal type with specific attributes.
    public Bird(String name, int age, double weight, String habitat, String healthStatus, String behavior, String dietType, String Type, String featherColor, String nestType) {
        super(name, age, weight, habitat, healthStatus, behavior, dietType, Type);
        
        this.featherColor = featherColor;
        this.nestType = nestType;
    }

    
    //Getter and Setter  - For different attributes
    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getNestType() {
        return nestType;
    }

    public void setNestType(String nestType) {
        this.nestType = nestType;
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
        System.out.println("Feather Color: " + getFeatherColor());
        System.out.println("Nest Type: " + getNestType());
        
        
    }

    
    
}
