package com.java8;

import java.util.function.Supplier;

public class SupplierDemo 
{
	public static void main(String[] args) {

		Supplier<String> s=() -> {
			
			String otp="";
			for(int i=1;i<=6;i++) {
				otp = otp +(int) (Math.random() * 10);
			}
			return otp;
			
		};
		
		String string = s.get();
		System.out.println(string);
		
	}

}
