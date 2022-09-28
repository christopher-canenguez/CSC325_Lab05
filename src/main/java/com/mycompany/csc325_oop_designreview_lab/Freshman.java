/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author chriscanenguez
 */
class Freshman extends Student
{
    private int credits;
    
    Scanner scanner = new Scanner(System.in);
    
    public Freshman(String name, short age, int credits)
    {
        super(name, age);
        this.credits = credits;
    } // End constructor.

    /**
     * getCredits - returns the number of credits that the student currently has.
     * @return 
     */
    public int getCredits() 
    {
        return credits;
    }

    /**
     * setCredits - updates the number of credits the Student currently has.
     * @param credits 
     */
    public void setCredits(int credits) 
    {
        this.credits = credits;
    }
    
    /**
     * toString - description of object.
     */
    public String toString()
    {
        System.out.println(this.getName() + ", what is your GPA? Please enter an integer between 0 and 100 here: ");
        
        int gpa = (int) scanner.nextInt();
        
        while (gpa < 0 || gpa > 100)
        {
            System.out.println("Ooops, you've entered an invalid integer, please enter again: ");
            gpa = scanner.nextInt();
        }
        
        System.out.println();
        
        this.setGpa(gpa);
        
        String result = "";
        result = "Name: " + this.getName() + "\n" + 
                "Age: " + this.getAge() + "\n" + 
                "Credits: " + this.getCredits() + "\n" +
                "GPA: " + this.getGpa() + "\n" + 
                "Grade: Freshman" + "\n";
        
        return result;
    }
}
