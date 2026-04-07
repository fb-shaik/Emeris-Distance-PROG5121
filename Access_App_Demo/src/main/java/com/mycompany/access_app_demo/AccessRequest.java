
package com.mycompany.access_app_demo;
/**
 * ============================================
 * CLASS: AccessRequest
 * ============================================
 * This class represents a request to enter
 * a restricted archive system.
 *
 * It is a DATA CLASS (Object in OOP).
 *
 * WHY THIS MATTERS:
 * - In OOP, we group related data into objects.
 * - This makes programs easier to understand and maintain.
 */
public class AccessRequest {

    // Private variables (Encapsulation principle)
    private boolean hasClearance;
    private String accessCode;
    private boolean isFlagged;

    /**
     * Constructor:
     * Used to create an object with initial values.
     */
    public AccessRequest(boolean hasClearance, String accessCode, boolean isFlagged) {
        this.hasClearance = hasClearance;
        this.accessCode = accessCode;
        this.isFlagged = isFlagged;
    }

    /**
     * Getter method:
     * Returns whether the user has clearance.
     */
    public boolean hasClearance() {
        return hasClearance;
    }

    /**
     * Getter method:
     * Returns the access code.
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Getter method:
     * Returns whether the user is flagged.
     */
    public boolean isFlagged() {
        return isFlagged;
    }
}