package com.shubham.setandget;
//BLC
public class Mobile 
{
	
private int mId;
private String mName;
private String ram;

public void setMid(int mId) 
{
	this.mId=mId;
}

public void setMname(String mName) 
{
	this.mName=mName;
}

public void setRam(String ram) 
{
	this.ram=ram;
}

public  int getMid() 
{
	return mId;
}

public  String getMname() 
{
	return mName;
}

public  String getram() 
{
	return ram;
}

}
