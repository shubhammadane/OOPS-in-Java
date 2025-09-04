package com.shubham.ClassandObject;

import java.util.Scanner;

class Collage
{
	//Instance Variable->instance variable define inside the class and outside the method.
	//properties 
	int clgId;
	String clgName;
	String address;
	
	public void info() 
	{
		System.out.println("Collage  Id: "+clgId);
		System.out.println("Collage Name: "+clgName);
		System.out.println("Collage Address: "+address);
	}
}
public class CollageInfo 
{
public static void main(String[] args)
{
	Collage clg1 = new Collage();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Collage Id: ");
	int id = sc.nextInt();
	
	System.out.println("Enter the Collage Name: ");
	String name = sc.nextLine();
	  name = sc.nextLine();

	System.out.println("Enter the Collage Address: ");
	String add = sc.nextLine();
 	
	
	clg1.clgId=id;
	clg1.clgName=name;
	clg1.address=add;
	
	clg1.info();
	
	
	
}
}
