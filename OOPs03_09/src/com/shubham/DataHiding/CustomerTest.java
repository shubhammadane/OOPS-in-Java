package com.shubham.DataHiding;

 
public class CustomerTest
{
    public static void main(String[] args)
    {
        Customer c = new Customer();
        System.out.println("Initial Balance: " + c.getBalance());

        c.deposit(5000);   // valid deposit
        c.withdraw(2000);  // valid withdrawal
        c.withdraw(20000); // invalid withdrawal
        c.deposit(-100);   // invalid deposit
    }
}
