package com.shubham.Encapsulation;

public class Userinfo 
{
public static void main(String[] args)
{
	Instagram u1 = new Instagram();
	u1.setUserName("shubhammadane");
	u1.setPassword("Shubham098");
	u1.setDob("5 8 2000");
	
	String string = u1.getUserName();
	System.out.println("User Name: "+string);
}
}
