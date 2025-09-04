package com.shubham.ClassandObject;
class Employe
{
	int empId;
	String empName;
	double salary;
	
	public void info() //user define Function->Function is self define,It's Perform the Logical Operation
	{
		 empId=123;
		 empName="Shubham Madane";
		 salary=250000;
		   System.out.println("Employee Id: "+empId);
			System.out.println("Employee Name: "+empName);
			System.out.println("Emplpoyee Salary: "+salary);
	}
}
public class Employee 
{
public static void main(String[] args) 
{
	Employe e1 = new  Employe();
	e1.info();
}
}
