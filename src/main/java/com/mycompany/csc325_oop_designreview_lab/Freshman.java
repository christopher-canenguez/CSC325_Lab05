/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner; // Imported Scanner class to use user input.

/**
 *
 * @author chriscanenguez
 */
class Freshman extends Student
{
    private int credits;
    
    // Created Scanner object.
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
        System.out.println(this.getName() + ", what is your GPA? Please enter an integer between 0 and 100 here: ");
        
        // Scanner retrieves user input and places it into integer variable.
        int gpa = (int) scanner.nextInt();
        
        // While loop will continue to ask user for input until they use correct integer.
        // Integer that goes from 0 to 100.
        while (gpa < 0 || gpa > 100)
        {
            System.out.println("Ooops, you've entered an invalid integer, please enter again: ");
            gpa = scanner.nextInt();
        } // End while loop.
        
        System.out.println(); // Extra line.
        
        // Update gpa attribute.
        this.setGpa(gpa);
        
        String result = ""; // Empty string variable.
        result = "Name: " + this.getName() + "\n" + 
                "Age: " + this.getAge() + "\n" + 
                "Credits: " + this.getCredits() + "\n" +
                "GPA: " + this.getGpa() + "\n" + 
                "Grade: Freshman" + "\n";
        
        return result;
    } // End toString method.
} // End Freshman class.
