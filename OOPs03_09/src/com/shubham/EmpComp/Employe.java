package com.shubham.EmpComp;

public class Employe 
{
String empId;
String empName;
long phno;
String designation;
double salary;
Company comp;//HAS A Relationship
public Employe(String empId, String empName, long phno, String designation, double salary, Company comp) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.phno = phno;
	this.designation = designation;
	this.salary = salary;
	this.comp = comp;
}
@Override
public String toString() {
	return "Employe [empId=" + empId + ", empName=" + empName + ", phno=" + phno + ", designation=" + designation
			+ ", salary=" + salary + ", comp=" + comp + "]";
}


}
