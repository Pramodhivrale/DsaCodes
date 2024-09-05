package com.dsa1;

public class DivisibleOf5And3 {
	public static void main(String[] args) {
//		int n=20;
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			if(i % 3 ==0 || i % 5==0) {
//				
//				count++;
//			}
//		}
//		System.out.println(count);

		int n = 20;
		int a = n / 5;
		int b = n / 3;
		int c = n / 15;
		int count = a + b - c;
		System.out.println("Count of numbers divisible by 3 or 5: " + count);

	}

}
