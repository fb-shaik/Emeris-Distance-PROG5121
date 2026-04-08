package com.mycompany.access_app_demo;

// Import JUnit 5 test annotation
import org.junit.jupiter.api.Test;

// Import assertion methods for validating outcomes
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class tests the functionality of the AccessValidator class.
 * 
 * Purpose:
 * - To verify that access control logic behaves correctly under different conditions.
 * - Each test isolates a specific scenario (positive, negative, and message validation).
 */
public class AccessValidatorTest {

    /**
     * Create a reusable instance of AccessValidator.
     * 
     * This object will be used across all test methods.
     * Note: In more advanced setups, this could be initialized using @BeforeEach.
     */
    AccessValidator validator = new AccessValidator();
    
    /**
     * Test Case 1: Access should be granted
     * 
     * Scenario:
     * - User is authorized (true)
     * - Correct access code is provided ("ARCHIVE-777")
     * - User is NOT flagged (false)
     * 
     * Expected Outcome:
     * - Access should be granted → method returns true
     */
    @Test
    void testAccessGranted() {
           
        // =====================
        // Arrange (Setup)
        // =====================
        // AccessRequest(boolean isAuthorized, String code, boolean isFlagged)
        AccessRequest request = new AccessRequest(true, "ARCHIVE-777", false);
        
        // =====================
        // Act (Execution)
        // =====================
        boolean result = validator.isAccessGranted(request);
        
        // =====================
        // Assert (Verification)
        // =====================
        // We expect access to be granted
        assertTrue(result);
    }
    
    /**
     * Test Case 2: Access denied due to flagged user and incorrect code
     * 
     * Scenario:
     * - User is authorized (true)
     * - WRONG access code is provided ("WRONG-CODE")
     * - User is flagged (true)
     * 
     * Expected Outcome:
     * - Access should be denied → method returns false
     */
    @Test
    void testFlaggedWrongCode() {
        
        // =====================
        // Arrange
        // =====================
        AccessRequest request = new AccessRequest(true, "WRONG-CODE", true);
        
        // =====================
        // Act
        // =====================
        boolean result = validator.isAccessGranted(request);
        
        // =====================
        // Assert
        // =====================
        // Expect denial of access
        assertFalse(result);
    }
     
    /**
     * Test Case 3: Validate access message output
     * 
     * Scenario:
     * - Access has been granted (true)
     * 
     * Expected Outcome:
     * - Method should return the correct message string
     */
    @Test
    void testAccesMessage() {
        
        // =====================
        // Arrange & Act
        // =====================
        String message = validator.getAccessMessage(true);
        
        // =====================
        // Assert
        // =====================
        // assertEquals(expected, actual)
        assertEquals("ACCESS APPROVED", message);
    }
}
