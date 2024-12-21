package com.data;

import java.util.Collections;
import java.util.List;

public class CollectionsFrequencyAndCopies 
{
	public static void main(String[] args) {
		
	
		List<String> nCopies = Collections.nCopies(10,"java" );
		nCopies.forEach(System.out::println);
		
		int frequency = Collections.frequency(nCopies, "java");
		System.out.println(frequency);
		
	}

}
