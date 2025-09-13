package com.shubham.festival;

import java.util.Date;

public class MainClass 
{
public static void main(String[] args) 
{
	Festival f1 = new Festival("Navratri", "Sep",  new Date());
	System.out.println(f1);
	
	Festival f2 = new Festival("Pola", "August", new Date());
	System.out.println(f2);
}
}
