package com.shubham.EmpComp;

public class MainClass 
{
public static void main(String[] args)
{
Company c1 = new Company("TCS1234", "TCS", "Pune");
Employe e1 = new Employe("SA12AA", "Sharvari K", 7414664211L, "Java Developer", 72000, c1);
System.out.println(e1);
}
}
