package com.java8;

import java.util.Scanner;

interface Inter {
	int meth1(int x);

}

public class Lamda {
	public static void main(String[] args) {
		Inter x = (int a) -> {
			if (a >= 18) {
				System.out.println("Eligibale for vote");
				return a;
			} else {
				System.out.println("Not eligibale for vote");
				return 0;
			}
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int meth1 = x.meth1(sc.nextInt());
		System.out.println(meth1);
		sc.close();

	}

}
