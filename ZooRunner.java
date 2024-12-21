/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;


import java.util.Scanner;

/**
 *
 * @author ahmed
 */

//Implements the all Zoo functionanlities in this class - core class in this program
//helps to run the all function
//Implements the MenuOptionService interface possible menu selections that the user can choose from
public class ZooRunner implements MenuOptionService{
   
    //create an instance of ZooFunctionsImplementation to use the methods
    private ZooFunctionsImplementation zoo = new ZooFunctionsImplementation();
    
    private ValidationService VS = new ValidationService();//create an instance of ValidationService to use the methods
    
    IOUtils myInput = new IOUtils(); //create an instance of Input output utilities to handle user input.
    
    Scanner scanner = new Scanner(System.in);

    //Displays the main menu for the Zoo Management System and handles user interactions.
    public void runMenu(){
        
        MenuOptions selectOption = null; //Variable to store the user option
        
        //Menu loop run until the user selects Exit
        do{
            System.out.println("-----------------------------------------------");
            System.out.println("           Zoo Managment System");
            System.out.println("-----------------------------------------------");
            System.out.println("\n1. List All Animals\n2. List All Animals - By Types\n3. Get Random Animal\n4. Add New Species\n5. Exit");
            
            //Get the user choice, ensuring it's between 1 and 5
            int option = myInput.getUserInt("Please choose an option: ", 1, 5);
            
            //Alter user choice to the corresponding MenuOptions enum value
            selectOption = MenuOptions.values()[option - 1];
            
            switch(selectOption){
                case LIST_ANIMALS:
                    //List all animal in the Zoo
                    zoo.listAllAnimals();
                    break;
                case LIST_TYPES:
                    //list all animal by their group
                    zoo.listAllTypes();
                    break;
                case RANDOM_ANIMAL:
                    //Display the randon animal from the zoo
                    zoo.getRandomAnimal();
                    break;
                case ADD_SPECIES:
                    //Add new species into zoo
                    handleAddSpecies();
                    break; 
                case EXIT:
                    //Stop the program
                    System.out.println("Exiting program..");
                    break;     
            }
        }while(selectOption != MenuOptions.EXIT);//Continue til Exit is selected
    }
    
    //Handles the process of adding a new species to the zoo
    private void handleAddSpecies(){
        
        //Ask user to select the type of animal they want to add
        System.out.println("Please select the animal type to add: \n1. Mammal \n2. Fish \n3. Bird");

        //Get user choice and make sure it's between 1 - 3, by using the IOUtils
        int choice = myInput.getUserInt("Please, Enter your Choice", 1, 3);

        String[] details; //Store the details of the animal
        boolean isValidInput = false;
        String prompt = ""; //Store the prompt for the specific animal
        
        //Select the prompt according to the user choice
        switch(choice){
            case 1:
                //for mammal
                prompt = "Mammal, Name, Age, Weight, Habitat, Health Status, Behavior, Diet Type, Animal Type, Fur Color,"
                        + " Blood Type (warm/cold) (comma-separated):";
                break;
            case 2:
                //for fish
                prompt = "Fish, Name, Age, Weight, Habitat, Health Status, Behavior, Diet Type, Animal Type, Fur Color, "
                        + "Blood Type (warm/cold) (comma-separated):";
                break;
            case 3:
                //for bird
                prompt = "Bird, Name, Age, Weight, Habitat, Health Status, Behavior, Diet Type, Animal Type, Fur Color, "
                        + "Blood Type (warm/cold) (comma-separated):";
                break;
        }

        // Loop until valid input is provided
        do{
            System.out.println(prompt); //display prompt to the user
            details = scanner.nextLine().split(",");

            //Validate the user input using validation service class - make sure the the number attributes
            //and numeric values.
            if(VS.handleInput(details)){
                //Input is valid exit from the If loop.
                isValidInput = true;
            }else{
                //Inform user to enter proper details. Invalid Input.
                System.out.println("\nInvalid Input: Please provide exactly 10 details (comma-separated).");
            }
        }while(!isValidInput);// Keep in loop until input is valid

        // Parse the valid input
        try{
            String name = details[0].trim();
            int age = Integer.parseInt(details[1].trim());
            double weight = Double.parseDouble(details[2].trim());
            String habitat = details[3].trim();
            String health = details[4].trim();
            String behavior = details[5].trim();
            String diet = details[6].trim();
            //Use to distinguish the animal based on their group and case sensitive that's why use the to upper case
            String type = details[7].trim().toUpperCase();
            //TWO DIFFERENT ATTRIBUTE - FOR EACH CLASS
            String specificAttribute1 = details[8].trim();
            String specificAttribute2 = details[9].trim();

            //Create ad add the species based on the choice
            switch (choice){
                case 1:
                    zoo.addNewSpecies(new Mammal(name, age, weight, habitat, health, behavior, diet,
                            type, specificAttribute1, specificAttribute2));
                    break;
                case 2:
                    zoo.addNewSpecies(new Fish(name, age, weight, habitat, health, behavior, diet,
                            type, specificAttribute1, specificAttribute2));
                    break;
                case 3:
                    zoo.addNewSpecies(new Bird(name, age, weight, habitat, health, behavior, diet,
                            type, specificAttribute1, specificAttribute2));
                    break;
                default:
                    System.out.println("Invalid choice! No species added.");
                    break;
            }
            
        }catch(NumberFormatException e){
            
            System.out.println("Error: Please ensure Age and Weight are valid numbers.");
            
        }catch(Exception e){
            
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    
}