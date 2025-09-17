package com.shubham.Hotel;

public class Waiter 
{
String wName;
String address;
double salary;
double comm;
Hotel hotel;
public Waiter(String wName, String address, double salary, double comm, Hotel hotel) {
	super();
	this.wName = wName;
	this.address = address;
	this.salary = salary;
	this.comm = comm;
	this.hotel = hotel;
}
@Override
public String toString() {
	return "Waiter [wName=" + wName + ", address=" + address + ", salary=" + salary + ", comm=" + comm + ", hotel="
			+ hotel + "]";
}




 }
