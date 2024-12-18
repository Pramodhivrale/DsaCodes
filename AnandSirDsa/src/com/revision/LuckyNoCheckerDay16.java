package com.revision;

public class LuckyNoCheckerDay16 {
	public static void main(String[] args) {
		int num = 432;
		if (checkluckynumber(num)) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}

	private static boolean checkluckynumber(int num) {
		String valueOf = String.valueOf(num);
		for (char ch : valueOf.toCharArray()) {
			if (ch != '4' || ch != '7') {
				return false;
			}
		}
		return true;

	}

}
