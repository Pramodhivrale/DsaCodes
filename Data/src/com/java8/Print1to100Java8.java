package com.java8;

import java.util.stream.IntStream;

public class Print1to100Java8 
{
	public static void main(String[] args) {
		
		IntStream.range(1, 100).forEach(number->System.out.println(number+" "));
	
	}

}
