package com.lirarymanagmenet;

import java.util.HashMap;

public class LibrarianDetails
{
	static HashMap<String, LibrarianEmployee> hashLibrarianDetails = null;
	String name;
	String pass;
	String email;
	String address;
	String city;
	String contactno;
		
	public LibrarianDetails() {   }
	public LibrarianDetails(String a) { name = a;  }
	public LibrarianDetails(HashMap<String, LibrarianEmployee> hashLibrarian)
	{
		hashLibrarianDetails = hashLibrarian;
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
		return name;
	}
	public  HashMap<String, LibrarianEmployee> takeAddressHashMap()
	{
		return hashLibrarianDetails;
	}
	public static void main(String...mohit) 
	{	
		LibrarianDetails ld = new LibrarianDetails(mohit[0]);
		if(hashLibrarianDetails == null)
		{
			hashLibrarianDetails = new HashMap<String, LibrarianEmployee>();
		}
		hashLibrarianDetails.put(ld.name, new LibrarianEmployee(mohit[0], mohit[1], mohit[2], mohit[3], mohit[4], mohit[5]));
		new LibrarianDetails(hashLibrarianDetails);
	}
}
