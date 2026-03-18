package com.mycompany.relational_operators_demo;

import javax.swing.JOptionPane;
public class Relational_Operators_Demo {

    public static void main(String[] args) {
        //create to input statements that prompt the user for 2 values
        //Ask the user for their first number
        //Syntax: dataType variableName = JOptionPane.showInputDialog("prompt to the user");
        String input1 = JOptionPane.showInputDialog(null, "Please enter your first value: ");
        //we have parse (convert) that above request that is being treated as String into a numeric data-type so we can
        //use the input as a part of calculations & comparisons
        //we have set-up a numeric variable to convert & hold the captured input
        //Syntax: numericData-Type variableName = numericData-Type.parse(String Variable);
        int num1 = Integer.parseInt(input1); //this is where String input1 becomes int num1 
        
        //Ask the user for their second number
        String input2 = JOptionPane.showInputDialog(null, "Please enter your second value: ");
        int num2 = Integer.parseInt(input2);
        
        //Variables to hold the result of the comparison being done
         String greaterThan = num1 + " Greater Than (>) " + num2 + " : " + (num1 > num2);
         String lessThan = num1 +  " Less Than (<) " + num2 + ": " + (num1 < num2);
         String greaterThanEqual = num1 + " Greater Than Equal (>=) " + num2 + " : " + (num1 >= num2);
         String lessThanEqual = num1 + " Less Than Equal (<=) " + num2 + " : "+ (num1 <= num2);
         String equalTo = num1 + " Equal To (==) " + num2 + " : " + (num1 == num2);
         String notEqualTo =num1 +  " Not Equal (!=) " + num2 + " : "  + (num1 != num2);
         
         String results = greaterThan + "\n"
                                 + lessThan + "\n"
                                 + greaterThanEqual + "\n"
                                 + lessThanEqual + "\n"
                                 + equalTo + "\n"
                                 + notEqualTo; 
         
         JOptionPane.showMessageDialog(null,results, "Relational Operators Results", JOptionPane.INFORMATION_MESSAGE );
                
        
    }
}

/*
Relational Operators
- used to compare two values
- used along with the Boolean Datatype
- Result of a comparison is always either:
	true/false
Datatype: boolean 
boolean variableName = V1 > V2;
boolean result = 5>4; //magic number
boolean result = value1 > value2; 

> Great than
< Less than
>= Greater than or equal to
<= Less than or equal to
== Equals to
!= Not equal to 

*/


