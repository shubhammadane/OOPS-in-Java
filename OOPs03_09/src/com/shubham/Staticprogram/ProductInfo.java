package com.shubham.Staticprogram;
class Product
{
	static int pId=1111;
	static String pname="Parle-G";
	static String companyName="Britania";
	
	public static void info()
	{
		System.out.println("Good Morning dear friend...");
	}
}
public class ProductInfo 
{
public static void main(String[] args)
{
	Product.info();
	
	System.out.println("Product Id: "+Product.pId);
	System.out.println("Product Name: "+Product.pname);
	System.out.println("Product companyName: "+Product.companyName);

}
}
