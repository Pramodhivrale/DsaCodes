package com.java8;

import java.util.Optional;

public class OptionalClass 
{
	void meth1()
	{
		String arr[]=new String[5];
		arr[0]="pramod";
		arr[1]="mahesh";
		//System.out.println(arr[2].toUpperCase());
		
		Optional<String> ofNullable = Optional.ofNullable(arr[2]);
		//System.out.println(ofNullable);
		if(ofNullable.isPresent())
		{
			System.out.println("Data is present");
			System.out.println(ofNullable.get());
		}
		else if (ofNullable.isEmpty()) 
		{
			System.out.println("No data is present ");
			
		}
	}
	public static void main(String[] args) {
		new OptionalClass().meth1();
	}

}
