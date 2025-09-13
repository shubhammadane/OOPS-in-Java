package com.shubham.festival;

import java.util.Date;

public class Festival 
{
	//instance Variable
String fName;
String month;
Date date;
public Festival(String fName, String month, Date date) {
	super();
	this.fName = fName;
	this.month = month;
	this.date = date;
}
@Override
public String toString() {
	return "Festival [fName=" + fName + ", month=" + month + ", date=" + date + "]";
}





}
