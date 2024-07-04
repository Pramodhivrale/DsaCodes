package com.data;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception 
{
	public InvalidAgeException(String s)
	{
	  System.out.println(s);
	}

}
