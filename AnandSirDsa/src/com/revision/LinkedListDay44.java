package com.revision;

public class LinkedListDay44 {

	static Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		LinkedListDay44 ll = new LinkedListDay44();

		ll.add(10);
		ll.add(20);
		ll.insertAtSpecificPosition(25, 2);
		ll.add(30);
		ll.add(50);
		ll.addFirst(5);
		// ll.deleteFirst();
		// ll.deleteLast();

		printLinkedList();
	}

	// Cyclic detection
	public void detectCycle() {
		Node here = head;
		Node turtle = head;

		
	}

	// Delete last element
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty nothing to delete here");
		}
		if (head.next == null) {
			head = null;
		}
		Node lastNode = head.next;
		Node secondLastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = null;

	}

	// delete first element for LinkedList
	public void deleteFirst() {

		if (head == null) {
			System.out.println("List is empty nothing to delete here");
		}
		head = head.next;
	}

	// Insert element at specific position
	public void insertAtSpecificPosition(int data, int position) {

		Node newNode = new Node(data);

		// Case 1: Insert at the head (position 0)
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		// Case 2: Traverse to find the position
		Node currentNode = head;
		for (int i = 0; i < position - 1; i++) {
			if (currentNode == null) {
				// If position is greater than the list size, break
				break;
			}
			currentNode = currentNode.next;
		}

		// Case 3: Insert the new node at the found position
		if (currentNode != null) {
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}

	// Add element at the first of linkedList
	public void addFirst(int data) {
		Node firstNode = new Node(data);

		if (head == null) {
			head = firstNode;
		}

		firstNode.next = head;
		head = firstNode;
	}

	// Print linked list
	private static void printLinkedList() {
		if (head == null) {
			System.out.println("List is empty");
		}
		while (head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}

	}

	// Adding element in linked list
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node curretnNode = head;
			while (curretnNode.next != null) {
				curretnNode = curretnNode.next;
			}
			curretnNode.next = newNode;

		}

	}
}
