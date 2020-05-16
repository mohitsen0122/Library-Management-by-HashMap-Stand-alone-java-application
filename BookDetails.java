package com.lirarymanagmenet;

import java.util.HashMap;

public class BookDetails 
{
	static HashMap<String, BookSeperately> hashBooks = null;
	String callno;
	
	public BookDetails()
	{
		
	}
	public BookDetails(HashMap<String, BookSeperately> hashBook)
	{
		hashBooks = hashBook;
	}
	public BookDetails(String callno)
	{
		this.callno = callno;
	}
	public String getCallNo()
	{
		return callno;
	}
	public HashMap<String, BookSeperately> takeAddressOfBookHash()
	{
		return hashBooks;
	}
	public String toString()
	{
		return callno;
	}
	public static void main(String...mohit) 
	{
		BookDetails bd = new BookDetails(mohit[0]);
		if(hashBooks == null)
		{
			hashBooks = new HashMap<String , BookSeperately>();
		}
		hashBooks.put(bd.getCallNo(), new BookSeperately(mohit[0], mohit[1], mohit[2], mohit[3], mohit[4]  ));
		new BookDetails(hashBooks);
	}
}
