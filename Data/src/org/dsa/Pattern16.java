package org.dsa;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			// Print leading spaces
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");

			}
			// Print stars
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
		sc.close();
		
	}

}
