package com.dsa1;

public class PalindromicLinkedList {
	Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// ADD DATA INN LINKED LIST
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// Print list
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("NULL");
	}

	// MIDDLE OF LINKED LIST
	public Node middle(Node head) {
		Node turtle = head;
		Node here = head;
		while (here.next != null && turtle.next.next != null) {
			here = here.next.next;
			turtle = turtle.next;
		}
		return turtle;
	}

	// boolean is palindrome
	public boolean isPalindrome(Node head) {
		if (head == null || head.next == null) {
			return true;
		}
		Node mid = middle(head);
		Node secondHalfStart = reversePalindrome(mid.next);

		Node firstHalfStart = head;
		while (secondHalfStart != null) {
			if (firstHalfStart.data != secondHalfStart.data) {
				return false;
			}
			firstHalfStart = firstHalfStart.next;
			secondHalfStart = secondHalfStart.next;
		}

		return true;

	}

	private Node reversePalindrome(Node head) {
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

	public static void main(String[] args) {
		PalindromicLinkedList p1 = new PalindromicLinkedList();
		p1.addFirst(1);
		p1.addFirst(2);
		p1.addFirst(3);
		p1.addFirst(2);
		p1.addFirst(1);
		p1.print();

		if (p1.isPalindrome(p1.head)) {
			System.out.println("The linked list is a palindrome.");
		} else {
			System.out.println("The linked list is not a palindrome.");
		}

	}

}
