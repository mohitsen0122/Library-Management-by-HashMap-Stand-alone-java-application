package com.lirarymanagmenet;

import java.util.HashMap;

public class LibrarianEmployee 
{
	String name;
	String pass;
	String email;
	String address;
	String city;
	String contactno;
	static HashMap<String,LibrarianEmployee> hashMapDetailsOfEmployee;
	public LibrarianEmployee()
	{
		
	}
	public LibrarianEmployee(String name,String pass,String email,String address,String city,String contactno)
	{
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.address = address;
		this.city = city;
		this.contactno = contactno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setContactNo(String contactno)
	{
		this.contactno = contactno;
	}
	
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}
	public String getEmail()
	{
		return email;
	}
	public String getAddress()
	{
		return address;
	}
	public String getCity()
	{
		return city;
	}
	public String getContactNo()
	{
		return contactno;
	}
	public String toString()
	{
		return name+" "+pass+" "+email+" "+address+" "+city+" "+contactno;
	}
	
}
