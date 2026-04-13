package com.mycompany.library_app;

import java.util.Scanner;

/*
 * The Library_App class contains the main method,
 * which serves as the entry point of the program.
 * 
 * This class simulates a simple console-based system where:
 * 1. A user registers
 * 2. If registration is successful → user attempts to log in
 */
public class Library_App {

    public static void main(String[] args) {
        
        /*
         * Scanner object is used to capture user input
         * from the keyboard (console).
         */
        Scanner input = new Scanner(System.in);
        
        /*
         * Create an instance of the LibrarySystem class.
         * This object allows us to access registration
         * and login functionality.
         */
        LibrarySystem system = new LibrarySystem();
        
        // ------------------- REGISTRATION PROCESS -------------------
        
        System.out.println("+++++ Library Registration +++++");
        
        // Capture Member ID
        System.out.println("Enter Member ID: ");
        String id = input.nextLine();
        
        // Capture PIN
        System.out.println("Enter PIN: ");
        String pin = input.nextLine();
        
        // Capture Email
        System.out.println("Enter Email: ");
        String email = input.nextLine();
        
        /*
         * Call the registerMember() method to:
         * - Validate inputs
         * - Store details if valid
         * 
         * The method returns a message indicating success or failure.
         */
        String result = system.registerMember(id, pin, email);
        
        // Display the result of registration
        System.out.println(result);
        
        
        // ------------------- LOGIN PROCESS -------------------
        
        /*
         * IMPORTANT:
         * Login should only proceed if registration was successful.
         * 
         * NOTE:
         * There is a logical issue here:
         * registerMember() returns "Registration was successful!"
         * but this condition checks "Registration successful."
         * 
         * This means login will NEVER execute.
         */
        if(result.equals("Registration was successful!")) // ❌ BUG HERE
        {
            System.out.println("\n+++++ LOGIN SCREEN +++++");

            /*
             * loginSuccess acts as a flag variable.
             * It tracks whether login was successful.
             */
            boolean loginSuccess = false;

            /*
             * Loop allows a maximum of 3 login attempts.
             * 
             * Structure of for-loop:
             * - Initialization: attempt = 1
             * - Condition: attempt <= 3
             * - Update: attempt++
             */
            for(int attempt = 1; attempt <= 3; attempt++)
            {
                System.out.println("Attempt " + attempt + " of 3");
                
                // Capture login credentials
                System.out.println("Enter MemberID: ");
                String loginID = input.nextLine();
                
                System.out.println("Enter PIN: ");
                String loginPIN = input.nextLine();
                
                /*
                 * Validate login details using loginMember()
                 * This compares input with stored registration data.
                 */
                loginSuccess = system.loginMember(loginID, loginPIN);

                if(loginSuccess)
                {
                    /*
                     * If login is successful:
                     * - Display success message
                     * - Exit loop using break
                     */
                    System.out.println(system.returnLoginStatus(true));
                    break;  
                } 
                else 
                {
                    // If login fails, prompt user to try again
                    System.out.println("Login Failed, Try again");
                }

                /*
                 * If this is the final attempt (3rd attempt)
                 * AND login is still unsuccessful,
                 * display system exit message.
                 */
                if(attempt == 3 && !loginSuccess)
                {
                    System.out.println("Max number of login attempts reached!. System exiting.");
                }
            }
        }

        /*
         * Always close Scanner to prevent resource leaks.
         */
        input.close();
    }
}