package org.dsa;

import java.util.Scanner;

public class Pattern5 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=sc.nextInt();
		
		for(int r=n;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
