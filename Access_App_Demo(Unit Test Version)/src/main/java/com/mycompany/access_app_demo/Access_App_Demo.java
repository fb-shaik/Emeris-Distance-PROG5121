package com.mycompany.access_app_demo;

import java.util.Scanner;

/**
 * Main application entry point
 */
public class Access_App_Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input: clearance
        System.out.print("Do you have clearance? (true/false): ");
        boolean hasClearance = scanner.nextBoolean();

        // Input: access code
        System.out.print("Enter access code: ");
        String accessCode = scanner.next();

        // Input: flagged status
        System.out.print("Are you flagged? (true/false): ");
        boolean isFlagged = scanner.nextBoolean();

        // Create request object
        AccessRequest request = new AccessRequest(hasClearance, accessCode, isFlagged);

        // Validate access
        AccessValidator validator = new AccessValidator();
        boolean result = validator.isAccessGranted(request);

        // Output result
        String message = validator.getAccessMessage(result);
        System.out.println("Decision: " + message);

        scanner.close();
    }
}