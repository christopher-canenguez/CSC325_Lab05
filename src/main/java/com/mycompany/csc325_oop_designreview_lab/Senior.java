/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author chriscanenguez
 */
class Senior extends Student
{
    private int credits;
    
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
        String result = "";
        result = "Name: " + this.getName() + "\n" + 
                "Age: " + this.getAge() + "\n" + 
                "Credits: " + this.getCredits() + "\n" +
                "Grade: Senior" + "\n";
        
        return result;
    }
}
