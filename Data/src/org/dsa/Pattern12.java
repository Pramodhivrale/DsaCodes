package org.dsa;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();

		for (int r = n; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				if (c == 1 || c == r || r == n) {
					System.out.print("* ");
				} else {
					System.out.print("  "); // Two spaces for the gap
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
