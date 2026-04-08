package com.mycompany.restaurantordersystem_demo;

import java.util.Scanner;  //user driven app; captures user input

public class RestaurantOrderSystem_Demo {

    public static void main(String[] args) {
      
//Create a scanner object
Scanner input = new Scanner (System.in);
        
//prompt the user for (Name, Order Amount, Check if they are a member, Meal type)
System.out.println("Enter customer name: ");
String name = input.nextLine();

System.out.println("Enter order amount: ");
int amount = input.nextInt();

System.out.println("Are you a member? (true/false): ");
boolean isMember = input.nextBoolean();
input.nextLine();

System.out.println("Enter meal type (veg/non-veg/vegan) : ");
String meal = input.nextLine();

        
//create an object for the Order class based on the above data captured
//ClassName objectName = new Contructor();
Order order = new Order(name, amount, isMember, meal);


//create an object for the KitchenService class to process the order
KitchenService service = new KitchenService();
//to a method call with the object above to implement the logic
service.processOrder(order); //the Order object will be passed along to the method as an argument. 


//close the scanner object
input.close();
        
    }
}
