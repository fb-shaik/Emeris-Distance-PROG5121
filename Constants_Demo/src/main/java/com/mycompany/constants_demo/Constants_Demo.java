package com.mycompany.constants_demo;

import java.util.Scanner; //step1 - Bring Scanner Class from the import
public class Constants_Demo {
Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //Step 2 - Set-up the app to capture input

        //Constant: a variable whose value cannot change
        // Keyword - final 
        //Syntax: final dataType CONSTANT_NAME = FIXEDVALUE; 
        final double TAX_RATE = 0.25; 
        System.out.println("Please enter the product price: ");
        double price = input.nextDouble();
        
        /*Arthimetic Operators ( Calculations)
             + : Addition
             - : Subtraction
             * : Multiplication
             / : Division
             % : Modulus (Remainder of) 
        Follows the rules of BODMAS
        */
        // Calculate tax and final price
        double tax = price * TAX_RATE; 
        double finalPrice = price + tax;
        
          // Display results
          System.out.println("Original Price: " + price);
          System.out.println("Tax Rate: " + TAX_RATE);
          System.out.println("Tax Amount: " + tax);
          System.out.println("Final Price: " + finalPrice);
        
        // Close scanner
        input.close();
    }
}

/*
Using Scanner  Class to capture input
Asks for product price
Uses a constant TAX_RATE = 0.15
Calculates final price
Displays result
*/