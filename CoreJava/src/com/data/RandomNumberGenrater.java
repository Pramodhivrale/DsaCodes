package com.data;

import java.util.Random;

public class RandomNumberGenrater {
	public static void main(String[] args) {

		String numbers = "123456789";

		Random r = new Random();

		StringBuilder s = new StringBuilder();

		for (int i = 1; i <= 6; i++) {
			int nextInt = r.nextInt(numbers.length());
			s.append(numbers.charAt(nextInt));

		}
		System.out.println(s);

	}

}
