package com.practice;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations1 {
	public static void main(String[] args) {
		String input = "abcde";
		List<String> permutations = new ArrayList<String>();
		genratePermutations("", input, permutations);
		
		for(String data:permutations) {
			System.out.println(data+" ");
		}
	}

	private static void genratePermutations(String prefix, String input, List<String> permutations) {
		if (input.isEmpty()) {
			permutations.add(prefix);
			return;
		}
		for (int i = 0; i < input.length(); i++) {
            String newPrefix=prefix+input.charAt(i);
            String newInput=input.substring(0, i)+input.substring(i+1);
            genratePermutations(newPrefix, newInput, permutations);
		}

	}
}
