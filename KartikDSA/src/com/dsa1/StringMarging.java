package com.dsa1;

import java.util.Arrays;
import java.util.List;

public class StringMarging {
	public static void main(String[] args) {

		List<String> asList = Arrays.asList("ASHOK", "IT", "AS", "HOK", "I", "T", "A", "SHO", "K", "S", "H", "O");
        //List<String> asList = Arrays.asList("S","H","A","K","O","IT");
		String s = "ASHOKIT";

		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i <= asList.size() - 1; i++) {
			String string = asList.get(i);
			stringbuilder = stringbuilder.append(string);
			if (stringbuilder.toString().equals(s)) {
				System.out.println("Found");
				break;
			}
			if (stringbuilder.length() > s.length()) {
				stringbuilder.setLength(0); // Reset StringBuilder
			}
		}

	}

}
