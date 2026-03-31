package com.mycompany.restaurantordersystem;

// Service class responsible for handling order processing logic
class KitchenService {

    // Method that processes an order object
    public void processOrder(Order order) {

        // Print a header to indicate processing has started
        System.out.println("\n--- Order Processing ---");

        // =========================
        // 1. SIMPLE IF STATEMENT
        // =========================
        // Checks if the order amount is greater than 200
        // If TRUE: customer gets a free dessert
        // If FALSE: nothing happens (no else block)
        if (order.getAmount() > 200) {
            System.out.println("Free dessert included!");
        }

        // =========================
        // 2. IF-ELSE STATEMENT
        // =========================
        // Checks if the customer is a member
        // TRUE: apply discount
        // FALSE: no discount
        if (order.isIsMember()) {
            System.out.println("You get a discount.");
        } else {
            System.out.println("No discount.");
        }

        // =========================
        // 3. DECISION USING LOGICAL OPERATORS
        // =========================
        // This condition uses AND (&&)
        // BOTH conditions must be TRUE:
        // 1. Order amount > 100
        // 2. Customer is a member
        //
        // If both are true: priority order
        // Otherwise: normal order
        if (order.getAmount() > 100 && order.isIsMember()) {
            System.out.println("Priority order.");
        } else {
            System.out.println("Normal order.");
        }

        // =========================
        // 4. SWITCH STATEMENT
        // =========================
        // Used to handle multiple possible values of meal type
        // .toLowerCase() ensures input is case-insensitive
        // (e.g., "Veg", "VEG", "veg" all work the same)

        switch (order.getMeal().toLowerCase()) {

            // Case: vegetarian meal
            case "veg":
                System.out.println("Preparing vegetarian meal.");
                break; // Stops execution from falling into next case

            // Case: non-vegetarian meal
            case "non-veg":
                System.out.println("Preparing non-vegetarian meal.");
                break;

            // Case: vegan meal
            case "vegan":
                System.out.println("Preparing vegan meal.");
                break;

            // Default case: if input doesn't match any case above
            default:
                System.out.println("Invalid meal type.");
        }
    }
}

/*
========================================
LOGICAL OPERATORS EXPLANATION
========================================

1. AND (&&)
   - Both conditions must be TRUE
   - Example:
     (amount > 100 && isMember) - TRUE only if BOTH are true

2. OR (||)
   - At least ONE condition must be TRUE
   - Example:
     (amount > 100 || isMember) - TRUE if either condition is true

3. NOT (!)
   - Reverses a condition
   - Example:
     !isMember - TRUE if customer is NOT a member

========================================
KEY CONCEPT SUMMARY
========================================
- if: executes code only when condition is true
- if-else: chooses between two paths
- &&: requires both conditions to be true
- switch: cleaner way to handle multiple fixed options
- break: prevents execution from continuing into other cases
*/