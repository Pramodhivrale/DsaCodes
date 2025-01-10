package com.revision;

import java.util.LinkedList;

public class CompareTwoLinkedListDay46 {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		boolean compareTwoLinkedList = compareTwoLinkedList(list1, list2);
		System.out.println(compareTwoLinkedList);
	}

	private static boolean compareTwoLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		if (list1.size() != list2.size()) {
			return false;
		}

		return list1.equals(list2);

	}

}
