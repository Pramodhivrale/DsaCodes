package com.practice;

public class SwapWTemp {

	public static void main(String[] args) {
		int a = 20;
		int b = 13;

		a = a + b;
        b=a-b;
        a=a-b;
        System.out.println("a :"+a+" "+" b:"+b);
	}
}
