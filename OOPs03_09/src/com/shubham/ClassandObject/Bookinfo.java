package com.shubham.ClassandObject;
class Book
{
	//Insatnce Varible
	//Properties 
	int bookNo;
	String bookName;
	String author;
	double price;
	
	//Behaviour 
	public void info(int no,String name,String author,double price )
	{
		bookNo=no;
		bookName=name;
		this.author=author;
		this.price =price;
		
	}
	
//	public void show()
//	{
//		System.out.println("Book Number: "+bookNo);
//		System.out.println("Book Name: "+bookName);
//		System.out.println("Book Author: "+author);
//		System.out.println("Book Pirce: "+price);
//
//	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
}
public class Bookinfo 
{
public static void main(String[] args)
{
	Book book = new Book();
	book.info(111, "Wings of Fire", "Kalam Sir", 199);
	System.out.println(book);
 }
}
