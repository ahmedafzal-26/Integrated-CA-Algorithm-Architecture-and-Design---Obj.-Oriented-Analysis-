/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package integrated.ca.sample;

/**
 *
 * @author ahmed
 */

//Interface for defining functions for input/output operations.
//Specifies a contract for methods that classes implementing this interface must provide.

public interface IOUtilsFunctions {
    
    /**
     * Get an integer from the user by issuing a prompt
     * Must be within a range provided (min/max)
     * @param prompt the prompt message to issue
     * @param minValue the lowest value allowed
     * @param maxValue the highest value allowed
     * @return a valid int between minValue and maxValue
     */
     public int getUserInt(String prompt, int minValue, int maxValue);
     
     //Open for future user input methods
     
    
}
