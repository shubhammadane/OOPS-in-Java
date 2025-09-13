package com.shubham.ClassandObject;
class Lion
{
	static String name="Indian Lion";
	static String color="Brown";
	static String gender="Male";
	
	
	public static void info()
	{
		System.out.println("Lion king of the ANIMAL...");
	}
	
}
public class AnimalInfo11 
{
public static void main(String[] args) 
{
	 
	Lion.info();
	System.out.println("-------------------");
	System.out.println("Animal Name: "+Lion.name);
	System.out.println("Animal Colar: "+Lion.color);
	System.out.println("Animal Gender: "+Lion.gender);
 

}
}
