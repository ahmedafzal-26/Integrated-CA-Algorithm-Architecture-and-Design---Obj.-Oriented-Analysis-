/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package integrated.ca.sample;

/**
 *
 * @author ahmed
 */

//Interface defining the menu functionality for zoo operations.
//Provides methods for listing animals, getting a random animal, and adding new species.
 
public interface MenuFunctionService{
    
    
    void listAllAnimals(); //Lists all animals currently in the zoo.
        
    void listAllTypes(); //Lists all animals grouped by their types.
        
    void getRandomAnimal(); //Get Random animal from Hash Map.
    
    void addNewSpecies(Animal animal); //Adds a new species to the zoo.
    
 
}
