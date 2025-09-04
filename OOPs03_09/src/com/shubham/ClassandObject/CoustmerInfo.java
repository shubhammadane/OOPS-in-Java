package com.shubham.ClassandObject;
class Coustmer
{
	//Instance Variable
	int custId;
	String custName;
	String address;
	
	public void info() //user define Function->Function is self define,It's Perform the Logical Operation
	{
		  
		   System.out.println("Coustmer Id: "+custId);
			System.out.println("Coustmer Name: "+custName);
			System.out.println("Coustmer Address: "+address);
	}
	
}
public class CoustmerInfo
{
public static void main(String[] args) 
{
	Coustmer sharvari = new Coustmer();
	sharvari.custId=111;
	sharvari.custName="Sharvari K";
	sharvari.address="Nirala Bajar";
	sharvari.info();
	
	System.out.println("==============================");
	
	Coustmer khushi = new Coustmer();
	khushi.custId=125;
	khushi.custName="Khushii K";
	khushi.address="Nirala Bajar";
	khushi.info();
}
}
