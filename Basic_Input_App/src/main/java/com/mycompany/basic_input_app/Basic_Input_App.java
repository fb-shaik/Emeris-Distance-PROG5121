package com.mycompany.basic_input_app;

//insert here for the import: import java.packageName.ClassName;
//Placed above the Class Name
//Step1 - Bring in the library import
import java.util.Scanner;

public class Basic_Input_App 
{
    public static void main(String[] args) 
    {//Step2 - Create an object from the imported Scanner class
      //Syntax: ClassName objectName = new ClassName(parameters);
        Scanner input = new Scanner(System.in); 
//only need to have 1 Scanner object for the app as we will reuse this throughout the app
        
        //prompt the user for their name
        System.out.println("Please enter your name? ");
        //Step 3 - Assign the object that is holding the keystroke to a variable
        // dataType variableName = assignedValue;
        String name = input.nextLine(); //clear the input object at this point once the keystrokes are stored in the variable
        
        //prompt the user for their favourite colour
        System.out.println(name + " what is your favourite colour? "); //Alice what is your favourite colour
        String colour = input.nextLine();
        
        //prompt the user for their age
        System.out.println(name + " how old are you? "); //Alice how old are you? 
        int age = input.nextInt();
        input.nextLine();//reset the input object & ready it for whatever dataType would come through from the next prompt
        
        //Prompt: Alice are you a student? (Yes/No)
        System.out.println(name + " are you a student? (True/False) ");
        //Store the response in boolean variable; make sure to look for the correct .next method to use 
       boolean isStudent = input.nextBoolean();
       
       //prompt for grade average?
        System.out.println(name + " what is your grade average? ");
       //Store as a double; make sure to use the correct .next();
       double gradeAverage = input.nextDouble();
       
        
        System.out.println("Hello " + name);
        System.out.println(name + " says her favourite colour is " + colour);
        System.out.println(name + " is " + age + " years old." ); //Alice is "age" years old.
        System.out.println("Student Status: " + isStudent);
        System.out.println(name +"'s grade average is " + gradeAverage);
        
        input.close(); //close off Scanner Class (release the resource from the app)
        
    
    }
}

/*
    This app will look at the use of Scanner Class
    Scanner is a built-in that allows for your app to capture user input from 
    the keyboard
    You have to import Scanner into your project via one of Java's libraries
    Lib: java.util.*; (* is a wildcard symbol) 

*/