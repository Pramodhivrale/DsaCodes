package org.dsa;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			for(int c=n;c>=1;c--)
			{
				if(r==c)
					System.out.print("*");
				else
				System.out.print(c);
			}
			
			System.out.println();
		}
		sc.close();
	}
}
