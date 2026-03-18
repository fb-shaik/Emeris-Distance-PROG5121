package com.mycompany.methodoverloading_demo;

// CLASS: Demonstrates Method Overloading concepts
public class MethodOverLoading_Demo {

    // =====================================================
    // METHOD 1: add (2 parameters)
    // =====================================================
    // PARAMETER LIST → (int a, int b)
    // - Two parameters (placeholders)
    // - Both are integers
    // RETURN TYPE → int
    
    public static int add(int a, int b)
    {
        // PARAMETERS a and b receive values from arguments
        return a + b;
    }
    
    // =====================================================
    // METHOD 2: add (3 parameters)
    // =====================================================
    // PARAMETER LIST → (int a, int b, int c)
    // - Same method name BUT different number of parameters
    // - This is METHOD OVERLOADING
    
    public static int add(int a, int b, int c)
    {
        return a + b + c;
    }
    
    // =====================================================
    // METHOD 3: add (different data types)
    // =====================================================
    // PARAMETER LIST → (double a, int b, int c)
    // - Different data type for first parameter
    // - Still considered a different method
    
    public static double add(double a, int b, int c)
    {
        return a + b + c;
    }   
    
    
    // =====================================================
    // METHOD 4: printMessage (no parameters)
    // =====================================================
    // PARAMETER LIST → ()
    // - No inputs required
    // - No arguments needed when calling
    
    public static void printMessage()
    {
        System.out.println("This is a simple message - Welcome!");
    } 
       
    
    // =====================================================
    // METHOD 5: printMessage (1 parameter)
    // =====================================================
    // PARAMETER LIST → (String message)
    // - One parameter → expects ONE argument when called
    
    public static void printMessage(String message)
    {
        // message parameter receives the argument value
        System.out.println(message);
    }
                
    
    // =====================================================
    // METHOD 6: printMessage (2 parameters)
    // =====================================================
    // PARAMETER LIST → (String message, String name)
    // - Two parameters of SAME type
    
    public static void printMessage(String message, String name)
    {
        System.out.println(message + ", " + name);
    }
       
    
    // =====================================================
    // METHOD 7: printMessage (3 parameters)
    // =====================================================
    // PARAMETER LIST → (String message, String name, int age)
    // - Parameters differ in NUMBER and TYPE
    
    public static void printMessage(String message, String name, int age)
    {
        System.out.println(message + ", " + name + ": you are " + age + " years old");
    }
                
    
    
    // =====================================================
    // MAIN METHOD → Program starts here
    // =====================================================
    public static void main(String[] args) {

        // =====================================================
        // METHOD CALLS WITH ARGUMENTS
        // =====================================================
        
        // METHOD CALL → add(2, 3)
        // ARGUMENTS → (2, 3)
        // MATCHES → method 1 (int, int)
        
        System.out.println(add(2,3));
        
        
        // METHOD CALL → add(3, 4, 10)
        // ARGUMENTS → (3, 4, 10)
        // MATCHES → method 2 (int, int, int)
        
        System.out.println(add(3,4,10));
        
        
        // METHOD CALL → add(2.5, 5, 8)
        // ARGUMENTS → (double, int, int)
        // MATCHES → method 3
        
        System.out.println(add(2.5, 5, 8));
        
        
        // =====================================================
        // METHOD CALLS (printMessage)
        // =====================================================
        
        // No arguments → matches method 4
        printMessage();
        
        
        // One argument → matches method 5
        // ARGUMENT "Hello, welcome to class!" → parameter message
        
        printMessage("Hello, welcome to class!");
        
        
        // Two arguments → matches method 6
        // Mapping:
        // "Welcome" → message
        // "Bob" → name
        
        printMessage("Welcome", "Bob");
        
        
        // Three arguments → matches method 7
        // Mapping:
        // "Hi" → message
        // "Alice" → name
        // 25 → age
        
        printMessage("Hi", "Alice", 25);
        
    }
}

/*
    Simple Mental Note
        Parameter = empty slot
        Argument = value filling the slot
        Method call = matching correct method version
*/