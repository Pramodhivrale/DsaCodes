package com.data;

import java.util.Scanner;

public class Exponent 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base :");
		int base=sc.nextInt();
		int output=1;
		System.out.println("Enter exponent");
		int expo=sc.nextInt();
		
		for(int i=1;i<=expo;i++) 
		{
			output=output*base;
		}
		System.out.println(output);
		sc.close();
	}

}
