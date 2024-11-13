package com.dsa;

public class ArmStrongNumber {
	void meth1() {

	}

	public static void main(String[] args) {

		int num = 145;
		int temp = num;
		int sum = 0;
		int cube;

		while (num != 0) {
			int rem = num % 10;
			//System.out.println(rem);

			cube = (int) Math.pow(rem, 3);
			sum = sum + cube;

			num = num / 10;
			//System.out.println(num);

		}

		if (sum == temp) {
			System.out.println("AramStrong number");
		}
		else {
			System.out.println("Not");
		}
	}

}
