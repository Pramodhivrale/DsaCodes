package com.java8;

import java.util.stream.IntStream;

public class InRage 
{
	public static void main(String[] args) {
		
		IntStream.range(1, 100).forEach(num -> System.out.print(num+" "));
	}

}
