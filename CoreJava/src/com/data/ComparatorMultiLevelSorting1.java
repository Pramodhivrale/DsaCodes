package com.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMultiLevelSorting1 {
	int price;
	String name;

	public ComparatorMultiLevelSorting1(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Sorting {

	public static void main(String[] args) {
		ComparatorMultiLevelSorting1 item1 = new ComparatorMultiLevelSorting1(2000, "Pramod");
		ComparatorMultiLevelSorting1 item2 = new ComparatorMultiLevelSorting1(1500, "Alice");
		ComparatorMultiLevelSorting1 item3 = new ComparatorMultiLevelSorting1(3000, "Bob");
		ComparatorMultiLevelSorting1 item4 = new ComparatorMultiLevelSorting1(2500, "Charlie");

		List<ComparatorMultiLevelSorting1> asList = Arrays.asList(item1, item2, item3, item4);

		Comparator<ComparatorMultiLevelSorting1> priceThenNameComparator = Comparator
				.comparingInt(ComparatorMultiLevelSorting1::getPrice) // Sort by price
				.thenComparing(ComparatorMultiLevelSorting1::getName); // Then sort

		Collections.sort(asList, priceThenNameComparator);

	}
}
