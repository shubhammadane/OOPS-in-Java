package com.shubham.ClassandObject;
class Animal
{
	  
	public void dog() 
	{
		//Local Variable Define only function/method
		String name="Puppy";
		System.out.println("Dog Name: "+name);
	}
	
	public void cat() 
	{
		String name="Minimau";
		System.out.println("Cat Name: "+name);
	}
}
public class AnimalInfo 
{
public static void main(String[] args) 
{
	Animal an1 = new Animal();
	an1.dog();
	an1.cat();
}
}
