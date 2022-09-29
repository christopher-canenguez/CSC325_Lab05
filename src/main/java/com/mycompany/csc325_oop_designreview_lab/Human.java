package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human 
{
    private String name;
    protected String address;
    private short age;
	
    // constructor that takes only two paras
    public Human(String name, short age) 
    {
	this.name = name;
	this.age = age;
    } // End constructor.
    
    /**
     * getName - returns the name of the Human.
     * @return 
     */
    public String getName() 
    {
        return name;
    } // End getName.
    
    /**
     * setName - allows for you to update the name of the Human..
     * @param name 
     */
    public void setName(String name) 
    {
	this.name = name;
    } // End setName.
	
    // Abstract method to retrieve address.
    public abstract String getAddress() ;
	
    // Abstract method to setAddress.
    public abstract void setAddress(String address);
	
	
    /**
     * getAge - returns the age of the Human.
     * @return 
     */
    public short getAge() 
    {
	return age;
    } // End getAge.
	
    /**
     * setAge - allows the user to update the age of the Human.
     * @param age 
     */
    public void setAge(short age) 
    {
	this.age = age;
    } // End setAge.
} // End Human class.
