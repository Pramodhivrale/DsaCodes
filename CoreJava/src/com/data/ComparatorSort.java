package com.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class ComparatorExapmle {
	String firstname;
	String lastname;

	public ComparatorExapmle(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "ComparatorExapmle [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}

public class ComparatorSort {
	public static void meth1() {
		ComparatorExapmle obj1 = new ComparatorExapmle("Sachin", "Tendulkar");
		ComparatorExapmle obj2 = new ComparatorExapmle("Gautam", "Ghambir");
		ComparatorExapmle obj3 = new ComparatorExapmle("Ricky", "Pointing");
		ComparatorExapmle obj4 = new ComparatorExapmle("MS", "Dhoni");

		List<ComparatorExapmle> asList = Arrays.asList(obj1, obj2, obj3, obj4);

		Collections.sort(asList, new Comparator<ComparatorExapmle>() {

			@Override
			public int compare(ComparatorExapmle o1, ComparatorExapmle o2) {
				return o1.getLastname().compareTo(o2.getLastname());
			}

		});

		Iterator<ComparatorExapmle> iterator = asList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

	public static void main(String[] args) {
		ComparatorSort.meth1();
	}

}
