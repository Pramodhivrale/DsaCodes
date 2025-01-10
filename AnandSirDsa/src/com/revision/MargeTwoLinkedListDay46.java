package com.revision;

import java.util.LinkedList;

public class MargeTwoLinkedListDay46 {
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

		LinkedList<Integer> margeTwoLinkedList = margeTwoLinkedList(l1, l2);
		System.out.println(margeTwoLinkedList);
	}

	private static LinkedList<Integer> margeTwoLinkedList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> margedList = new LinkedList<Integer>();

		int p1 = 0;
		int p2 = 0;
		while (p1 < l1.size() && p2 < l2.size()) {
			if (l1.get(p1) < l2.get(p2)) {
				margedList.add(l1.get(p1));
				p1++;
			} else {
				margedList.add(l2.get(p2));
				p2++;
			}
		}
		while (p1 < l1.size()) {
			margedList.add(l1.get(p1));
			p1++;
		}
		while (p2 < l2.size()) {
			margedList.add(l2.get(p2));
			p2++;
		}
		
		return margedList;

	}

}
