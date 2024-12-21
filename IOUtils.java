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

//class for handling input/output operations.
//Provides methods to validate user input.
//Implements the IOUtilsFunctions interface.

public class IOUtils implements IOUtilsFunctions{
    
    
    /**
     * Get an integer from the user by issuing a prompt
     * Must be within a range provided (min/max)
     * @param prompt the prompt message to issue
     * @param minValue the lowest value allowed
     * @param maxValue the highest value allowed
     * @return a valid int between minValue and maxValue
     */
     public int getUserInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        boolean valid=false;
        
        do{
            System.out.println(prompt); //display prompt
            System.out.println("You must enter a number between " + minValue + " - " + maxValue + ":");
            try{ 
                userInput = myKB.nextInt(); //get a number -- causes an exception if not an int!
                valid = true; // must be OK
            }
            catch(Exception e){
            
                System.out.println("Invalid input - you must enter an integer only");
                myKB.nextLine(); // get rid of return char
            }
            
            //keep going while input is outside valid range, or is not a number at all
        }while(!valid || userInput < minValue || userInput > maxValue);
        
        return userInput;
    }
     
       //Open For Future Extension
}
