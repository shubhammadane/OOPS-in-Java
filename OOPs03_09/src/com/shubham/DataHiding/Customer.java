package com.shubham.DataHiding;

 
public class Customer
{
    private double balance = 10000; // Data Hiding

    public void deposit(double amount)
    {
        if (amount <= 0) 
        {
            System.out.println("Amount can't be deposited!!!");
        }
        else
        {
            balance = balance + amount;
            System.out.println("Balance after deposit is : " + balance);
        }
    }

    public void withdraw(double amount)
    {
        if (amount <= 0) 
        {
            System.out.println("Invalid withdrawal amount!");
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient Balance!");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Balance after withdrawal is : " + balance);
        }
    }

    public double getBalance()
    {
        return balance;
    }
}


