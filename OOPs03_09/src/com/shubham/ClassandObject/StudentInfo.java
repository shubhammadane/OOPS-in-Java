package com.shubham.ClassandObject;
class Student
{
//Properties(Variable +	Data Member)
	int stdId;
	String stdName;
	String dept;
	String address; 
	
	//Behaviour 
	
	public void info() //user define Function->Function is self define,It's Perform the Logical Operation
	{
		stdId=111;
		stdName="Shubham Madane";
		dept="CSE";
		address="Tara Pan Center";	
	}
	
	public void display()
	{
		System.out.println("Student Id: "+stdId);
		System.out.println("Student Name: "+stdName);
		System.out.println("Student Dept: "+dept);
		System.out.println("Student Address: "+address);

	}
}
public class StudentInfo
{

	 public static void main(String[] args) 
	 {
		Student st = new Student();
		st.info();
		st.display();
	 }

}
