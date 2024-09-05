package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplIterator 
{
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Pramod","rutika","Siddhi","manju");
		
		Spliterator<String> spliterator = asList.stream().spliterator();
		spliterator.forEachRemaining(e ->System.out.println(e));
		
		Spliterator<String> spliterator2 = asList.stream().spliterator();
		int characteristics = spliterator2.characteristics();
		System.out.println(characteristics+" ");
	}

}
