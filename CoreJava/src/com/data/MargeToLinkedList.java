package com.data;

import java.util.LinkedList;

public class MargeToLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(-3);
		l1.add(5);
		l1.add(8);
		l1.add(20);
		l1.add(25);

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(-1);
		l2.add(2);
		l2.add(7);
		l2.add(4);
		l2.add(11);
		l2.add(13);
		l2.add(16);
		l2.add(18);

		LinkedList<Integer> margeTwolinkedlist = margeTwolinkedlist(l1, l2);
		System.out.println(margeTwolinkedlist);

	}

	private static LinkedList<Integer> margeTwolinkedlist(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> margedLinkedList = new LinkedList<Integer>();
		int i = 0;
		int j = 0;
		while (i < l1.size() && j < l2.size()) {
			if (l1.get(i) < l2.get(j)) {
				margedLinkedList.add(l1.get(i));
				i++;
			} else {
				margedLinkedList.add(l2.get(j));
				j++;
			}
		}

		// Add remaining elements from l1
		while (i < l1.size()) {
			margedLinkedList.add(l1.get(i));
			i++;
		}

		// Add remaining elements from l2
		while (j < l2.size()) {
			margedLinkedList.add(l2.get(j));
			j++;
		}
		return margedLinkedList;
	}

}
