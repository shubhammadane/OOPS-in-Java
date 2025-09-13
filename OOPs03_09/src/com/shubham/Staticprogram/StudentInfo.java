package com.shubham.Staticprogram;

class Student
{
    static int rollNo = 101;
    static String name = "Shubham Madane";
    static String collegeName = "GECA";

    public static void info()
    {
        System.out.println("Welcome dear student...");
    }
}

public class StudentInfo 
{
    public static void main(String[] args)
    {
        Student.info();

        System.out.println("Student Roll No   : " + Student.rollNo);
        System.out.println("Student Name      : " + Student.name);
        System.out.println("College Name      : " + Student.collegeName);
    }
}
