

package com.mycompany.arraysdemo2;

/**
 *
 * @author nmagongo
 * Traversing through an array with known values
* Traversing through an array with user-defined values
* Passing an array to a method
* Returning an array from a method
 * 
 * 
 */
import java.util.Scanner;
public class ArraysDemo2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner input = new Scanner(System.in);
        
        //declare an array with known values
        int[] marks = {78, 85, 90, 66, 72};
        
        //Display array contents
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
        
        
        
        //declare an array with user-defined values
         int[] userNumbers = new int[5];
        
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Number " + (i + 1) + ": ");
            userNumbers[i] = input.nextInt();
        }
        
        //Display array contents
        System.out.println("\nUser-entered values:");
        for (int i = 0; i < userNumbers.length; i++)
        {
            System.out.println("Value " + (i + 1) + ": " + userNumbers[i]);
        }
        
        //call a method to display the array: passing the userNumber array as a parameter
        //void
        displayArray(userNumbers);//actual parameter
        
        //call a method that returns an array
        //value-returning
        //declare an array to return the values to it
        int[] doubledArray = doubledValues(userNumbers);
        
        System.out.println("Returned array (values doubled):");
        for (int i = 0; i < doubledArray.length; i++) 
        {
            System.out.println("Value " + (i + 1) + ": " + doubledArray[i]);
        }
        
        input.close();
     
    }
    
    public static void displayArray(int[] arr) //userNumber array passed as a formal parameter
     {
          System.out.println("Displaying array passed to method:");
          for (int i = 0; i < arr.length; i++)
          {
            System.out.println(arr[i]);
          }
     }
     
    public static int[] doubledValues(int[] arr)//userNumber array passed as a formal parameter
     {
        //declare an array
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) 
        {
            newArray[i] = arr[i] * 2;
        }
        
        return newArray;
     }
}
