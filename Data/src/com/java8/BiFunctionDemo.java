package com.java8;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		Integer sum = add.apply(10, 52);
		System.out.println(sum);

	}

}
