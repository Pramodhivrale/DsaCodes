package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacter {
	public static void main(String[] args) {
		String name = "java is awesome";

        Map<String,Long> collect = Arrays.stream(name.split(""))
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(collect);
        
        String h="hello";
        Map<String,List<String>> collect2 = Arrays.stream(h.split(""))
              .collect(Collectors.groupingBy(s->s));
        System.out.println(collect2);
        
        Map<String,Long> collect3 = Arrays.stream(h.split(""))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect3);
        
        Map<String,Long> collect4 = h.chars().mapToObj(s->String.valueOf((char) s))
        .collect(Collectors.groupingByConcurrent(Function.identity(),Collectors.counting()));
        System.out.println(collect4);
	}

}
