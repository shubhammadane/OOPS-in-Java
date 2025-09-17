package com.shubham.HASRelational;
//BLC class
public class Student 
{
int stdId;
String stdName;
String address;
String dept;
double fees;
Collage clg;// HAS - Relation 

public Student(int stdId, String stdName, String address, String dept, double fees, Collage clg) {
 	this.stdId = stdId;
	this.stdName = stdName;
	this.address = address;
	this.dept = dept;
	this.fees = fees;
	this.clg = clg;
}
 
@Override
public String toString() 
{
	return "Student [stdId=" + stdId + ", stdName=" + stdName + ", address=" + address + ", dept=" + dept + ", fees="
			+ fees + ", clg=" + clg + "]";
}


}
