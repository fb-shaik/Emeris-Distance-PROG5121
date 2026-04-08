package com.mycompany.restaurantordersystem_demo;

// Import JUnit 5 testing annotation
import org.junit.jupiter.api.Test;

// Import static assertion methods (assertTrue, assertFalse, assertEquals, etc.)
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is a UNIT TEST class for the KitchenService.
 * 
 * Purpose:
 * - To verify that the KitchenService behaves correctly when processing orders.
 * - Each method annotated with @Test represents a separate test case.
 */
public class KitchenServiceTest {
    
    /**
     * Default constructor (not strictly needed for JUnit tests,
     * but included here for completeness).
     */
    public KitchenServiceTest() {
    }

    /**
     * Test Case 1: Basic execution test
     * 
     * Objective:
     * - Ensure that the processOrder() method runs without errors.
     * - This test does NOT validate output, only that no exceptions occur.
     */
    @Test
    public void testProcessOrder() {
        
        // Create an instance of the service we want to test
        KitchenService service = new KitchenService();
        
        // Create test data:
        // Order(customerName, price, isPaid, foodType)
        Order order = new Order("Alex", 150, true, "veg");
        
        // Execute the method under test
        // We are not capturing any return value (method likely void)
        service.processOrder(order);
        
        // Dummy assertion:
        // Since there is no return value, we simply confirm the test ran
        assertTrue(true);
    }
    
    /**
     * Test Case 2: Testing multiple inputs
     * 
     * Objective:
     * - Verify that the service can handle multiple different orders.
     * - Helps simulate real-world usage where many orders are processed.
     */
    @Test
    public void testsDifferentInputs() {
        
        // Create service instance
        KitchenService service = new KitchenService();
       
        // Create multiple orders with different attributes
        
        // High-value vegetarian order
        Order order1 = new Order("Jane", 250, true, "veg"); 
        
        // Low-value unpaid non-veg order
        Order order2 = new Order("Alex", 80, false, "non-veg"); 
        
        // Vegan order
        Order order3 = new Order("Bob", 120, true, "vegan"); 
        
        // Unusual category (edge case)
        Order order4 = new Order("Charlie", 50, true, "pizza"); 

        // Process all orders
        service.processOrder(order1);
        service.processOrder(order2);
        service.processOrder(order3);
        service.processOrder(order4);

        // Dummy assertions:
        
        // Confirms test execution reached this point
        assertTrue(true); 
        
        // Another placeholder assertion (always passes)
        assertFalse(false); 
    }

    /**
     * Test Case 3: Demonstrating assertion usage
     * 
     * Objective:
     * - Show how assertions work in JUnit.
     * - These checks are NOT testing business logic meaningfully yet.
     */
    @Test
    public void testUsingAssertEqual() {
        
        // Create service instance
        KitchenService service = new KitchenService();
        
        // Create test order
        Order order = new Order("Max", 100, false, "veg");
        
        // Run method
        service.processOrder(order);
        
        // Assertions:
        
        // assertEquals(expected, actual)
        // This confirms both values are equal
        assertEquals(1, 1);
        
        // assertFalse(condition)
        // Confirms that the condition is false
        assertFalse(1 == 2); 
    }
}

/*
==========================
UNIT TESTING EXPLANATION
==========================

Unit Testing:
- Focuses on testing small, isolated parts of a program (e.g., a single method).
- Ensures each component behaves correctly before integrating into larger systems.

JUnit Concepts Used:

1. @Test
   - Marks a method as a test case.
   - JUnit will automatically run these methods.

2. Assertions:
   - Used to verify expected outcomes.

   Common assertions:
   
   - assertTrue(condition)
     → Passes if condition is true

   - assertFalse(condition)
     → Passes if condition is false

   - assertEquals(expected, actual)
     → Passes if both values are equal

==========================
IMPORTANT NOTE
==========================

Current tests are "weak tests" because:
- They do NOT verify actual results of processOrder()
- They only confirm the method executes without crashing

A BETTER TEST would:
- Check output values
- Verify state changes
- Use meaningful assertions

Example (ideal scenario):

assertEquals("Order processed", result);
or
assertTrue(order.isProcessed());

This requires processOrder() to return a value or modify state.
*/