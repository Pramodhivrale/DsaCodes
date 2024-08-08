package com.java8;

import java.util.stream.Stream;

public class ParrelStreamDemo 
{
	public static void main(String[] args) {
		
		// Single stream will process data
		System.out.println("Serial stream ================");
		Stream<Integer> ss = Stream.of(1,2,3,4,5,9);
		ss.forEach(s ->System.out.println(s+" "+Thread.currentThread()));
		
		// Multiple stream will process the data which will increase the performnce
		System.out.println("======== Parrelal stream==========");
		Stream<Integer> of = Stream.of(1,2,3,4,5,6);
		of.parallel().forEach(name -> System.out.println(name +" "+Thread.currentThread()));
		
	}

}
