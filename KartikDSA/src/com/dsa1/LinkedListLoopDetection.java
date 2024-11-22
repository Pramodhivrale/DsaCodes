package com.dsa1;

import java.util.HashSet;

//LOOP DETECTION AND REMOVEL USING HASHSET
public class LinkedListLoopDetection {
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
		if (head == null) {
			System.out.println("No loop detected (empty list).");
			return;
		}
		HashSet<Node> visitedNodes = new HashSet<>();

		Node current = head;
		Node prev = null;

		while (current != null) {
			if (visitedNodes.contains(current)) {
				prev.next = null;
				System.out.println("Loop removed at node with data: " + current.data);
				return;
			}
			visitedNodes.add(current);
			prev = current;
			current = current.next;
		}
		System.out.println("No loop detected");
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
