package com.collection;

class Node_1 {
	int data;
	Node_1 next;

	public Node_1(int data) {
		this.data = data;
		// this.next = null; // Initialize next to null

	}
}

public class CompareTwoLinkedList {
	public static void main(String[] args) {
		Node_1 head1 = null;
		Node_1 head2 = null;

		head1 = insert(head1, 10);
//		head1 = insert(head1, 20);
//		head1 = insert(head1, 30);
//		head1 = insert(head1, 40);

		head2 = insert(head2, 10);
//		head2 = insert(head2, 60);
//		head2 = insert(head2, 70);
//		head2 = insert(head2, 80);
		System.out.println("Head1 :");
		print(head1);
		System.out.println("Head2 :");
		print(head2);

		if (compareTwoLists(head1, head2)) {
			System.out.println("Both linked lists are equal.");
		} else {
			System.out.println("Both linked lists are not equal.");
		}

	}

	private static boolean compareTwoLists(Node_1 head1, Node_1 head2) {
		Node_1 temp1 = head1;
		Node_1 temp2 = head2;
		while (temp1 != null && temp2 != null) {
			if (temp1.data != temp2.data) {// If data is different, lists are not equal
				return false;
			}
			temp1 = temp1.next;// Move to the next node in list 1
			temp2 = temp2.next; // Move to the next node in list 2

		}
		// If both lists reach null at the same time, they are equal
		return temp1 == null && temp2 == null;
	}

	private static void print(Node_1 head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	private static Node_1 insert(Node_1 head, int data) {

		Node_1 temp = new Node_1(data);// Create new Node
		if (head == null) { // If the list is empty, the new node becomes the head
			return temp;
		}
		Node_1 current = head;
		while (current.next != null) { // Traverse to the end of the list
			current = current.next;
		}
		current.next = temp; // Append the new node at the end
		return head; // Return the head of the list

	}

}
