package com.shubham.Hotel;

public class Hotel 
{
String hotelNo;
String hotelName;
String address;
public Hotel(String hotelNo, String hotelName, String address) {
	super();
	this.hotelNo = hotelNo;
	this.hotelName = hotelName;
	this.address = address;
}
@Override
public String toString() {
	return "Hotel [hotelNo=" + hotelNo + ", hotelName=" + hotelName + ", address=" + address + "]";
}


}
