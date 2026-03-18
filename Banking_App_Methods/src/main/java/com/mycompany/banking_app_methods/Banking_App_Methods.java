package com.mycompany.banking_app_methods;

// CLASS: Groups all methods related to the banking application
public class Banking_App_Methods {

    // =====================================================
    // METHOD: deposit
    // =====================================================
    // PARAMETER LIST → (double balance, double amount)
    // - Parameters are PLACEHOLDERS for values that will be passed in later.
    // - They define what INPUTS the method expects.
    //
    // RETURN TYPE → double
    // - This method MUST return a double value.
    
    public static double deposit(double balance, double amount)
    {
        // At runtime:
        // PARAMETERS receive ARGUMENT values from the method call
        
        double newBalance = balance + amount; 
        
        // RETURN → sends value back to where the method was called
        return newBalance; 
    }
  
    
    // =====================================================
    // METHOD: withdraw
    // =====================================================
    // PARAMETER LIST → (double balance, double withdrawAmount)
    // - These parameters will store incoming argument values
    
    public static double withdraw(double balance, double withdrawAmount)
    {
        double newBalance = balance - withdrawAmount;
        return newBalance; 
    }
            

    // =====================================================
    // METHOD: displayBalance
    // =====================================================
    // PARAMETER LIST → (double balance)
    // RETURN TYPE → void (no value returned)
    
    public static void displayBalance(double balance)
    {
        System.out.println("Current Balance: R" + balance);
    }
    
    
    // =====================================================
    // METHOD OVERLOADING: displayTransaction
    // =====================================================
    // Same method name, DIFFERENT parameter lists
    // Java decides which method to use based on:
    // - number of arguments
    // - data types
    // - order
    
    // Version 1 → Parameter list: (String type, double amount)
    public static void displayTransaction(String type, double amount)
    {
        System.out.println("Transaction: " + type + " | Amount: R" + amount);
    }
    
    // Version 2 → Parameter list: (double amount, String type)
    public static void displayTransaction(double amount, String type)
    {
        System.out.println("Transaction: " + type + " | Amount: R" + amount);
    }
    
    // Version 3 → Parameter list: (String type, double amount, double balance)
    public static void displayTransaction(String type, double amount, double balance)
    {
        System.out.println("Transaction: " + type + 
                           " | Amount: R" + amount + 
                           " | New Balance: R " + balance);
    }
    
    
    
    // =====================================================
    // MAIN METHOD → Program execution starts here
    // =====================================================
    public static void main(String[] args) {
        
        // VARIABLES (store actual values / arguments later)
        double balance = 500.00;
        double depositAmount = 200; 
        double withdrawAmount = 150.00;
        
        
        // =====================================================
        // METHOD CALL (INVOCATION)
        // =====================================================
        // A method call executes the method.
        // Syntax: methodName(arguments);
        
        // NO PARAMETERS → so NO ARGUMENTS needed
        displayInfo();
        
        
        // =====================================================
        // METHOD CALL WITH ARGUMENTS
        // =====================================================
        // deposit(balance, depositAmount)
        //
        // ARGUMENTS → (balance, depositAmount)
        // These are REAL VALUES passed into the method.
        //
        // PARAMETER LIST (in method definition):
        // (double balance, double amount)
        //
        // MAPPING (position-based):
        // argument balance        → parameter balance
        // argument depositAmount → parameter amount
        
        balance = deposit(balance, depositAmount);
        
        
        // =====================================================
        // METHOD CALL WITH ONE ARGUMENT
        // =====================================================
        displayBalance(balance);
        // argument balance → parameter balance
        
        
        // =====================================================
        // METHOD CALL WITH MULTIPLE ARGUMENTS
        // =====================================================
        displayTransaction("Deposit", depositAmount, balance);
        
        // Mapping:
        // "Deposit"     → parameter type
        // depositAmount → parameter amount
        // balance       → parameter balance
        
        
        // =====================================================
        // WITHDRAW METHOD CALL
        // =====================================================
        balance = withdraw(balance, withdrawAmount);
        
        displayBalance(balance);
        
        
        // =====================================================
        // METHOD OVERLOADING CALLS
        // =====================================================
        
        // Java selects method based on argument types + order
        
        displayTransaction("Withdraw", withdrawAmount);
        // Matches → (String, double)
        
        displayTransaction(withdrawAmount, "Withdraw");
        // Matches → (double, String)
        
    }
    
    
    // =====================================================
    // METHOD: displayInfo
    // =====================================================
    // NO PARAMETERS → no inputs required
    // NO RETURN → void
    
    public static void displayInfo()
    {
        System.out.println("ABC BANK");
        System.out.println("123 Happy Place");
        System.out.println("Welcome to your app!");    
    }

}

/*
    A method is a block of code that performs a specific task.
    Think of it like a mini-program inside your program.

    A method has 3 parts 
    1. Method Signature / Header - Contains info about the method
        - 4 pieces of data 
            - Access Specifier (public / private)
            - Version (static / non-Static) 
            - void / dataType of the return value being shared
            - methodName(parameterList) 
            - Parameter List: (dataType parameterName, dataType parameterName, dataType parameterName) 
    2. Method Body {}
            - contain all the code / instructions that method will complete
    3. Method Return 
            - A keyword (return) that sits within the {} & will indicate what the method is sharing / return back 
            - The datatype used for the return will match the dataType seen in the method header

Simple Way to remember:
Parameter = empty box
Argument = value you put in the box
Method call = giving the box values and running the code        


*/
