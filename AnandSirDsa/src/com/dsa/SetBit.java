package com.dsa;

import java.util.Scanner;

public class SetBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers :");
		int n = sc.nextInt();
		int c = 0;
		for (int i = 0; i < 32; i++) {
			if (checkbit(n, i)) {
				c++;
			}
		}
		System.out.println(c);
		sc.close();
	}

	private static boolean checkbit(int n, int i) {

		return ((n >> i) & i) == 1;
	}

}
