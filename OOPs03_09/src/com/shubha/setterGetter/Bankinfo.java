package com.shubha.setterGetter;
class Bank
{
	private double balance;

	public double getBalance()//20000 
	{
		return balance;
	}

	public void setBalance(double balance)//20000 
	{
		this.balance = balance;
	}
	
	 
}
public class Bankinfo 
{
public static void main(String[] args) 
{
	Bank bank = new Bank();
	bank.setBalance(20000);
	System.out.println(	bank.getBalance());
 	//bank.balance=0;
 	
}
}
