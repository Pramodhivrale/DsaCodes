package com.collection;

class Nodee {
	int data;
	Nodee next;
	
	public Nodee(int data) {
		this.data = data;
		this.next = null; // next will point to null when a new node is created
	}
}

public class A {
	public static void main(String[] args) {
		// Create initial linked list
		Nodee head = new Nodee(10);
		head.next = new Nodee(20);
		head.next.next = new Nodee(30);
		head.next.next.next = new Nodee(40);

		System.out.println("Linked List before adding a new element:");
		print(head);

		// Add a new element (50) at the end of the linked list
		head = addAtEnd(head, 50);

		System.out.println("Linked List after adding 50 at the end:");
		print(head);
	}

	// Method to add a new node at the end of the linked list
	private static Nodee addAtEnd(Nodee head, int data) {
		// Create a new node with the given data
		Nodee newNode = new Nodee(data);
		
		// If the list is empty, the new node becomes the head
		if (head == null) {
			return newNode;
		}

		// Traverse to the last node of the list
		Nodee current = head;
		while (current.next != null) {
			current = current.next;
		}

		// Link the new node to the last node
		current.next = newNode;
		
		// Return the head (unchanged)
		return head;
	}

	// Method to print the linked list
	private static void print(Nodee head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}

