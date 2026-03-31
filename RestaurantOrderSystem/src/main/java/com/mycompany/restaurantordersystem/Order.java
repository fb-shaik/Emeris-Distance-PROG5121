package com.mycompany.restaurantordersystem;

// =========================================
// 1. Order CLASS
// Demonstrates ENCAPSULATION + CONSTRUCTOR
// =========================================
public class Order {
    
    // =========================
    // PRIVATE VARIABLES (FIELDS)
    // =========================
    // These variables are marked as 'private'
    // This enforces ENCAPSULATION (data hiding)
    // They cannot be accessed directly from outside the class
    
    private String name;       // Customer name
    private int amount;       // Total order amount
    private boolean isMember; // Indicates if customer is a member (true/false)
    private String meal;      // Type of meal ordered (veg, non-veg, vegan)

    
    // =========================
    // CONSTRUCTOR
    // =========================
    // A constructor is used to initialize objects
    // It is automatically called when an object is created
    //
    // Example:
    // Order order = new Order("John", 150, true, "veg");
    //
    // 'this' keyword refers to the current object
    // Used to differentiate between instance variables and parameters
    
    public Order(String name, int amount, boolean isMember, String meal) {
        this.name = name;         // Assign parameter 'name' to instance variable
        this.amount = amount;     // Assign order amount
        this.isMember = isMember; // Assign membership status
        this.meal = meal;         // Assign meal type
    }
    
    
    // =========================
    // GETTER METHODS
    // =========================
    // Getters provide READ-ONLY access to private variables
    // This is part of encapsulation (controlled access)
    
    // Returns customer's name
    public String getName() {
        return name;
    }

    // Returns order amount
    public int getAmount() {
        return amount;
    }

    // Returns membership status
    // Naming note:
    // "isIsMember()" is valid but redundant naming
    public boolean isIsMember() {
        return isMember;
    }

    // Returns meal type
    public String getMeal() {
        return meal;
    }
    
}