/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraydemo;

/**
 *
 * @author nmagongo
 */
public class Student 
{
 
    String name;
    int score;
    String grade;
    
    public Student(String name, int score)
    {
        this.name = name;
        this.score = score;
        
        if(score >=75)
            grade = "Distinction";
        else if(score>=50)
            grade = "Pass";
        else 
            grade = "Fail";
        
    }
    
    
}
