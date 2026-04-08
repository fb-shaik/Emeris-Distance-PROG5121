package com.mycompany.access_app_demo;

/**
 * ============================================
 * CLASS: AccessValidator
 * ============================================
 * Handles access decision logic.
 */
public class AccessValidator {

    // System master code
    private static final String MASTER_CODE = "ARCHIVE-777";

    /**
     * Determines if access is granted
     */
    public boolean isAccessGranted(AccessRequest request) {

        // 1. Must have clearance
        if (!request.hasClearance()) {
            return false;
        }

        // 2. If flagged, ONLY allow with MASTER_CODE
        if (request.isFlagged() && !MASTER_CODE.equals(request.getAccessCode())) {
            return false;
        }

        // 3. Validate access code
        switch (request.getAccessCode()) {

            case MASTER_CODE:
                return true;

            case "TEMP-123":
                return false;

            default:
                return false;
        }
    }

    /**
     * Returns user-friendly message
     */
    public String getAccessMessage(boolean isGranted) {

        if (isGranted) {
            return "ACCESS APPROVED";
        } else {
            return "ACCESS DENIED";
        }
    }
}