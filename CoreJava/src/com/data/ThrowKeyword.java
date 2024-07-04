package com.data;

import java.util.Scanner;

public class ThrowKeyword 
{
	void meth1(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Invalid Age ! You will be eligible in "+(18-age)+" years");
		}
		else {
			
			System.out.println("You are eligibale for voting as your age is :"+age);
		}
	}
	public static void main(String[] args) throws InvalidAgeException
	{
		
		System.out.println("Enter your age to check your eligiblity for voting :");
	    Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		ThrowKeyword aobj=new ThrowKeyword();
		aobj.meth1(age);
		sc.close();
	}

}
