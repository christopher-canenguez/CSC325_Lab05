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
class Senior extends Student
{
    private int credits;
    
    // Create scanner object.
    Scanner scanner = new Scanner(System.in);
    
    public Senior(String name, short age, int credits)
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
    } // End getCredits.

    /**
     * setCredits - updates the number of credits the Student currently has.
     * @param credits 
     */
    public void setCredits(int credits) 
    {
        this.credits = credits;
    } // End setCredits.
    
    /**
     * toString - description of object.
     */
    @Override
    public String toString()
    {
        System.out.println(this.getName() + ", what is your GPA? Please enter here: ");
        
        // Hold integer that user enters.
        int gpa = (int) scanner.nextInt();
        
        // While loop that will continue to ask the user for a GPA
        // Until a valid integer from zero to 100 is entered.
        while (gpa < 0 || gpa > 100)
        {
            System.out.println("Ooops, you've entered an invalid integer, please enter again: ");
            gpa = scanner.nextInt();
        } // End while loop.
        
        System.out.println(); // Empty line.
        
        // Update GPA.
        this.setGpa(gpa);
        
        String result = "";
        result = "Name: " + this.getName() + "\n" + 
                "Age: " + this.getAge() + "\n" + 
                "Credits: " + this.getCredits() + "\n" +
                "GPA: " + this.getGpa() + "\n" + 
                "Grade: Senior" + "\n";
        
        return result;
    } // End toString.
} // End Senior class.9
