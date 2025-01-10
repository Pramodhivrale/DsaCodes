package com.revision;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

}

public class LinkedListMargePointDay_44 {

	// Node head = null;

	public static void main(String[] args) {

		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(7);
		head1.next.next.next.next = new Node(8);
		head1.next.next.next.next.next = new Node(9);

		Node head2 = new Node(4);
		head2.next = new Node(5);
		head2.next.next = head1.next.next.next; // Merge at node with value 7

		Node margePoint = findMargePoint(head1, head2);
		System.out.println(margePoint.data);
	}

	private static Node findMargePoint(Node head1, Node head2) {

		if (head1 == null && head2 == null) {
			return null;
		}

		Node pointer1 = head1;
		Node pointer2 = head2;

		while (pointer1 != pointer2) {
			if (pointer1 == null) {
				pointer1 = head2;
			} else {
				pointer1 = pointer1.next;
			}
			if (pointer2 == null) {
				pointer2 = head1;
			} else {
				pointer2 = pointer2.next;
			}
		}
		return pointer1;
	}
}
