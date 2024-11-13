package com.dsa1;

import com.dsa1.LinkedListAddition1.Node;

public class LinkedListAddition1 {
	Node head = null;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		int num1[] = {4};
		int num2[] = {6,0,0,0};
		Node h1 = createSinglyLinkedList(num1);
		Node h2 = createSinglyLinkedList(num2);
		Node result = addition(h1, h2);
		printList(result);

	}

	private static Node addition(Node h1, Node h2) {
		 h1 = reverse(h1);
		    h2 = reverse(h2);
		    int carry = 0;
		    Node resultHead = null;
		    Node resultTail = null;

		    while (h1 != null || h2 != null || carry != 0) {
		        int sum = (h1 != null ? h1.data : 0) + (h2 != null ? h2.data : 0) + carry;
		        carry = sum / 10;
		        Node newNode = new Node(sum % 10);

		        // Append to the result list
		        if (resultHead == null) {
		            resultHead = newNode;
		            resultTail = newNode;
		        } else {
		            resultTail.next = newNode;
		            resultTail = resultTail.next;
		        }

		        // Move to next nodes in h1 and h2 if available
		        h1 = (h1 != null) ? h1.next : null;
		        h2 = (h2 != null) ? h2.next : null;
		    }

		return reverse(resultHead);
	}
	private static void printList(Node head) {
	    while (head != null) {
	        System.out.print(head.data + " ");
	        head = head.next;
	    }
	    System.out.println();
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

	private static Node createSinglyLinkedList(int[] a) {
		Node head = new Node(a[0]);
		Node temp = head;
		int i = 1;
		while (i < a.length) {
			temp.next = new Node(a[i]);
			temp = temp.next;
			i++;
		}
		return head;

	}

}
