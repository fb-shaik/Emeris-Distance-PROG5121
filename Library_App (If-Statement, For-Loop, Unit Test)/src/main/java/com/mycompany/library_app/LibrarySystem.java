package com.mycompany.library_app;

/*
 * The LibrarySystem class represents a simple user management system
 * for a library application.
 * 
 * It handles:
 * - Member registration (with validation rules)
 * - Storing member details (ID, PIN, Email)
 * - Member login authentication
 * - Returning login status messages
 */
public class LibrarySystem {
    
    // ------------------- ATTRIBUTES -------------------
    
    /*
     * These private variables store the registered member's details.
     * Encapsulation is used to restrict direct access.
     */
    private String storedID;
    private String storedPIN;
    private String storedEmail;

    
    // ------------------- GETTERS AND SETTERS -------------------
    
    /*
     * Getter method to retrieve the stored Member ID
     */
    public String getStoredID() {
        return storedID;
    }

    /*
     * Setter method to assign a value to the Member ID
     */
    public void setStoredID(String storedID) {
        this.storedID = storedID;
    }

    /*
     * Getter method to retrieve the stored PIN
     */
    public String getStoredPIN() {
        return storedPIN;
    }

    /*
     * Setter method to assign a value to the PIN
     */
    public void setStoredPIN(String storedPIN) {
        this.storedPIN = storedPIN;
    }

    /*
     * Getter method to retrieve the stored Email
     */
    public String getStoredEmail() {
        return storedEmail;
    }

    /*
     * Setter method to assign a value to the Email
     */
    public void setStoredEmail(String storedEmail) {
        this.storedEmail = storedEmail;
    }

    
    // ------------------- VALIDATION METHODS -------------------
    
    /*
     * Method: checkMemberID
     * Purpose:
     * Validates whether the Member ID meets the required format.
     * 
     * Rules:
     * - Must start with "LIB"
     * - Must be exactly 6 characters long
     * 
     * Example of valid ID: LIB123
     * 
     * Returns:
     * true if valid
     * false if invalid
     */
    public boolean checkMemberID(String memberID)
    {
        return memberID.startsWith("LIB") && memberID.length() == 6;
    }
    
    
    /*
     * Method: checkPIN
     * Purpose:
     * Validates whether the PIN is exactly 4 digits.
     * 
     * Uses Regular Expression:
     * \\d{4}
     * 
     * Explanation:
     * \\d  matches any digit (0–9)
     * {4}  exactly 4 occurrences
     * 
     * Examples:
     * Valid:   "1234"
     * Invalid: "123", "12345", "12A4"
     * 
     * Returns:
     * true if valid
     * false if invalid
     */
    public boolean checkPIN(String pin)
    {
        return pin.matches("\\d{4}");
    }
    
    
    /*
     * Method: checkEmail
     * Purpose:
     * Performs basic validation of an email address.
     * 
     * Rules:
     * - Must contain '@'
     * - Must contain '.'
     * 
     * Note:
     * This is a simple validation and does not fully comply
     * with all real-world email standards.
     * 
     * Returns:
     * true if valid
     * false if invalid
     */
    public boolean checkEmail(String email)
    {
        return email.contains("@") && email.contains(".");
    }
    
    
    // ------------------- REGISTRATION METHOD -------------------
    
    /*
     * Method: registerMember
     * Purpose:
     * Registers a new member only if all validation checks pass.
     * 
     * Process Flow:
     * 1. Validate Member ID
     * 2. Validate PIN
     * 3. Validate Email
     * 4. If all are valid → store details using setters
     * 
     * Parameters:
     * memberID - user’s ID
     * pin - user’s PIN
     * email - user’s email
     * 
     * Returns:
     * - Error message if any validation fails
     * - Success message if registration is successful
     */
    public String registerMember(String memberID, String pin, String email)
    {
        // Step 1: Validate Member ID
        if (!checkMemberID(memberID))
        {
            return "Invalid Member ID format.";
        }
        
        // Step 2: Validate PIN
        if(!checkPIN(pin))
        {
            return "Invalid PIN format";
        }
        
        // Step 3: Validate Email
        if(!checkEmail(email))
        {
            return "Invalid email format";
        }
    
        // Step 4: Store valid data using encapsulation (setters)
        setStoredID(memberID);
        setStoredPIN(pin);
        setStoredEmail(email);
        
        return "Registration was successful!";
    }
    
    
    // ------------------- LOGIN METHODS -------------------
    
    /*
     * Method: loginMember
     * Purpose:
     * Verifies whether the entered login details match
     * the stored registered details.
     * 
     * Logic:
     * - Compare input Member ID with stored ID
     * - Compare input PIN with stored PIN
     * 
     * Returns:
     * true if both match
     * false if either does not match
     */
    public boolean loginMember(String memberID, String pin)
    {
        return memberID.equals(getStoredID()) && pin.equals(getStoredPIN());
    }
    
    
    /*
     * Method: returnLoginStatus
     * Purpose:
     * Returns a user-friendly message based on login result.
     * 
     * Parameters:
     * success result from loginMember (true or false)
     * 
     * Returns:
     * - Success message if login is correct
     * - Failure message if login is incorrect
     */
    public String returnLoginStatus(boolean success)
    {
        if(success)
        {
            return "Welcome back, member";
        }
        else
        {
            return "Login failed, Try again!";
        }
    }
}