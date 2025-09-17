package com.shubham.CustShop;

public class Staff 
{
int staffId;
String staffName;
String designation;
double salary;
Shopkeeper shop;//HAS - Relationship 
public Staff(int staffId, String staffName, String designation, double salary, Shopkeeper shop) {
	super();
	this.staffId = staffId;
	this.staffName = staffName;
	this.designation = designation;
	this.salary = salary;
	this.shop = shop;
}
@Override
public String toString() {
	return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", designation=" + designation + ", salary="
			+ salary + ", shop=" + shop + "]";
}


}
