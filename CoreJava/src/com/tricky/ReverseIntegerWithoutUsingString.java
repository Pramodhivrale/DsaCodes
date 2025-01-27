package com.tricky;

// Reverse a integer without String
// reverse=reverse * 10 + Single digit after % (This is formula)
public class ReverseIntegerWithoutUsingString {
	public static void main(String[] args) {
		int number = 12345;
        int reverse = 0;
		while (number > 0) {
			int digtit = number % 10;
			reverse = reverse * 10 + digtit;// append the temp to reverse number
			number = number / 10;
		}
		System.out.println(reverse);
	}

}
