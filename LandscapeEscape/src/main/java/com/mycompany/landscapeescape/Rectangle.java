/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.landscapeescape;


/**
 *
 * @author nmagongo
 */
public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    //Default constructor:
    public Rectangle()
    {
        //Automatically created by the Java compiler if no other constructors are defined
    }

    //Parameterized constructor: Initializes a Rectangle object
    public Rectangle(double len, double wid)
    {
        //this operator: Referes to the current object
        length = len;
        width = wid;
    }
    
    //Method to retrieve a rectangle's length for use by another class
    //public: access modifier. Int: returns an double value
    public double getLength()
    {
        return length;
    }
    
    //Method to set the rectangle's length
    //public access, returns nothing, requires a parameter that represents the rectangle's length of double type
    public void setLength(double len)
    {
        length = len;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth(double wid)
    {
        width = wid;
    }
    
    public double calcPerimeter()
    {
        return 2 * (length + width);
       
    }
    
    public double calcArea()
    {
        return length * width;
     
    }
    
    public String toString()
    {
        return "Length is: " + length + " Width is: " + width;
    }
    
}


