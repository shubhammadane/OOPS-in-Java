package com.shubham.AbstractClas;
abstract class Company
{
	//abstract Method
	public abstract void name(String name); 
}
class TCS extends Company
{

	@Override
	public void name(String name) 
	{
		System.out.println("Company Work: "+name);
	}
	
}
class Infosys extends Company
{

	@Override
	public void name(String name) 
	{
		System.out.println("Company Work: "+name);
		
	}
	
}
public class MainClass 
{
public static void main(String[] args) 
{
	new TCS().name("Software Work");
	new Infosys().name("Software Work");
}
}
