package com.collection;

public class QueueImlements_CircularArray {
	static class Queue {

		static int arr[];
		static int size;
		static int rear = -1;
		static int front = -1;

		public Queue(int size) {
			arr = new int[size];
			this.size = size;
		}

		public static boolean isEmpty() {
			return rear == -1 && front == -1;
		}

		public static boolean isFull() {
			return (rear + 1) % size == front;
		}

		// Enqueue
		public static void addData(int data) {
			if (isFull()) {
				System.out.println("Queue is full");
				return;
			}
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			arr[rear] = data;
		}

		// Dequeue / remove
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int result = arr[front];
			// Single element condition
			if (rear == front) {
				rear = front = -1;
			} else {
				front = (front + 1) % size;
			}
			return result;
		}

		// Peak
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[front];

		}

	}

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.addData(1);
		q.addData(2);
		q.addData(3);
		q.addData(4);
		q.addData(5);
		System.out.println(q.remove());
		q.addData(6);
		System.out.println(q.remove());
		q.addData(7);

		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
