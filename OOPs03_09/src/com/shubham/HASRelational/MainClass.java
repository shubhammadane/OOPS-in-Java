package com.shubham.HASRelational;

public class MainClass 
{
public static void main(String[] args) 
{
	Collage clg = new Collage(123, "PES", "DBAMU", "A++");
	Student s1 = new Student(325, "Divya T", "Dbamu", "DSE", 65000, clg);
	System.out.println(s1);
	
	
}
}
