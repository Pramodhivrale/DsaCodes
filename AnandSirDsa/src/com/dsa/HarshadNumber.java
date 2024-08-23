package com.dsa;

public class HarshadNumber {
	public static void main(String[] args) {

		int num = 333;
		int temp=num;
        int sum=0;
        
        
		while (num != 0) {
			int lastDigit = num % 10;

			num = num / 10;

			sum = lastDigit + sum;

		}
		System.out.println(sum);
		if(temp % sum ==0) {
			System.out.println("This is harshad number");
		}
		else {
			System.out.println("This is not else block");
		}
		
	}

}
