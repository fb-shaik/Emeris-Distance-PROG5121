/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopbankapp;

/**
 *
 * @author nmagongo
 */
import java.util.Scanner;
public class OOPBankApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Create a Bank object
        Bank acc = new Bank(1000.00);

        System.out.println("=== Simple Banking App ===");
        System.out.println("1. Display Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");

        System.out.print("Choose an option: ");
        int choice = scan.nextInt();

        // IF-ELSE (no switch, no loops)
        if (choice == 1) {
            acc.displayBalance();
           } else if (choice == 2) {
            System.out.print("Enter amount to deposit: R");
            double amount = scan.nextDouble();
            acc.deposit(amount);
            acc.displayBalance();

        } else if (choice == 3) {
            System.out.print("Enter amount to withdraw: R");
            double amount = scan.nextDouble();
            acc.withdraw(amount);
            acc.displayBalance();

        } else {
            System.out.println("Invalid option selected.");
        }

        System.out.println("Program finished.");
        scan.close(); 
            

    }
}
