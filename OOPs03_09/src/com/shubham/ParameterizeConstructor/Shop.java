package com.shubham.ParameterizeConstructor;
//BLC class
public class Shop 
{
int shopId;
String shopName;
String address;

//Parameterize Constructor
public Shop(int id,String name,String add) 
{
	shopId=id;
	shopName=name;
	address=add;
}

@Override
public String toString() {
	return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", address=" + address + "]";
}


}
