package com.shubham.CustShop;

public class MainClass 
{
public static void main(String[] args) 
{
Shopkeeper sk = new Shopkeeper("ID87598", "Tulsi NX", "Kumbhawada",878458784L);
Staff staff = new Staff(123, "Pratik", "Manager", 25000, sk);
System.out.println(staff);
}
}
      