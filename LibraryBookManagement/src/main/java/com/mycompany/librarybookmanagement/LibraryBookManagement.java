/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarybookmanagement;

/**
 *Access specifiers, 
 * the this reference, 
 * the static modifier, 
 * using static and constant fields, 
 * an object going out of scope.
 * 
 * @author nmagongo
 */

import java.util.Scanner;
public class LibraryBookManagement {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Library Management System");
        
        //Instantiate obj 1
        Book bookObj1 = new Book();
        
        System.out.println("\nEnter details for new book:");

        System.out.print("Enter Title: ");
        String title = scan.nextLine();
        
        System.out.print("Enter Author: ");
        String author = scan.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = scan.nextLine();
        
        bookObj1.setTitle(title);
        bookObj1.setAuthor(author);
        bookObj1.setIsbn(isbn);
        
        //Instantiate bookObj2
        Book bookObj2 = new Book("Java Programming", "Joyce Farrell", "241587");
        
        //Display both objects
        System.out.println("\nDisplaying Book Records:");
        bookObj1.displayBook();
        bookObj2.displayBook();
        
        scan.close();
        
        
        
        /**
         * 1. Create book object 1
         * 2. Prompt the user to provide a book title, author, ISBN, 
         * 3. Call the set methods to set the book values
         * 4. Create book object 2 using a parameterized constructor
         * 5. Display both book objects
         */
    }
}
 