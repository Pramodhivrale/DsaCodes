package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practicess 
{
	public static void main(String[] args) {
		int arr[]= {5,6,8,10,6,16};
		
		Integer integer = Arrays.stream(arr)
		      .boxed().sorted(Comparator.reverseOrder())
		      .findFirst().get();
		System.out.println(integer);
		
		Optional<Integer> first = Arrays.stream(arr).boxed()
		      .sorted(Comparator.reverseOrder()).skip(1)
		      .findFirst();
		System.out.println(first.get());
	}

}
