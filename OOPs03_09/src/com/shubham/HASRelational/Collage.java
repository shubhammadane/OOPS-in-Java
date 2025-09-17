package com.shubham.HASRelational;
//BLC class
public class Collage 
{
	
int clgId;
String clgName;
String address;
String naacGrade;

public Collage(int clgId, String clgName, String address, String naacGrade) {
	super();
	this.clgId = clgId;
	this.clgName = clgName;
	this.address = address;
	this.naacGrade = naacGrade;
}

@Override
public String toString() {
	return "Collage [clgId=" + clgId + ", clgName=" + clgName + ", address=" + address + ", naacGrade=" + naacGrade
			+ "]";
}



}
