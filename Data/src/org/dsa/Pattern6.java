package org.dsa;

import java.util.Scanner;

public class Pattern6 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=sc.nextInt();
		
		for(int r=0;r<=n;r++)
		{
			for(int c=0;c<=r;c++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
