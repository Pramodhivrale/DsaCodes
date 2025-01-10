package com.data;

public class StringRotation {
	public static void main(String[] args) {
		String str1 = "hello";

		String str2 = "lohel";

		if(checkRotation(str1, str2)) {
			System.out.println("str1 is rotation of str2");
		}else {
			System.out.println("Not rotation string");
		}
	}

	private static boolean checkRotation(String str1, String str2) {
        if(str1.length() != str2.length()) {
        	return false;
        }
        String concated=str1+str2;
        return concated.contains(str2);
	}

}
