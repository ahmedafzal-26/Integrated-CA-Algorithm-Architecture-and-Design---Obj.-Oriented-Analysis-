/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package integrated.ca.sample;

/**
 *
 * @author ahmed
 */

//Interface defining the menu options for the zoo application.
//Contains an enumeration of possible menu selections that the user can choose from.
public interface MenuOptionService {
    
    enum MenuOptions{
        
            // contain a couple of options 
            LIST_ANIMALS,
            LIST_TYPES,
            RANDOM_ANIMAL,
            ADD_SPECIES,
            EXIT

        }
    
    
}
