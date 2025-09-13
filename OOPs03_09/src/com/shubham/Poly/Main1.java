package com.shubham.Poly;
class Addition
{
	//OverLoading
	public void add(int a,int b) 
	{
		 int sum=a+b;
		 System.out.println("Add Sum: "+sum);
		
	}
	
	public void add(int a,int b,int c) 
	{
		 int sum=a+b+c;
		 System.out.println("Add Sum: "+sum);
		
	}
	
	public void add(int a,int b,int c,int d) 
	{
		 int sum=a+b+c+d;
		 System.out.println("Add Sum: "+sum);
		
	}
}
public class Main1 
{
public static void main(String[] args) 
{
	Addition a1 = new Addition();
	a1.add(10, 10);
	a1.add(10,20, 30);
	a1.add(10,20, 30,40);

}
}
