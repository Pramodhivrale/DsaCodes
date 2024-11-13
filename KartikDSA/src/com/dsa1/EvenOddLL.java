package com.dsa1;

public class EvenOddLL {
	public static void main(String[] args) {
		int a[] = { 2, 5, 7, 8, 19, 1, 3, 6, 8 };
		Node head = createsingalyLL(a);
		Node result = seprateEvenOdd(head);
		while (result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}

	}

	private static Node seprateEvenOdd(Node head) {
		Node e = new Node(0);
		Node o = new Node(0);
		Node te = e;
		Node to = o;
		while (head != null) {
			if (head.data % 2 == 0) {
				te.next = head;
				te = te.next;
			} else {
				to.next = head;
				to = to.next;
			}
			head=head.next;
		}
		to.next=e.next;
		te.next=null;
		return o.next;
	}

	private static Node createsingalyLL(int[] a) {
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
	

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

}
