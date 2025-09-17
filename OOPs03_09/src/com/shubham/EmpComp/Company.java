package com.shubham.EmpComp;

public class Company 
{
	String registerNo;
    String cName;
    String location;
	public Company(String registerNo, String cName, String location) {
		super();
		this.registerNo = registerNo;
		this.cName = cName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [registerNo=" + registerNo + ", cName=" + cName + ", location=" + location + "]";
	}
    
    

}
