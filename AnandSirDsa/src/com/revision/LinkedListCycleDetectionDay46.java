package com.revision;

public class LinkedListCycleDetectionDay46 {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;

	public static void main(String[] args) {
		LinkedListCycleDetectionDay46 ll = new LinkedListCycleDetectionDay46();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.print();
		ll.createCycle();
		boolean detectCycle = ll.detectCycle();
		System.out.println(detectCycle);
	}

	private void createCycle() {
		if (head == null) {
			return;
		}

		Node currentNode = head;
		Node secondNode = head.next;

		// Traverse to the last node
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		// Connect the last node to the second node to create a cycle
		currentNode.next = secondNode;
	}

	public boolean detectCycle() {
		Node hare = head;
		Node turtle = head;

		while (hare != null && hare.next != null) {
			hare = hare.next.next;
			turtle = turtle.next;

			if (hare == turtle) {
				return true;
			}
		}

		return false;

	}

	private void print() {
		if (head == null) {
			System.out.println("Linked list is empty");
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data + " ");
			currentNode = currentNode.next;
		}

	}

	private void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;

	}
}
