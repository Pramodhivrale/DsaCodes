package com.dsa1;

import java.util.Arrays;
import java.util.List;

public class StringMarging2 {
	public static void main(String[] args) {
		 List<String> asList = Arrays.asList("ASHOK", "IT", "AS", "HOK", "I", "T",
		 "A", "SHO", "K", "S", "H", "O");
		//List<String> asList = Arrays.asList("S", "H", "A", "K", "O", "IT");
		String s = "ASHOKIT";

		boolean result = solve(asList, s, 0);
		System.out.println("Can the string be formed? " + result);
	}

	private static boolean solve(List<String> asList, String s, int i) {
		int n = s.length();
		if (i == n) {
			return true; // Successfully reached the end of the string
		}

		for (int j = i + 1; j <= n; j++) { // j should go from i+1 to n
			String substring = s.substring(i, j); // Get the substring from i to j
			if (asList.contains(substring)) {
				if (solve(asList, s, j)) { // Move to the next index after the current substring
					return true;
				}
			}
		}
		return false; // No valid concatenation found
	}
}
