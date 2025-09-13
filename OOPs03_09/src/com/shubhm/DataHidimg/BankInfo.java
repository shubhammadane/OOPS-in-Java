package com.shubhm.DataHidimg;
class Bank
{
	private double balance=10000;
	
	public void deposit(double amount) //5000
	{
		balance=balance+amount;
		
		System.out.println("Total Balance: "+balance);
	}
	
	public void withdraw(double amount) //7000
	{
		balance=balance-amount;
		
		System.out.println("Remaining Balance: "+balance);//8000
	}
}
public class BankInfo 
{
public static void main(String[] args) 
{
	Bank shubham = new Bank();
	//shubham.balance=0;
	shubham.withdraw(13000);
}	

}
