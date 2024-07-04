package org.dsa;

import java.util.Scanner;

public class Pattern13 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();	
		boolean flag=true;
		for(int r=1;r<=n;r++) {
			
			for(int c=1;c<=n;c++)
			{
				if(flag==true)
				{
					System.out.print(1);
					flag=false;
				}
              else {
            	  System.out.print(0);
            	  flag=true;
				
			}				
				
			}
			System.out.println();
		}
		sc.close();
	}

}
