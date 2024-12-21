/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package integrated.ca.sample;

/**
 *
 * @author ahmed
 */

//Interface for input validation.
//Provides methods to handle user input and check if a string is numeric.

public interface InputValidator {
    
    //Validates user input based on specific criteria.
    Boolean handleInput(String[] details);
    
    //Checks if a given string represents a numeric value.
    Boolean isNumeric(String str);
    
}
