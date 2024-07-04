package org.dsa;

import java.util.Scanner;

public class Pattern4 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{
		
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}
			System.out.println();
		}
		sc.close();
	}

}
