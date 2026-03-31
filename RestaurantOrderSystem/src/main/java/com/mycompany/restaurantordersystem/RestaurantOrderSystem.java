package com.mycompany.restaurantordersystem;

import java.util.Scanner;

public class RestaurantOrderSystem {

    public static void main(String[] args) {
        
        // =========================
        // SCANNER SETUP
        // =========================
        // Scanner is used to read user input from the console
        Scanner input = new Scanner(System.in);

        System.out.println("=== Restaurant Order System ===");


        // =========================
        // USER INPUT SECTION
        // =========================

        // Read customer name (String input)
        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        // Read order amount (integer input)
        System.out.print("Enter order amount: ");
        int amount = input.nextInt();

        // Read membership status (boolean input: true/false)
        System.out.print("Are you a member? (true/false): ");
        boolean isMember = input.nextBoolean();

        // IMPORTANT:
        // After nextInt() or nextBoolean(), a newline character is left in the buffer
        // This nextLine() clears that leftover newline to prevent skipping input
        input.nextLine();

        // Read meal type (String input)
        System.out.print("Enter meal type (veg/non-veg/vegan): ");
        String meal = input.nextLine();


        // =========================
        // OBJECT CREATION
        // =========================
        // Create an Order object using the constructor
        Order order = new Order(name, amount, isMember, meal);


        // =========================
        // BUSINESS LOGIC CALL
        // =========================
        // Create service object responsible for processing logic
        KitchenService service = new KitchenService();

        // Pass the order object to the service layer
        // This separates input logic from business logic (good design practice)
        service.processOrder(order);


        // =========================
        // RESOURCE CLEANUP
        // =========================
        // Always close Scanner to prevent resource leaks
        input.close();
    }
}