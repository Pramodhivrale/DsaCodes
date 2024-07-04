package com.java8;

import java.util.function.Supplier;

public class SupplierDemo 
{
	public static void main(String[] args) {
		
//		for(int i=0;i<=3;i++) {
//			String otp="";
//			otp=otp+Math.random();
//			return otp;
//			
//		}
		
		Supplier<String> s= () -> {
			
			String otp="";
			for(int i=0;i<=3;i++) {
				otp = otp + (int) (Math.random() * 10);
				
			}
			return otp;	
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
