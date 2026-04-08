
package com.mycompany.restaurantordersystem_demo;

//1. Order Class - Encapsulation + Constructor
public class Order {
    //private fields (variables)
    private String name; //customer name
    private int amount; // total order amount
    private boolean member; //(true/false if the customer is a member)
    private String meal; //Type of meal ordered (veg, non-veg, vegan)
    
    //Parameterised Constructor
    public Order(String name, int amount, boolean member, String meal) {
        this.name = name;
        this.amount = amount;
        this.member = member;
        this.meal = meal;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isMember() {
        return member;
    }

    public String getMeal() {
        return meal;
    }
    
    
    
    
    
}
