
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
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
    }

    @Override
    /**
     * setAddress - allows you update the address of the student.
     */
    public void setAddress(String address) 
    {
        this.address = address;
    }
    
    /**
     * getGpa - returns the Gpa of the Student.
     * @return int
     */
    public int getGpa() 
    {
        return gpa;
    }

    /**
     * setGpa - updates the Gpa of the Student.
     * @param gpa 
     */
    public void setGpa(int gpa) 
    {
        this.gpa = gpa;
    }
	// ToDo 1: Make this class a child of Human - Completed.
	
	// ToDo 2: Fix the resulting errors - Completed.
	
	// ToDo 3: Add a field for GPA and create setter and getter - Completed.
	
	// ToDo 4: Add comments to your code

    

}