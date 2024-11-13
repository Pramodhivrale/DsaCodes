package com.dsa1;

import java.util.LinkedList;

public class LinkedListAddition {
	Node head = null;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(3);
		l1.add(1);
		l1.add(4);

		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(9);
		l2.add(7);

		Node list1 = convertToNodeList(l1);
		Node list2 = convertToNodeList(l2);
		additionOFLinkedlIst(list1, list2);
	}

	private static void additionOFLinkedlIst(Node list1, Node list2) {
		Node h1 = reverse(list1);
		Node h2 = reverse(list2);

	}

	private static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
		}
		return prev;
	}

	private static Node convertToNodeList(LinkedList<Integer> list) {
		Node head = null;
		Node current = null;
		for (int num : list) {
			if (head == null) {
				head = new Node(num);
				current = head;
			} else {
				current.next = new Node(num);
				current = current.next;
			}

		}
		return head;

	}
	

}
