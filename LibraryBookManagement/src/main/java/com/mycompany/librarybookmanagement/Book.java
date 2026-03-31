/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarybookmanagement;

/**
 *
 * @author nmagongo
 */
public class Book {
    
    private String title;
    private String author;
    private String isbn;
    
    //default constructor
    public Book()
    {
        
    }
    
    //parameterized constructor
    public Book(String title, String author, String isbn)
    {
        this.title = title; //prevents ambiguous as
        this.author = author;
        this.isbn = isbn;
        
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
     
    public void displayBook()
    {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
}
