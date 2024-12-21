/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;


/**
 *
 * @author ahmed
 */

//Service class for validating user input.
//Implements the InputValidator interface and provides concrete implementations of its methods.
public class ValidationService implements InputValidator{
    
    //Validates user input based on specific criteria.
    //Checks if the input array has exactly 8 elements and ensures numeric values where required.
    //details an array of input strings to validate
    //return true if input is valid, false otherwise
    @Override
    public Boolean handleInput(String[] details){

        if (details.length == 10){
            if(isNumeric(details[1].trim()) && isNumeric(details[2].trim())){
                return true;//Input is valid
            }else{
                return false;//Input is invalid due to non-numeric values
            }
        }else{
            System.out.println("Invalid Input: Please provide all 10 details.");
        }
        //returns null if the input array length is incorrect
        return null;
    }

    
    //Checks if a given string represents a numeric value.
    //Supports both integers and decimal numbers, including negative values.
    //str the string to check
    //return true if the string is numeric, false otherwise
    //@Override
    public Boolean isNumeric(String str){
        
        // Regex explanation:
        // -?      -> Optional negative sign
        // \\d+    -> One or more digits
        // (\\.\\d+)? -> Optional decimal point followed by digits
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    
    
    
}
