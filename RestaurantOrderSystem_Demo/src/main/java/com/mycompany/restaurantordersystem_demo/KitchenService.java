
package com.mycompany.restaurantordersystem_demo;

//Service class responsible for handling order processing logic
public class KitchenService {
    
    //method that process an order
    public void processOrder(Order order)
    {
        //print a header to indicate that processing has started
        System.out.println("\n-----Order Processing----");
        
        //Check if the order amount > 200 (true - free dessert)
        if(order.getAmount() > 200)
        {
            System.out.println("Free Dessert Included!");
        }
        
        if(order.isMember())
        {//true path
            System.out.println("You will receive a discount");
        }else
        {//false
            System.out.println("Sorry, no discount.");
        }
        
        //compound statement 
        if(order.getAmount() > 100 && order.isMember())
        {
            System.out.println("Priority Order!");
        }else
        {
            System.out.println("Normal Order!");
        }
        
        switch (order.getMeal().toLowerCase())
        {
            case "veg":
                        System.out.println("Preparing a veg meal");
            break; //Stops execution for case 1
            
            case "non-veg":
                        System.out.println("Preparing a non-veg meal");
            break; //Stops execution for case 1
            
            case "vegan":
                        System.out.println("Preparing a vegan meal");
            break; //Stops execution for case 1
            default:
                System.out.println("Invalid meal type");
                //if the input does not match any of the above options        
        }
    
    }
    
    
    
    
}
