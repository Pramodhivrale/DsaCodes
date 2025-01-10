package com.data;

import java.util.Arrays;

public class AngramString {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		boolean checkAngram = checkAngram(s1, s2);
		if(checkAngram) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

	private static boolean checkAngram(String s1, String s2) {
       String lowerCase = s1.toLowerCase();
       String lowerCase2 = s2.toLowerCase();
       
       char[] charArray = lowerCase.toCharArray();
       char[] charArray2 = lowerCase2.toCharArray();
       
       Arrays.sort(charArray);
       Arrays.sort(charArray2);
       
       return Arrays.equals(charArray, charArray2);
       
	}
}
