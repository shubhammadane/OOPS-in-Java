package com.shubham.player;
//BLC Business logical Class
public class Player
{
	//Instance Variable
int Jersey;
String pName;
String Profession;
float height;
int age;

public Player() 
{
	System.out.println("Player :: Constructor");
}
//Parameterize function
public void info(int jersey,String name, String prof,float ht,int age) 
{
	Jersey=jersey;
	pName=name;
	Profession=prof;
	height=ht;
	this.age=age;
}

@Override
public String toString() {
	return "Player [Jersey=" + Jersey + ", pName=" + pName + ", Profession=" + Profession + ", height=" + height
			+ ", age=" + age + "]";
}


}
