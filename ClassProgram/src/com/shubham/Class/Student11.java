package com.shubham.Class;
class Student
{
	int stdId;
	String stdName;
	String address;
	
	public Student(int stdId, String stdName, String address) 
	{
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", address=" + address + "]";
	}
	
	
}
public class Student11 
{
public static void main(String[] args) 
{
	Student st = new Student(111, "Shubham Madane", "Pimplgaon Hare");
	System.out.println(st);
 }
}