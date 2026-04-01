/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constantsdemo;
import java.util.Scanner;
/**
 *
 * @author nmagongo
 */

public class ConstantsDemo {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");
        //Constant: a variable whose value cannot change
        //Keyword - final
        //syntax: final dataType CONSTANT_NAME = FIXEDVALUE (must be in uppercase)
        
        final double TAX_RATE = 0.15;//Constant
        System.out.println("Please enter the product price R");//shortcut: sout + tab
        double price = input.nextDouble();
        
        //Arithmetic operation
        //%: Modulus (Remainder of)
        // /, *, +, - BODMAS rule
        double tax = price * TAX_RATE;
        double finalPrice = tax + price;
        
        System.out.println("Original price: R" + price);
        System.out.println("Tax rate: " + TAX_RATE);
        System.out.println("The calculated tax is: " + tax);
        System.out.println("The final price is: " + finalPrice);
        input.close();
        
        //We do not need an emulator with Netbeans
        //We write desktop apps, not mobile apps with Netbeans
        
        
        
        
    }
}
