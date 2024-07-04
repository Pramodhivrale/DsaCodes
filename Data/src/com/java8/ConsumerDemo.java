package com.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {

		Consumer<String> data = (name) -> System.out.println(name);

		data.accept("pramod");
		data.accept("Rutika");
		data.accept("Shivani");
		data.accept("Mahesh");
		data.accept("Akash");
        System.out.println();
		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50, 60);
		
		//asList.forEach(p-> System.out.print(p+" "));
		
		Iterator<Integer> iterator = asList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
	}

}
