package com.data;

public class Fibonanci {
	public static void main(String[] args) {
		int num = 20;
		int a = 0;
		int b = 1;

		System.out.println(a);
		System.out.println(b);

		for (int i = 3; i <= num; i++) {
			int c=a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
