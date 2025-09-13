//Hierarchical inheritance
package com.shubham.inheritance;
//Parent Class
class Fruite
{
	public void m1() 
	{
		System.out.println("Fruite information....");
	}
}
class Apple extends Fruite
{
	public void name() 
	{
		System.out.println("Kashmirii Appple....");

	}
}
class Orange extends Fruite
{
	public void name() 
	{
		System.out.println("Nagpuriii Orange....");

	}
}
public class FruiteInfo 
{
public static void main(String[] args) 
{
	Apple a1 = new Apple();
	a1.m1();
	a1.name();
	
	Orange o1 = new Orange();
	o1.name();
}
}
