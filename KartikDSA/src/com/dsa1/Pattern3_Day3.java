package com.dsa1;

public class Pattern3_Day3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= (6 - i); k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
