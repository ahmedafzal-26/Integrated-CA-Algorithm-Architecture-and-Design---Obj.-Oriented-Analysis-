/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author ahmed
 */

//Implementation of zoo functions, such as listing animals, retrieving random animals, and adding new species.
//Implements the MenuFunctionService interface to provide functionality.
public class ZooFunctionsImplementation implements MenuFunctionService{
    
    //A map to store animals with unique IDs
    private final HashMap<Integer, Animal> zooMap;
    
    private int animalid = 1;//Counter for assigning unique ID to animals

    
    //Constructor to initialize the zoo map.
    public ZooFunctionsImplementation(){
        
        zooMap = new HashMap<>();
    }

    
    //Lists all animals currently stored in the zoo map.
    //Displays their IDs and detailed information.
    @Override
    public void listAllAnimals(){
        
        System.out.println("Listing all animals:");
        zooMap.forEach((id, animal)->{
            System.out.println("ID: " + id);
            animal.displayInfo();
            System.out.println("--------------------");
        });

    }

    
    //Lists animals by their type like Mammal, Fish and Bird.
    //Iterates through the types and displays animals belonging to each type.
    @Override
    public void listAllTypes(){
        
        System.out.println("Listing animals by type:");

        //Define the order of animal types
        String[] order = {"MAMMAL", "FISH", "BIRD"};

        //Iterate through each type and display animals
        for(String type : order){
            System.out.println(type + "'S:");
            //Use to indicate if animals of the current type exist
            boolean found = false;
            for(HashMap.Entry<Integer, Animal> entry : zooMap.entrySet()){
                Animal animal = entry.getValue();
                if (animal.getType().equals(type)) {
                    animal.displayInfo();
                    found = true;
                }
            }
            if(!found){
                System.out.println("  No " + type + "s found.");
            }
            System.out.println("--------------------");
        }
        
    }

    
     //displays information about a random animal from the zoo map.
     //If the zoo is empty, an appropriate message is displayed.
    @Override
    public void getRandomAnimal(){
        
        if(zooMap.isEmpty()) {
            System.out.println("Sorry, At the moment. No Animals in the zoo.");
            return;
        }

         //Generate a random ID and retrieve the animal
        int randomId = new Random().nextInt(zooMap.size());
        
        Animal randomAnimal = (Animal) zooMap.values().toArray()[randomId];
        
        System.out.println("Random Animal:");
        randomAnimal.displayInfo();
        
    }

    
    /**
     * Adds a new species to the zoo map.
     * Assigns a unique ID to the animal and stores it in the map.
     * 
     * @param animal the Animal object to be added
     */
    @Override
    public void addNewSpecies(Animal animal){
        
        zooMap.put(animalid, animal);//Add animal to the map with a unique ID
        
        System.out.println("Animal added successfully with ID: " + animalid);
        animalid++; //Increment the ID counter - Auto Generated ID
    }
        
}
    

