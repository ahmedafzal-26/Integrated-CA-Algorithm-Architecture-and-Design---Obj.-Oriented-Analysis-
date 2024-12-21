/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrated.ca.sample;

/**
 *
 * @author ahmed
 */

 //Abstract base class for all animal types. Defines common properties and behaviors.
 //Includes fields such as name, age, weight, habitat, and health status.
 //Methods for displaying information abstract and must be implemented by child or sub classess.
 
public abstract class Animal {
    
    //Fields to store animal information
    private String name;
    private int age;
    private double weight;
    private String habitat;
    private String healthStatus;
    private String behavior;
    private String dietType;
    private String Type; //It's used to distinguish the list animal by type function

    
    //Constructor to initialize an animal with specific attributes.
    public Animal(String name, int age, double weight, String habitat, String healthStatus, String behavior, String dietType, String Type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.healthStatus = healthStatus;
        this.behavior = behavior;
        this.dietType = dietType;
        this.Type = Type;
    }
    
    //Getter and Setter

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getHabitat(){
        return habitat;
    }
    
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public String getHealthStatus(){
        return healthStatus;
    }
    
    public void setHealthStatus(String healthStatus){
        this.healthStatus = healthStatus;
    }

    public String getBehavior(){
        return behavior;
    }
    
    public void setBehavior(String behavior){
        this.behavior = behavior;
    }

    public String getDietType(){
        return dietType;
    }
    
    public void setDietType(String dietType){
        this.dietType = dietType;
    }
    
    public String getType(){
        return Type;
    }
    
    public void setType(String Type){
        this.Type = Type;
    }

    //Abstarct Function to display the animal information
    public abstract void displayInfo();
    
}
 
