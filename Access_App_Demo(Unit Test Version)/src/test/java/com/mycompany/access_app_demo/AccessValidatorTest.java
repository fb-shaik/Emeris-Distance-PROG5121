
package com.mycompany.access_app_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccessValidatorTest {
    //object to be used in the testing 
    AccessValidator validator = new AccessValidator();
    
   //Test: Access should be granted
    @Test
    void testAccessGranted()
    {
           
        //Arrange - Setup data
        AccessRequest request = new AccessRequest(true, "ARCHIVE-777", false);
        
        //Act - Call the method
        boolean result = validator.isAccessGranted(request);
        
        //Assert (Check result)
        assertTrue(result);
        
    }
    
    //Test: Flagged + wrong code - denied
    @Test
     void testFlaggedWrongCode()
     {//Arrange - Setup data
          AccessRequest request = new AccessRequest(true, "WRONG-CODE", true);
        
        //Act - Call the method
        boolean result = validator.isAccessGranted(request);
        
        //Assert (Check result)
        assertFalse(result);

     }
     
     // Test: Message check using assertEquals
     @Test
     void testAccesMessage()
     {
         String message = validator.getAccessMessage(true);
         
         //assertEqual(expected, actual);
         assertEquals("ACCESS APPROVED", message);
     }
     
    
    
    
    
}
