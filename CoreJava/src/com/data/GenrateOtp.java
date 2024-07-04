package com.data;

import java.util.Random;

public class GenrateOtp {
//	public static void main(String[] args) {
//
//		int otplenght = 6;
//		genrateOtp(otplenght);
//	}
//
//	private static void genrateOtp(int otplenght) {
//		String characters = "0123456789";
//		Random random = new Random();
//		StringBuilder stringBuilder = new StringBuilder(otplenght);
//
//		for (int i = 0; i < otplenght; i++) {
//			int nextInt = random.nextInt(characters.length());
//			// otp.append(characters.charAt(index));
//			stringBuilder.append(characters.charAt(nextInt));
//
//		}
//		System.out.println(stringBuilder.toString());
//
//	}
	
	public static void main(String[] args) {
		
		String character="0123456789";
		
		StringBuilder otp=new StringBuilder();
		
		Random random=new Random();
		
		for(int i=1;i<=6;i++) {
			int nextInt = random.nextInt(character.length());
			otp.append(character.charAt(nextInt));
		}
		System.out.println("OTP :"+otp);
	}

}
