package com.data;

import java.util.Optional;

public class Throw {
	public void throwException() {
		try {
			String arr[] = new String[5];
			arr[0] = "Pramod";
			arr[1] = "mahesh";
			// System.out.println(arr[2].toUpperCase());
			Optional<String> ofNullable = Optional.ofNullable(arr[2]);
			if (ofNullable.isPresent()) {
				System.out.println("Data is present");
				System.out.println(ofNullable.get());
			} else {
				System.out.println("Data is empty");
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Throw().throwException();
	}

}
