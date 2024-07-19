package com.dsa1;

public class TrangleInnerSpace_Day3 
{
	public static void main(String[] args) {
		

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= (6 - i); k++) {
				if(k==2) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
