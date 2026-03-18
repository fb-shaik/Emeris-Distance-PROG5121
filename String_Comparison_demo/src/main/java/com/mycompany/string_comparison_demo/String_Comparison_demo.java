package com.mycompany.string_comparison_demo;

// Import JOptionPane for GUI input/output dialogs
import javax.swing.JOptionPane;

public class String_Comparison_demo {

    public static void main(String[] args) {
        
        // Prompt the user to enter the first word using a dialog box
        // The input is stored as a String in variable word1
        String word1 = JOptionPane.showInputDialog("Enter your first word: ");
        
        // Prompt the user to enter the second word
        // The input is stored in variable word2
        String word2 = JOptionPane.showInputDialog("Enter your second word: ");
        
        // This compares the MEMORY ADDRESSES (references) of word1 and word2
        // It checks if both variables point to the exact same object in memory
        // Usually returns false even if the words look identical
        boolean equalTo = (word1 == word2);
        
        // This compares the ACTUAL CONTENT of the strings
        // It checks if the characters inside word1 and word2 are the same
        // This is the CORRECT way to compare strings in Java
        boolean actualResult = word1.equals(word2);
        
        // Build a result message showing both comparisons
        String result = "String Comparison Using ==\n\n"
                                    + "First Word: " + word1 + "\n"
                                    + "Second Word: " + word2 + "\n\n"
                                    
                                    // Shows result of == comparison (reference comparison)
                                    + "word1 == word2 using the operator : " + equalTo + "\n\n"
                                    
                                    // Shows result of equals() comparison (content comparison)
                                    + "word1.equals(word2) using equals() : " + actualResult;
        
        // Display the result in a message dialog box
        JOptionPane.showMessageDialog(null, result);
    }
}

/*
 SUMMARY:
 - == compares memory locations (reference comparison)
 - equals() compares actual string content (value comparison)
 - Always use equals() when comparing strings in Java

 Key takeaway: 
== Used to ask are these the same object? (memory reference)
.equals() Use to check if these have the same value? (content)
*/