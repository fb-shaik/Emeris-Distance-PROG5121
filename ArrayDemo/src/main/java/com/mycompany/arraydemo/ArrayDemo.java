/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydemo;

/*
* What is and array?
- A data structure that stores a collection of elements of the same data type

* Why it is used?
- Helps to manage data efficiently

* Array Rules:
last position = n-1

* Basic syntax:
int[] testScores; size of array is unkown

initialize:
int[] testScores = new int[10]; size of array is known

Assign values in the array: (values are known)
testScores[0] = 67;
testScores[1] = 80;
testScores[2] = 92;
testScores[3] = 75;
testScores[4] = 51;
testScores[5] = 48;
testScores[6] = 66;
testScores[7] = 78;
testScores[8] = 90;
testScores[9] = 73;

Assign values: user determines the values
for loop:
for(int i = 0; i < 10; i++)
{
    System.out.println("Enter test score " + testScores[i]+1);
    testScores[i] = input.nextLine(); 
}

values are unknown (come from the user) + size is unknown:
for(int i = 0; i < testScores.length; i++)
{
    System.out.println("Enter test score " + testScores[i]+1);
    testScores[i] = input.nextLine(); 
}


* Array manipulation
- populating an array with values:
    - size of array is unknown
    - size of the array is known
    - array values are known
    - array values are unknown
- Count: number of elements in the array
- Lowest value
- Highest value
- Average
- Search
- Sort


Scenario: Student test scores

1. Declare and initialize arrays.
2. Access array elements using variable subscripts.
3. Populate the array
4. Display the contents of the array
5. 
Create arrays of objects.
Search for values in arrays.
3. Use parallel arrays.

Pass arrays to methods.
Return arrays from methods.
*/

import java.util.Scanner;// accept user input
public class ArrayDemo {

    public static void main(String[] args)
    {
        System.out.println("This is an Array Demo :-)");
        
        Scanner scan = new Scanner(System.in);
        
        //declare an array of size = 5
        int[] testScores = new int[5];
        String[] studentNames = new String[5];
        
        //Prompt the user to enter the test scores for each student
        for(int i = 0; i < testScores.length; i++)
        {
            System.out.println("Enter the student's name: ");
            studentNames[i] = scan.nextLine();
            
            System.out.println("Enter " + studentNames[i] + "'s test score: ");
            testScores[i] = scan.nextInt();
            scan.nextLine();
        }
        
        System.out.println("The entered student records are:");
        
        //Display the array values
        for(int i = 0; i < testScores.length; i++)
        {
            System.out.println(studentNames[i] +  " : " + testScores[i] );
        }
        
        //Determine the class average
        int total = 0;
        
        // average = total score / num of elements in the array
        for(int i=0; i < testScores.length; i++)
        {
            //accummulate the test scores
            total = total + testScores[i];
        }//total = 371
        
        double average = total / testScores.length; 
        
        System.out.println("The class average is: " + average);

        scan.close();
        
    }
}









/*
What is an array?
Why does indexing start at 0?
What is a variable subscript?
What is a parallel array?
Why use arrays of objects?
How do you search an array?
Why pass arrays to methods?
How do methods return arrays?
*/