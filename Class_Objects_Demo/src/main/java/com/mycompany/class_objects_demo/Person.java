//this class belongs to this package (folder)
package com.mycompany.class_objects_demo;


//This is a Person class that is a blueprint used to create person objects
//Syntax: accessSpecifier class ClassName {}
public class Person 
{
    //1. fields (attributes) - Describes what a class HAS
         //Syntax: dataType attributeName;
          int age; //person's age
          double height; //person's height in meters
          String name; //person's name
          double weight; //person's weight in kg    
          String eyeColour; //person's eye colour        
          String gender; //person's gender        
          String hairColour; //person's hair colour         
                  
    //2. methods (behaviours) - WHAT an object can do
    public void sleep()
    {
        System.out.println(name + " is sleeping");
    }
    
    public void walk()
    {
        System.out.println(name + " has decided to take a walk");
    }
    
    public void eat()
    {
        System.out.println(name + " is eating! ");
    }
    
    public void read()
    {
        System.out.println(name + " is reading!");
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name +
                                         "\nAge: " + age +   
                                         "\nHeight: " + height +  
                                         "\nWeight: " + weight +
                                         "\nEye Colour: " + eyeColour +
                                         "\nGender: " + gender +
                                         "\nHair Colour: " + hairColour 
                                        );
    
    }
    
}