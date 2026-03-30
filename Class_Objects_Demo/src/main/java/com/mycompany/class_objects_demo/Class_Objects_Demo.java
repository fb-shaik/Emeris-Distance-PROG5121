
package com.mycompany.class_objects_demo;

public class Class_Objects_Demo {

    public static void main(String[] args) {
        //we need to create an object which is an instance of the Person class
        //Syntax: ClassName objectName = new ClassName();
        
        Person person1 = new Person(); //first object (instance of the Person class) 
        
        //assign values to the object via the DOT notation (.)
        //Syntax: objectName.methodName = assignedValue;
        
        person1.name = "Joe";
        person1.age = 20;
        person1.gender = "Male";
        person1.eyeColour = "Brown";
        person1.hairColour = "Black";
        person1.height = 1.80;
        person1.weight = 90; 
        
        //lets invoke the methods in the class
        System.out.println("\nMethod calls for object one known as person1: ");
        //Syntax: objectName.methodName();
        person1.displayInfo();
        person1.eat();
        person1.read();
        person1.sleep();
        person1.walk();
        
         person1.name = "Mike";
         person1.displayInfo();
       
    }
}
