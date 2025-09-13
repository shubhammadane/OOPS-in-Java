//Single Inheritance 
package com.shubham.inheritance;
//Parent class
class Animal
{
	public void info() 
	{
		System.out.println("Animal Inforamtion...");
	}
}
//Child class
class Dog extends Animal
{
	public void name() 
	{
		System.out.println("Puppay....");
	}
}
public class AnimalInfo 
{
public static void main(String[] args)
{
	Dog dog = new Dog();
	dog.info();
	dog.name();
}
}
