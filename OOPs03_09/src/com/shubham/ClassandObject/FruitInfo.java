package com.shubham.ClassandObject;

 
class Fruit
{
	//instance Variable  
	int fid;
	String fname;
	String color;
	double price;
	
	//Parameter Variable are the one or more argumnet passed in the parantheses(Not a block) 
	public void info(int id,String name,String color,double price)
	{
		fid=id;
		fname=name;
		this.color=color;
		this.price=price;
	}
	
	public void show() 
	{
		System.out.println("Fruit Id: "+ fid);
		System.out.println("Fruit Name: "+fname);
		System.out.println("Fruit Color: "+ color);
		System.out.println("Fruit price: "+ price);

	}
}
public class FruitInfo 
{
public static void main(String[] args) 
{
	
	Fruit Mango = new Fruit();
	Mango.info(111, "Hapus Ambba", "Yellow/Green", 1000);
	Mango.show();
	
}
}
