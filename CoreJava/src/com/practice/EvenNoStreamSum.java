package com.practice;

import java.util.Arrays;
import java.util.List;

public class EvenNoStreamSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Integer reduce = numbers.stream().filter(number -> number % 2 == 0)// Filter the even
				.map(n -> n * n)// Square of the even
				.reduce(0, Integer::sum);// sum of the Square
		System.out.println(reduce);

	}

}
