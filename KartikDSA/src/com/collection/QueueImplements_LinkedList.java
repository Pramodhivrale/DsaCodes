package com.collection;


public class QueueImplements_LinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static class Queue {

		static Node head = null;
		static Node tail = null;

		public static boolean isEmpty() {
			return head == null && tail == null;
		}

		// Enqueue
		public static void addData(int data) {

			Node newNode = new Node(data);
			if (tail == null) {
				tail = head = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}

		// Dequeue / remove
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int front = head.data;
			if (head == tail) {
				tail = null;
			}
			head = head.next;
			return front;
		}

		// Peak
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return head.data;

		}

	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.addData(1);
		q.addData(2);
		q.addData(3);
		q.addData(4);
		q.addData(5);

		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
