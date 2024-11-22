package com.dsa1;

import java.text.BreakIterator;

//LOOP DETECTION IN LINKEDLIST AND REMOVEL USING SLOW AND FAST POINTER
public class LinkedListLoopDetection1 {

	Node head = null;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void addLast(int data) {
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

	public void removeLoop() {
		if (head == null && head.next == null) {
			return;
		}

		Node slow = head;
		Node fast = head;
		boolean hasLoop = false;

		while (fast != head && fast != fast.next) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				hasLoop = true;
				break;
			}
		}
		// If loop detected
		if (hasLoop) {
			slow = head;
			Node prev = null;

			// Find the start of the loop
			while (slow != fast) {
				prev = fast;
				slow = slow.next;
				fast = fast.next;
			}

			// Remove the loop by setting the `next` of the last node in the loop to `null`
			prev.next = null;
			System.out.println("Loop removed at node with data: " + slow.data);
		} else {
			System.out.println("No loop detected.");
		}
	}

	public static void main(String[] args) {
		LinkedListLoopDetection ll = new LinkedListLoopDetection();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);

		// Creating a self-loop manually for testing
		ll.head.next.next.next = ll.head.next;

		ll.removeLoop();

	}

}
