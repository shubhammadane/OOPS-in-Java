package com.shubham.defaultConstrutcor;
//ELC --->Executable Logical Class
public class MainMethod 
{
public static void main(String[] args) 
{
	Manager m1 = new Manager();
	m1.info(111, "Shubham M", 25000);
	System.out.println(m1);
	
	Manager m2 = new Manager();
	m2.info(121, "Ram K", 35000);
	System.out.println(m2);
	
	
	//new is keyword.
	//The main purpose of the new keyword initialize the instance variable as well as Instance Method
	
}
}
