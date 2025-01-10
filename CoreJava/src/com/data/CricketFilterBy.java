package com.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Names {
	String name;
	String lastName;

	public Names(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Names [name=" + name + ", lastName=" + lastName + "]";
	}

}

public class CricketFilterBy {
	public static void main(String[] args) {
		Names n1 = new Names("Sachin ", "Tendulakar");
		Names n2 = new Names("Gutham ", "Ganbhir");
		Names n3 = new Names("Ms ", "Dhoni");
		Names n7 = new Names("Virat ", "Kohali");
		Names n4 = new Names("Rohit ", "Shrma");
		Names n5 = new Names("Varun ", "Dhavan");
		Names n6 = new Names("jasprit ", "Bumhara");

		List<Names> asList = Arrays.asList(n1, n2, n3, n4, n5, n6, n7);

		Collections.sort(asList, Comparator.comparing(Names::getLastName));
		asList.forEach(System.out::println);

		List.of("Sachin Tendulkar", "Gautam Gambhir", "MS Dhoni").stream()
				.sorted(Comparator.comparing(player -> player.substring(player.lastIndexOf(' ') + 1)))
				.forEach(System.out::println);

	}

}
