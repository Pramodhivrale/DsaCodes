package com.data;

import java.util.Optional;

public class OptionalClassExample 
{
	public static void main(String[] args) {
		String name=null;
		
//		String upperCase = name.toUpperCase();
//		System.out.println(upperCase);// This will throw nullPointerException
		
		Optional<String> ofNullable = Optional.ofNullable(name);
		
		if(ofNullable.isPresent()) {
			System.out.println("Data is present");
		}
		if(ofNullable.isEmpty()) {
			System.out.println("data is null");
		}
		
		
	}

}
