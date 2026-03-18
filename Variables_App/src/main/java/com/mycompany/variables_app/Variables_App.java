package com.mycompany.variables_app;

//this is the class name (Variables_App), will be the same as the 
//project name
public class Variables_App 
{//the opening curly brace for the main method
    
//line 9 - We refer this to the main method >>> brains of the app
    public static void main(String[] args) {
        //method body >>> holds the code of the app
        
        //sout + tab Key : Auto inserts the below line
        // " double qoutation holds the text to be displayed"
        System.out.println("=== Without Variables ===");
        System.out.println("Name: Fatima");
        System.out.println("Age: 100");
        System.out.println("Email: happy@gmail.com");
        System.out.println("Score: 50.25");
        
        
        System.out.println("=== With Variables ===");
        //Syntax to declare a variable
        //dataType variableName = initialValue; (camelCase)
        
        String name;
        
        String firstName = "Alice"; //String & has to have the values in " "
        int age = 19; //whole value of 19 
        
//declare a variable of String type to hold an email address
//dataType variableName = initialValue; (camelCase)
        String emailAddress = "alice123@gmail.com";
        
   /*numeric dataTypes     
        int - will hold whole numbers
        double - decimal point 
        float - floating point (f)
        short & long 
       */ 
   
//declare a variable of dataType double to hold a score value
//dataType variableName = initialValue; (camelCase)
double score; 
double gameScore = 85.75; //allows the variable to hold decimal point values
double vatRate =  0.15; //Vat 15% (Percentage values are always converted to their decimal version format)
float valueOfPie = 3.14f; //float will have a suffix (f) attached to its value
double pieValue = 3.1496573820406874;

//Using the above declared variables: Call the variable & print to console as output
//System.out.println(name); (this throws an error as there is nothing being stored in the variable as yet)
System.out.println("Name: " + firstName); // + represents to join the output displayed 
System.out.println("Age: " + age);
//call the rest of the variables & print values onto the console display
//emailAddress; gameScore; vatRate
System.out.println("Email Address: " + emailAddress);
System.out.println("Game Score: " + gameScore);
System.out.println("Vat Rate is: " + vatRate*100 + "%");

//DataType - Character Type
//holds only 1 character in the declared memory space
//dataType variableName = initialValue; (camelCase)
char scale ='0'; //char & has to have the values in ' ' (single)  

//DataType - Boolean Type (True/False)
//dataType variableName = initialState; (state can be either True/False (camelCase)
boolean isStudent = true;
boolean isGraduated = false; 
        System.out.println("Is Alice a student: " + isStudent);
        System.out.println("Did Bob graduate as yet? " + isGraduated);

        
        //We want to now reassign values in our variables. We simply have to call the declared variable & assign the 
        //new value; WE DONT DECLARE THE VARIABLE AGAIN!!!!
        
        firstName = "Bob"; 
        age = 25;
        emailAddress = "bob@gmail.com";
        gameScore = 34.50;
        vatRate = 0.17;
        isStudent = false;
        isGraduated = true; 
        
        System.out.println();
        System.out.println("Variables with new values being assigned to them");
System.out.println("Name: " + firstName); // + represents to join the output displayed 
System.out.println("Age: " + age);
//call the rest of the variables & print values onto the console display
//emailAddress; gameScore; vatRate
System.out.println("Email Address: " + emailAddress);
System.out.println("Game Score: " + gameScore);
System.out.println("Vat Rate is: " + vatRate*100 + "%");
System.out.println("Is Bob a student: " + isStudent);
System.out.println("Did Bob graduate as yet? " + isGraduated);



       
    
    
    
    }
}//the closing curly brace for the main method
