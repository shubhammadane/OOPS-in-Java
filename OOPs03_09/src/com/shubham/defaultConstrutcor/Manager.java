package com.shubham.defaultConstrutcor;
//BLC-->Business Logical Class
public class Manager
{
//Insatnce  Variable(Properties)
int manId;
String manName;
double salary;

//Default Construtor--->Added by Compiler 

//Parameter Function(Instacne Method/Function)
public void info(int manId,String manName,double salary)
{
	this.manId=manId;
	this.manName=manName;
	this.salary=salary;
}

@Override
public String toString() 
{
	return "Manager [manId=" + manId + ", manName=" + manName + ", salary=" + salary + "]";
}



}
