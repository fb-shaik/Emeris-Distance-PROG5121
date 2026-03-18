package com.mycompany.variables_demo; //don't remove/edit/change; if you do it will break your app


//Every project will have a class that will have the same name as the Project name
//don't remove/edit/change; if you do it will break your app
//The class will have a set of {} enclose the instructions for the project

//Step1 -Import Scanner
import java.util.Scanner;
public class Variables_Demo {
    
    
//This is what we refer to as a Main Method; auto-generated, don't remove/edit/change; if you do it will break your app
//There will always only be one Main Method in a project. 
//The main method has a set {} that will have the code inside it    
    public static void main(String[] args) {
        //Variable - A named container that stores data. One piece
        //Syntax: dataType variableName = initialValue;
        
        String name = "Alice"; //With string you need to use " "  to hold the values 
        int age = 22; 
        double height = 1.65;
        boolean isStudent = true; 
        char exit = 'Y';

        System.out.println("The variable name holds initally: " + name);
   //Step 2: Create Scanner Object
   //Syntax: ClassName objectName = new Classname();
   Scanner input = new Scanner(System.in); //System.in means keyboard input.
   System.out.print("Enter your name: "); //prompt the user to enter their name
   name = input.nextLine();
   
   System.out.print("Enter your age: ");
   age = input.nextInt();
   
    System.out.println("Hello " + name);
    //print out: Next year you will be age + 1
     System.out.println("Next year you will be " + (age + 1));
     input.close(); //Closes off the resource that is being used by the object
        
        
    }
}
