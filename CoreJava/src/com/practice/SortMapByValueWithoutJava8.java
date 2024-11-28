package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValueWithoutJava8 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 3);
		map.put("Bob", 5);
		map.put("Charlie", 1);
		map.put("Jhon", 0);
		map.put("Rock", 2);

		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		list.forEach(data -> System.out.println(data + " "));

	}
}
