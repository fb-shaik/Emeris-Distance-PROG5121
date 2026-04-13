package com.mycompany.library_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*Each method annotated with @Test represents a unit test case.
 * These tests verify whether the system behaves as expected.
 */
public class LibrarySystemTest {

    // Create an instance of the system that will be tested
    LibrarySystem system = new LibrarySystem();

    /*
     * Test Case: Valid Registration
     * Purpose:
     * To verify that a user is successfully registered when all inputs are valid.
     * 
     * Expected Result:
     * The method should return "Registration was successful!"
     */
    @Test
    public void testValidationRegistration() {
        
        // ACT: Call the method with valid inputs
        String result = system.registerMember("LIB123", "1234", "test@email.com");
        
        // ASSERT: Check if the returned message matches the expected output
        assertEquals("Registration was successful!", result);
    }

    /*
     * Test Case: Invalid PIN during registration
     * Purpose:
     * To verify that registration fails when the PIN format is incorrect.
     * 
     * Invalid Input:
     * "123A" contains a letter (only digits allowed)
     * 
     * Expected Result:
     * The method should return "Invalid PIN format"
     */
    @Test
    public void testInvalidPIN() {
        
        String result = system.registerMember("LIB123", "123A", "test@email.com");
        
        assertEquals("Invalid PIN format", result);
    }



    /*
     * Test Case: Valid Member ID
     * Purpose:
     * To check that a correctly formatted Member ID passes validation.
     * 
     * Rule:
     * - Must start with "LIB"
     * - Must be exactly 6 characters long
     * 
     * Expected Result:
     * Method should return true
     */
    @Test
    public void testValidMemberID() {
        assertTrue(system.checkMemberID("LIB123"));
    }

    /*
     * Test Case: Invalid Member IDs
     * Purpose:
     * To test different invalid formats of Member ID.
     * 
     * Cases tested:
     * - Missing "LIB"
     * - Too short
     * - Too long
     * 
     * Expected Result:
     * All should return false
     */
    @Test
    public void testInvalidMemberID() {
        assertFalse(system.checkMemberID("LB123"));     // Missing "LIB"
        assertFalse(system.checkMemberID("LIB12"));     // Too short (5 chars)
        assertFalse(system.checkMemberID("LIB1234"));   // Too long (7 chars)
    }

    /*
     * Test Case: Valid PIN
     * Purpose:
     * To verify that a correct PIN (exactly 4 digits) passes validation.
     * 
     * Expected Result:
     * Method should return true
     */
    @Test
    public void testValidPIN() {
        assertTrue(system.checkPIN("1234"));
    }

    /*
     * Test Case: Invalid PIN formats
     * Purpose:
     * To test different invalid PIN scenarios.
     * 
     * Cases tested:
     * - Too short
     * - Too long
     * - Contains non-digit character
     * 
     * Expected Result:
     * All should return false
     */
    @Test
    public void testInvalidPINFormats() {
        assertFalse(system.checkPIN("123"));     // Only 3 digits
        assertFalse(system.checkPIN("12345"));   // 5 digits
        assertFalse(system.checkPIN("12A4"));    // Contains letter
    }

    /*
     * Test Case: Valid Email
     * Purpose:
     * To verify that a correctly formatted email passes validation.
     * 
     * Rule:
     * - Must contain '@'
     * - Must contain '.'
     * 
     * Expected Result:
     * Method should return true
     */
    @Test
    public void testValidEmail() {
        assertTrue(system.checkEmail("user@email.com"));
    }

    /*
     * Test Case: Invalid Email formats
     * Purpose:
     * To test invalid email scenarios.
     * 
     * Cases tested:
     * - Missing '@'
     * - Missing '.'
     * 
     * Expected Result:
     * All should return false
     */
    @Test
    public void testInvalidEmail() {
        assertFalse(system.checkEmail("useremail.com")); // Missing '@'
        assertFalse(system.checkEmail("user@emailcom")); // Missing '.'
    }

    // ---------- LOGIN TESTS ----------

    /*
     * Test Case: Successful Login
     * Purpose:
     * To verify that login succeeds when correct credentials are used.
     * 
     * Process:
     * 1. Register a user first (store credentials)
     * 2. Attempt login with same credentials
     * 
     * Expected Result:
     * Method should return true
     */
    @Test
    public void testLoginSuccess() {
        
        // Register user first
        system.registerMember("LIB123", "1234", "test@email.com");
        
        // Attempt login with correct credentials
        assertTrue(system.loginMember("LIB123", "1234"));
    }

    /*
     * Test Case: Failed Login
     * Purpose:
     * To verify that login fails when incorrect credentials are used.
     * 
     * Expected Result:
     * Method should return false
     */
    @Test
    public void testLoginFailure() {
        
        system.registerMember("LIB123", "1234", "test@email.com");
        
        // Wrong PIN used
        assertFalse(system.loginMember("LIB123", "0000"));
    }

    /*
     * Test Case: Login Status Message (Success)
     * Purpose:
     * To verify that the correct success message is returned.
     * 
     * Expected Result:
     * "Welcome back, member"
     */
    @Test
    public void testLoginStatusMessageSuccess() {
        
        String message = system.returnLoginStatus(true);
        
        assertEquals("Welcome back, member", message);
    }

    /*
     * Test Case: Login Status Message (Failure)
     * Purpose:
     * To verify that the correct failure message is returned.
     * 
     * Expected Result:
     * "Login failed, Try again!"
     */
    @Test
    public void testLoginStatusMessageFailure() {
        
        String message = system.returnLoginStatus(false);
        
        assertEquals("Login failed, Try again!", message);
    }
}