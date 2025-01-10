package com.data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiYellowCoder {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Kafka");
		list.sort(Comparator.comparing(String::length));
		list.forEach(abc -> System.out.println(abc + " "));

		Optional<String> of = Optional.of("java");
		of.ifPresent(s -> System.out.println("Value is present :" + s));

		// Predicate Example
		Predicate<String> isEmpty = s -> s.isEmpty();
		Predicate<String> empty = s -> s.isBlank();
		boolean test = empty.test("A");
		System.out.println(test);

		// Bi-Function example
		BiFunction<Integer, Integer, Integer> bi = (a, b) -> a + b;
		Integer apply = bi.apply(10, 11);
		System.out.println(apply);

		// Sorting using lambda
		List<String> listoffruits = Arrays.asList("Apple", "Banana", "Pear", "Grapes");
		listoffruits.sort(Comparator.comparing(String::length));
		listoffruits.forEach(System.out::println);

		// Custome Sorting Using Comparator
		listoffruits.sort((a, b) -> b.compareTo(a));
		listoffruits.forEach(System.out::println);

		// Distnict
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		// FindAny
		List<String> list1 = Arrays.asList("Java", "Spring", "Lambda");
		Optional<String> any = list1.stream().findAny();
		System.out.println(any.get());
		
		// Min-Integr
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		int orElse = numbers1.stream().mapToInt(Integer::intValue)
		                 .min()
		                 .orElse(0);
		System.out.println(orElse);
		
		
		//Lambda with Stream Collect to Set
		List<String> list2 = Arrays.asList("Java", "Spring", "Lambda", "Spring");
		Set<String> collect2 = list2.stream().collect(Collectors.toSet());
		collect2.forEach(System.out::println);
		
		//Lambda with Stream GroupingBy
		List<String> list3 = Arrays.asList("Java", "Spring", "Lambda", "Java");
		Map<String,Long> collect3 = list3.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		collect3.forEach((key,value)->System.out.println(key+" "+value));
		
		//Lambda with Stream PartitioningBy
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Map<Boolean,List<Integer>> collect4 = numbers2.stream().collect(Collectors.partitioningBy(num->num%2==0));
		collect4.forEach((key,value)->System.out.println(key+" "+value));
		
		List<Integer> numbers3 = Arrays.asList(1,0,0,0,1,1,0,1,0,1,0,1);
		Map<Boolean,List<Integer>> collect5 = numbers3.stream().collect(Collectors.partitioningBy(num->num==1));
		collect5.forEach((key,value)->System.out.println(key+" "+value));
		
		//Lambda with Stream ToMap 
		List<String> list4 = Arrays.asList("Java", "Spring", "Lambda");
		Map<String,Integer> collect6 = list4.stream().collect(Collectors.toMap(s->s, String::length));
		
		System.out.println("--------------------");
		//Peek
		Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
		List<String> collect7 = stream.peek(System.out::println).collect(Collectors.toList());
		collect7.forEach(abc->System.out.println(abc+" "));
		
		
		String[] array = {"Java", "Spring", "Lambda"};
		Arrays.sort(array, (a,b)->a.compareTo(b));
		System.out.println(Arrays.toString(array));
		
		 
		
		                 
		
		
	}

}
