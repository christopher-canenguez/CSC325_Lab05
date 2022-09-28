
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human
{

    private int gpa;
    
    @Override
    /**
     * getAddress - returns the address of the Student.
     */
    public String getAddress() 
    {
        return this.address;
    } // End getAddress.

    @Override
    /**
     * setAddress - allows you update the address of the student.
     */
    public void setAddress(String address) 
    {
        this.address = address;
    } // End setAddress.
    
    /**
     * getGpa - returns the GPA of the Student.
     * @return int
     */
    public int getGpa() 
    {
        return gpa;
    } // End getGpa.

    /**
     * setGpa - updates the GPA of the Student.
     * @param gpa 
     */
    public void setGpa(int gpa) 
    {
        this.gpa = gpa;
    } // End setGpa.
	// ToDo 1: Make this class a child of Human - Completed.
	
	// ToDo 2: Fix the resulting errors - Completed.
	
	// ToDo 3: Add a field for GPA and create setter and getter - Completed.
	
	// ToDo 4: Add comments to your code
} // End Student.