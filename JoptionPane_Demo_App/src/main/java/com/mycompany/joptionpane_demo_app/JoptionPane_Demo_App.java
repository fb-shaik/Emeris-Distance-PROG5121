
package com.mycompany.joptionpane_demo_app;

/*
JOptionPane - A class in Java that will allow us to create pop-up dialog boxes (small windows) to interact with users
It belongs to the javax.swing package, which is used for making GUIs (Graphical User Interfaces)
We have to import the swing package to our app before we can use the JOptionPane class

Syntax: import javax.swing.JOptionPane; (this statement sits above the class name of the java file.)
import java.util.Scanner; >This statement is for a Console App using the Scanner class to capture input
 */

//Step1 - Bring in the required import statement
import javax.swing.JOptionPane; 

public class JoptionPane_Demo_App {

    public static void main(String[] args) {
        //prompt the user to enter their name
        String name = JOptionPane.showInputDialog("Please enter your name? "); //gets the user input via the showInputDialog() gui
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");//display the output that was captured in the input GUI
        
        //prompt the user for some numeric data but treated a String dataType
        String ageString = JOptionPane.showInputDialog("Enter your age?"); 
        //JOptionPane.showMessageDialog(null, name + " is " + ageString + " years old!");
    
        //When prompting for numeric input, we have to 'Parse' (convert) the captured input to its correct numeric dataType.
        //convert the JoptionPane String to numeric (int, double, float)
        int age = Integer.parseInt(ageString);
        JOptionPane.showMessageDialog(null, name + " is " + age + " years old!");
        
        //Why do we PARSE numeric data when using JOptionPane:
        //two inputs statements that requests for value 1 & value 2 from the user
        String valueString1 = JOptionPane.showInputDialog("Please enter your first value? ");
        String valueString2 = JOptionPane.showInputDialog("Please enter your second value? ");
        
        //without converting/parsing
        String resultString = valueString1 + valueString2; // we want to add up value1 & value2 
        JOptionPane.showMessageDialog(null, "The result of adding value1 & value2 is: " + resultString);// this is incorrect
        
        //The correct way to handle numeric data
        int value1 = Integer.parseInt(valueString1); //this converts the value captured during the input prompt
        int value2 = Integer.parseInt(valueString2); //this converts the value captured during the input prompt
    
        JOptionPane.showMessageDialog(null, "Lets try that again with Parsing/Converting numeric input");
        
        /*Arithmetic Operators - Used for Calculations
                 + Addition
                 - Subtraction
                 * Multiplication
                 / Division
                % Modulus 
        BODMAS will still apply when using the above operators 
        BODMAS - The sequence in which the calculation will be completed
        */
        
        //calculation
        int addition = value1 + value2; //Addition Operator
        int subtraction = value1 - value2; // Subtraction Operator
        int multiplication = value1 * value2; //Multiplication Operator
        int division = value1 / value2; //Division Operator
        int mod = value1 % value2; // Modulus Operator
       
        //Display the result of each calculation as a seperate JOptionPane dialog pop-up
        JOptionPane.showMessageDialog(null, "The result of adding " +  value1 + " & "  + value2 + " is: " + addition);// this is now correct
        JOptionPane.showMessageDialog(null, "The result of subtracting " +  value1 + " & "  + value2 + " is: " + subtraction);// this is now correct  
        JOptionPane.showMessageDialog(null, "The result of multiplication of " +  value1 + " & "  + value2 + " is: " + multiplication);// this is now correct                JOptionPane.showMessageDialog(null, "The result of adding value1 & value2 is: " + addition);// this is now correct
        JOptionPane.showMessageDialog(null, "The result of division of " +  value1 + " & "  + value2 + " is: " + division );// this is now correct
        JOptionPane.showMessageDialog(null, "The modulus of " +  value1 + " & "  + value2 + " is: " + mod);// this is now correct
    }
}
