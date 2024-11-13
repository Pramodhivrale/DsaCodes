package com.collection;

public class QueueImplements_Array {
	static class Queue {

		static int arr[];
		static int size;
		static int rear = -1;

		public Queue(int size) {
			arr = new int[size];
			this.size = size;
		}

		public static boolean isEmpty() {
			return rear == -1;
		}

		// Enqueue == add
		public static void addData(int data) {
			if (rear == size - 1) {
				System.out.println("Queue is full");
				return;
			}
			rear++;
			arr[rear] = data;
		}

		// Dequeue == remove
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
			return front;
		}

		// Peak
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[0];

		}

	}

	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.addData(1);
		q.addData(2);
		q.addData(3);
		
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
	}
}
