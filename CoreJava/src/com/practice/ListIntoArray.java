package com.practice;

import java.util.Arrays;
import java.util.List;

public class ListIntoArray {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// First way
		Object[] array = asList.toArray();
		System.out.println(Arrays.toString(array));

		// Second way
		Integer[] array2 = asList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(array2));
	}

}
