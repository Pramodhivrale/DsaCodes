package com.practice;

// Find the rottion of another String
public class RotationOfAnotherString {
	public static void main(String[] args) {
		String name1 = "ABCD";
		String name2 = "DCBA";

		if (checkRotation(name1, name2)) {
			System.out.println(name2 + " Is Rotation of :" + name1);
		} else {
			System.out.println(name2 + " Is not a Rotation of :" + name1);
		}
	}

	private static boolean checkRotation(String name1, String name2) {
		if (name1.length() != name2.length()) {
			return false;
		}
		String concated = name1 + name2;
		return concated.contains(name2);
	}

}
