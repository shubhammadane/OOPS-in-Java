package com.shubha.setterGetter;
class Whatsapp
{
	private String wUserName;
	private long phno;
	private String email;
	
	public String getwUserName() {
		return wUserName;
	}
	public void setwUserName(String wUserName) {
		this.wUserName = wUserName;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
public class WhatSapInfo 
{
public static void main(String[] args) 
{
	Whatsapp info = new Whatsapp();
	info.setwUserName("Shubham Madane");
	info.setEmail("shubhajjj00@gmail.com");
	info.setPhno(784565255);
	System.out.println("User Name: "+info.getwUserName());
	
	System.out.println("User Name: "+info.getEmail());
	System.out.println("User Name: "+info.getPhno());

 }
}
