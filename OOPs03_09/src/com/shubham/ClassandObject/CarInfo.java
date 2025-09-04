package com.shubham.ClassandObject;

 
class Car
{
	//Propertites (Data member + Variable)
	String carName;
	String carColor;
	double carPrice;
	
	//Behaviour(Function + method) 
	public void info()//user define function
	{
		System.out.println("Car Name: "+carName);
		System.out.println("Car Color: "+carColor);
		System.out.println("Car Price: "+carPrice);

	}
	public void start() 
	{
		System.out.println("Car is Start...");
	}
	
	public void stop() 
	{
		System.out.println("Car is stop...");
	}
	
	
	
}

public class CarInfo
{
public static void main(String[] args) 
{
	Car toyota = new Car();
	toyota.carName="Toyota";
	toyota.carColor="Black";
	toyota.carPrice=1200000;
	toyota.info();
	//toyota.start();
	//toyota.stop();
	
	System.out.println("====================");
	
	Car BMW = new Car();
	BMW.carName="BMW";
	BMW.carColor="Black";
	BMW.carPrice=5200000;
	BMW.info();
	//toyota.start();
	//toyota.stop();
	
}
}
