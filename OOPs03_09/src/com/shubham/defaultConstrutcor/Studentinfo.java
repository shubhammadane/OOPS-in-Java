package com.shubham.defaultConstrutcor;

public class Studentinfo 
{
	int stdId;
	String stdName;
	char grade;
	float height;
	double fees;
	Object address;
	
	public Studentinfo() 
	{
		System.out.println("Student Id: "+stdId);//0
		System.out.println("Student Name: "+stdName);//null
		System.out.println("Student Grade: "+grade);//
		System.out.println("Student Fees: "+fees);//0.0	
		System.out.println("Student Height: "+height);//0.0
		System.out.println("Student Address: "+address);//0.0

	}
	

	public static void main(String[] args) 
	{
         new Studentinfo();
	}

}
