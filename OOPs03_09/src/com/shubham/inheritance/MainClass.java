package com.shubham.inheritance;
//parent class
class Univercity
{
	void m1()
	{
		System.out.println("About Univercity");
	}
}

class Collage extends Univercity
{
	void m2() 
	{
		System.out.println("About Collage...");
	}
}

class Student extends Collage
{
	  void m3() 
	  {
       System.out.println("About Student...");
	}
}
public class MainClass 
{

	public static void main(String[] args)
	{
       Student s1 = new Student();
       s1.m1();
       s1.m2();
       s1.m3();
       
	}

}
