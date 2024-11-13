package com.data;

public class FrequencyOfDigit2 {
	public boolean frequency() {

		int number = 123423;
		int key=2;
		char forDigit = Character.forDigit(key, 10);
		String valueOf = String.valueOf(number);
		for (int i = 0; i <= valueOf.length() - 1; i++) {
			
			if (forDigit == valueOf.charAt(i)) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		boolean frequency = new FrequencyOfDigit2().frequency();
		System.out.println(frequency);
	}
}
