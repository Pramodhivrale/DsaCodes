package com.revision;

public class PowerOfNoDay_20 {
	public static void main(String[] args) {
		int base = 2;
		int power = 4;

		int result = powerOfNo(base, power);
		System.out.println(result);

	}

	private static int powerOfNo(int base, int power) {
		if (power == 0) {
			return 1;
		}

		return base * powerOfNo(base, power - 1);
	}

}
