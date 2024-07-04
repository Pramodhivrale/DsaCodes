package com.data;

import java.util.Scanner;

public class CheckNumber 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter charcater :");
		char ch=sc.next().charAt(0);
		
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
			System.out.println("This is an alphabhate");
		}
		else if (ch >= '1' && ch <= '9') 
		{
			System.out.println("This is digit");	
		}
		else {
			System.out.println("This is speacial character ");
		}
		sc.close();
		
	}

}
