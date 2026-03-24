/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopbankapp;

/**
 *
 * @author nmagongo
 */
public class Bank {
    
    //private member variables
    private double balance;
    
    // CONSTRUCTOR
    public Bank(double initialBalance) {
        balance = initialBalance;
    }

    // METHOD: Display Balance
    public void displayBalance() {
        System.out.println("Current balance: R" + balance);
    }

    // METHOD: Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // METHOD: Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
    
}
