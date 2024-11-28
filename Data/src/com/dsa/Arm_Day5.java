package com.dsa;

public class Arm_Day5 {
	public static void main(String[] args) {
		int num = 370;
		int cubeaddition = 0;

		while (num != 0) {
			int rem = num % 10;
			int cube = rem * rem * rem;
			num = num / 10;
			cubeaddition = cubeaddition + cube;

		}
		if (cubeaddition == num) {
			System.out.println("This is Armstrong number");
		}

	}

}
