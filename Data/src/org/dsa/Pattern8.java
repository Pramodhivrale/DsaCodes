package org.dsa;

import java.util.Scanner;

public class Pattern8 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int count=1;
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		sc.close();
	}

}
