package com.java8;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 
{
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Akash","Pramod","Ak","Shravn");
		
        asList.stream().filter(name -> name.startsWith("A"))
                       .map(n -> n.length()).forEach(i-> System.out.println(i));
		
	}

}
