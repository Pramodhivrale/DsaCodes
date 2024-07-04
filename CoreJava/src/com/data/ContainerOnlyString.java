package com.data;

//Program to check String contains only alphabets or not

public class ContainerOnlyString {
	public static void main(String[] args) {

		String line = "Pramodhivrale4";
		boolean meth1 = new ContainerOnlyString().meth1(line);
		System.out.println(meth1);

	}

	public boolean meth1(String line) {
		for (int i = 0; i <= line.length()-1; i++) {

			char c = line.charAt(i);
			if (!Character.isLetter(c)) {
				return false;
			}
			
		}
		return true;
	}
	
//	public static void main(String[] args) {
//		String regex = "^[a-zA-Z]+$";
//		
//		String input="pramod4";
//		
//		if(input.matches(regex)) {
//			System.out.println("String is pure alphabate");
//		}
//		else {
//			System.out.println("String contains other characters");
//		}
//	}
	
	

}
