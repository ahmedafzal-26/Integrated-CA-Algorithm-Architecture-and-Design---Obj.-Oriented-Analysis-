/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;

/**
 *
 * @author ahmed
 */

//Represents a Mammal, inheriting from the abstract class Animal.
//Adds specific behavior for displaying mammal-related information.
 
public class Mammal extends Animal{

    //different Attributes
    private String furColor;
    private String bloodType; //warm-blooded or cold-blooded

    
    
    //Constructor to initialize a mammal - animal type with specific attributes.
    public Mammal(String name, int age, double weight, String habitat, String healthStatus, String behavior, String dietType, String Type, String furColor, String bloodType) {
        super(name, age, weight, habitat, healthStatus, behavior, dietType, Type);
        
        this.furColor = furColor;
        this.bloodType = bloodType;
    }

    
    //Getter and Setter  - For different attributes
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
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
        System.out.println("Fur Color: " + getFurColor());
        System.out.println("Blood Type: " + getBloodType());
        
    }

    
}
