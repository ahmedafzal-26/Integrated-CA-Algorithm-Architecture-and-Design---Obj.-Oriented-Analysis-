/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;

/**
 *
 * @author ahmed
 */
public class NewAnimalType extends Animal{

    //Constructor to initialize a new animal type with specific attributes.
    public NewAnimalType(String name, int age, double weight, String habitat, String healthStatus, String behavior, String dietType, String Type) {
        super(name, age, weight, habitat, healthStatus, behavior, dietType, Type);
    }

    //Abstract Function implementation for displaying detailed information about the animal.
    @Override
    public void displayInfo() {
        
    }
    
}
