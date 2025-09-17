package com.shubham.Hotel;

public class MainClass
{
public static void main(String[] args) 
{
Hotel hotel = new Hotel("RAMA123","Rama International", "Highcourt");
Waiter waiter = new Waiter("Komal", "7 Hills", 35000, 300, hotel);
System.out.println(waiter);
}
}
