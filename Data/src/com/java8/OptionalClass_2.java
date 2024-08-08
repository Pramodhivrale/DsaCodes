package com.java8;

import java.util.Optional;

public class OptionalClass_2 {
	public static void main(String[] args) {

		String name = null;

//		int length = name.length();
//		System.out.println(length);
//		
		Optional<String> ofNullable = Optional.ofNullable(name);

		if (ofNullable.isPresent()) {
			System.out.println("Data is present");
			System.out.println(ofNullable.get());
		} else if (ofNullable.isEmpty()) {
			System.out.println("Data is not present");
		}

	}

}
