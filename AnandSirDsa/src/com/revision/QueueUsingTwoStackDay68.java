package com.revision;

import java.util.Stack;

public class QueueUsingTwoStackDay68 {
	static class Queue {
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();

		public static boolean isEmpty() {
			return s1.isEmpty();
		}

		public void addData(int data) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		public static int remove() {
			if (isEmpty()) {
				return -1;
			}
			return s1.pop();
		}

		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return s1.peek();
		}
	}

	public static void main(String[] args) {
		Queue q1 = new Queue();
		q1.addData(10);
		q1.addData(20);
		q1.addData(30);
		q1.addData(40);
		q1.addData(50);
		q1.remove();

		while (!q1.isEmpty()) {
			System.out.println(q1.peek());
			q1.remove();
		}

	}

}
