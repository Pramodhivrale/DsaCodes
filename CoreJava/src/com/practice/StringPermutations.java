package com.practice;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	public static void main(String[] args) {
		String input = "abcde";
		List<String> permutations = new ArrayList<>();
		generatePermutations("", input, permutations);

		// Print the permutations
		for (String perm : permutations) {
			if (perm.startsWith("a")) {
				System.out.println(perm);
			}

		}
	}

	// Recursive method to generate permutations
	public static void generatePermutations(String prefix, String remaining, List<String> permutations) {
		if (remaining.isEmpty()) {
			permutations.add(prefix); // Add the permutation to the list
			return;
		}

		for (int i = 0; i < remaining.length(); i++) {
			// Form new prefix and remaining strings
			String newPrefix = prefix + remaining.charAt(i);
			String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

			// Recur with the new prefix and remaining
			generatePermutations(newPrefix, newRemaining, permutations);
		}
	}
}
