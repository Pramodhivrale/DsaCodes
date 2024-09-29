package com.collection;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class LL_Day44 {
	public static void main(String[] args) {

		Node head = null;
		head = insert(head, 50);
		head = insert(head, 60);
		head = insert(head, 70);
		head = insert(head, 80);
		// print(head);
		// head=insertAtBegining(head,40);
		// head = insertAtPosition(head, 65, 3);
		head = deleteAtPosition(head, 1);
		print(head);
	}

	private static Node deleteAtPosition(Node head, int pos) {
		if (head == null) {
			return null;
		}
		// If the position is 1, delete the head
		if (pos == 1) {
			return head.next; // Return the new head (next node)
		}

		// Traverse to the node before the position to delete
		Node current = head;
		for (int i = 1; i < pos - 1; i++) {
			if (current == null || current.next == null) {
				System.out.println("Position out of bounds");
				return head; // If position is greater than the size of the list, return unchanged
			}
			current = current.next;
		}

		// Delete the node at the given position
		if (current.next != null) {
			current.next = current.next.next;
		}

		return head; // Return the unchanged head

	}

	private static Node insertAtPosition(Node head, int data, int pos) {
		Node newNode = new Node(data);
		if (pos == 1) {
			newNode.next = head;
			return newNode;
		}
		Node current = head;
		for (int i = 1; i < pos - 1; i++) {
			if (current == null) {
				System.out.println("Position out of bounds");
				return head; // Return the list unchanged
			}
			current = current.next;
		}
		// Insert the new node
		newNode.next = current.next;
		current.next = newNode;

		return head; // Return the unchanged head

	}

	// Inserting element ate the beginning of the node
	private static Node insertAtBegining(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		return newNode;

	}

	// Inserting element ate the end of the node
	private static Node insert(Node head, int data) {

		Node temp = new Node(data);
		// Now head is pointing to last node
		if (head == null)
			return temp;
		Node thead = head;
		while (head.next != null) {
			head = head.next;
		}
		head.next = temp;
		return thead;

	}

	private static void print(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}
