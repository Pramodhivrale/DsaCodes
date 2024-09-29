package com.dsa1;

public class FactorialRecurssin {

	public static void main(String[] args) {
		int n=5;
		int factorial=fac(n);
		System.out.println(factorial);
	}

	private static int fac(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n * (fac(n-1)) ;
	}
}
