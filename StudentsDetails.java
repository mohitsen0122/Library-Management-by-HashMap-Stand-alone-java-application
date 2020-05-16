package com.lirarymanagmenet;

import java.util.HashMap;

public class StudentsDetails 
{
	static HashMap<String, StudentSeperately> hashMapStudentRecord = null;
	String callno;
	public StudentsDetails()
	{
		
	}
	public StudentsDetails(HashMap<String, StudentSeperately> StudentRecord)
	{
		hashMapStudentRecord = StudentRecord;
	}
	public StudentsDetails(String callno)
	{
		this.callno = callno;
	}
	public HashMap<String, StudentSeperately> takeAddressStudentDetails()
	{
		return hashMapStudentRecord;
	}
	public String getStudentId()
	{
		return callno;
	}
	public String toString()
	{
		return callno;
	}
	public static void main(String...mohit) 
	{
		StudentsDetails sd = new StudentsDetails(mohit[0]);
		if(hashMapStudentRecord == null)
		{
			hashMapStudentRecord = new HashMap<String, StudentSeperately>();
		}
		hashMapStudentRecord.put(sd.getStudentId(), new StudentSeperately(mohit[0], mohit[1], mohit[2], mohit[3]));
		new StudentsDetails(hashMapStudentRecord);
		
	}
	
}
