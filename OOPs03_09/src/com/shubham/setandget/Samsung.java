package com.shubham.setandget;

public class Samsung
{
public static void main(String[] args) 
{
	Mobile m1 = new Mobile();
	m1.setMid(111);
	m1.setMname("Samsung Ultra 25");
	m1.setRam("16-GB 512");
	
	
	String mname = m1.getMname();
	System.out.println(mname);
	
	System.out.println("Mobile Ram: "+m1.getram());
	
}
}
