package com.shubham.CustShop;
//BLC
public class Shopkeeper 
{
  String registerNo;
  String shopName;
  String address;
  long phno;
  
  public Shopkeeper(String registerNo, String shopName, String address, long phno) {
	super();
	this.registerNo = registerNo;
	this.shopName = shopName;
	this.address = address;
	this.phno = phno;
  }

  @Override
  public String toString()
  {
	return "Shopkeeper [registerNo=" + registerNo + ", shopName=" + shopName + ", address=" + address + ", phno=" + phno
			+ "]";
  }
  
  
}
