/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrated.ca.sample;

/**
 *Main class for running the Integrated CA Sample application.
 * Initializes the ZooRunner and starts the application menu.
 * 
 * @author ahmed
 */
public class IntegratedCASample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create an instance of ZooRunner to manage menu operations
        ZooRunner runner = new ZooRunner();
        
        // Run the menu for user interaction
        runner.runMenu();
        
    }
    
}
