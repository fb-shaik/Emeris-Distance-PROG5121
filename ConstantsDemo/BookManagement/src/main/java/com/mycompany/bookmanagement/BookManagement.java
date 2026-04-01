/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookmanagement;

/**
 *
 * @author nmagongo
 */
import java.util.Scanner;
public class BookManagement {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Library Book Management System ===");

        // 🔹 Object 1 (Default Constructor)
        Book book1 = new Book();

        System.out.print("Enter Title: ");
        book1.setTitle(scanner.nextLine());

        System.out.print("Enter Author: ");
        book1.setAuthor(scanner.nextLine());

        System.out.print("Enter ISBN: ");
        book1.setIsbn(scanner.nextLine());

        // 🔹 Object 2 (Parameterized Constructor)
        Book book2 = new Book("Java Programming", "John Smith", "11111");

        // 🔹 Object 3 (Another Parameterized Object)
        Book book3 = new Book("History of Art", "Jane Doe", "22222");

        // IF statement to compare books
        if (book2 != null && book3 != null) {
            System.out.println("\nBoth predefined books are available.");
        }

        // Display all objects
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

       // 🔹 Pass book2 into method
        Book book4 = createBookFromAnother(book2);
        
         // book4 is the new copied object ✅
        System.out.println("\nbook4 (copied from book2):");
        book4.displayBook();
        
        scanner.close();
    
    }
    
     // 🔹 Parameterized method
    public static Book createBookFromAnother(Book book2)
    {

        // Create a new object using book2's data
        Book book4 = new Book(
                book2.getTitle(),
                book2.getAuthor(),
                book2.getIsbn()
        );

        System.out.println("book4 created from book2:");
        book4.displayBook();

        // book2 parameter goes out of scope AFTER method ends
        return book4;
    }
    
}
