/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.landscapeescape;

/**
 *
 * @author nmagongo
 * 1. import the scanner
 * 2. 
 */



import java.util.Scanner;
public class LandscapeEscape {

    public static void main(String[] args) {
        System.out.println("Welcome to the LANDSCAPE ESCAPE Program");
        
        Scanner scan = new Scanner(System.in);
        
        
        //Prompt the user to enter the swimming pool 1 dimensions
        System.out.println("Enter the pool's length in meters: ");
        double p2Length = scan.nextDouble(); //Also declares the variable
        
        System.out.println("Enter the pool's width in meters: ");
        double p2Width = scan.nextDouble();
        
        
       
        //Instantiate 2 objects of the Rectangle class
        Rectangle pool1 = new Rectangle(); //default constructor
        Rectangle pool2 = new Rectangle(p2Length, p2Width);//parameterized constructor with values that come from the user
        Rectangle pool3 = new Rectangle(30, 10); //parameterized constructor with given values
        

         //Display the current pool dimentions for all 3 objects
        //pool1:
        System.out.println("Customer 1's pool dimensions are: " + pool1.toString());
        System.out.println("Customer 2's pool dimensions are: " + pool2.toString());
        System.out.println("Customer 3's pool dimensions are: " + pool3.toString());
        
        //Let's get the dimensions for the default object, pool1
        //System.out.println("Enter Customer 1's pool length");
        pool1.setLength(15);
        pool1.setWidth(5);
        
        //Display the current pool1 dimentions 
        System.out.println("Customer 1's updated pool dimensions are: " + pool1.toString());

        
        
        //call the calcPerimeter method for each pool object(this is a value-returning method)
        System.out.println("The Perimeter for Customer 1's pool is: " + pool1.calcPerimeter());
        System.out.println("The Perimeter for Customer 2's pool is: " + pool2.calcPerimeter());
        System.out.println("The Perimeter for Customer 3's pool is: " + pool3.calcPerimeter());

        
        //System.out.println("Customer 1's pool perimeter is: " + pPerimeter + " meters");
        
        //call the calcArea method for each pool object(this is a value-returning method)
        System.out.println("The Area for Customer 1's pool is: " + pool1.calcArea());
        System.out.println("The Area for Customer 2's pool is: " + pool2.calcArea());
        System.out.println("The Area for Customer 3's pool is: " + pool3.calcArea());
        
        System.out.println("Have a Great Day!");
        scan.close();
    }
    
}
