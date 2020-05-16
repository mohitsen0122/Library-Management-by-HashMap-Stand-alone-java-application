package com.lirarymanagmenet;

public class StudentSeperately
{
	String callno;
	String studentid;
	String name;
	String contactno;
	public StudentSeperately()
	{
		
	}
	public StudentSeperately(String callno, String studentid, String name, String contactno)
	{
		this.callno = callno;
		this.studentid = studentid;
		this.name = name;
		this.contactno = contactno;
	}
	public String toString()
	{
		return callno+" "+studentid+" "+name+" "+contactno;
	}
}
