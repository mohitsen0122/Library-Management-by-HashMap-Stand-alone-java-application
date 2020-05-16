package com.lirarymanagmenet;



public class BookSeperately 
{
	String callno;
	String name;
	String author;
	String publisher;
	String quantity;
	public BookSeperately() 
	{
		
	}
	public BookSeperately(String callno, String name, String author, String publisher, String quantity)
	{
		this.callno = callno;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public String toString()
	{
		return callno+" "+name+" "+author+" "+publisher+" "+quantity;
	}
	public static void main(String[] args) 
	{
		
	}
}
