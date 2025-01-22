package com.revision;

import java.util.LinkedList;
import java.util.Queue;

public class StachUsingQueueDay64 {
	static class StackQueue {
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();

		public boolean isEmpty() {
			return q1.isEmpty();
		}

		public void push(int data) {
			q2.offer(data);

			// Push all elements of q1 to q2
			while (!q1.isEmpty()) {
				q2.offer(q1.poll());
			}

			// Swap the names of q1 and q2
			Queue<Integer> temp = q1;
			q1 = q2;
			q2 = temp;
		}

		public int pop() {
			if (q1.isEmpty()) {
				throw new IllegalStateException("Stack is empty");
			}
			return q1.poll(); // Dequeue from q1 which has the top element of the stack
		}

		public int peek() {
			if (q1.isEmpty()) {
				throw new IllegalStateException("Stack is empty");
			}
			return q1.peek(); // Peek the front of q1
		}
	}

	public static void main(String[] args) {
		StackQueue stack = new StackQueue();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Top element: " + stack.peek()); // 40
		System.out.println("Popped element: " + stack.pop()); // 40
		System.out.println("Popped element: " + stack.pop()); // 30
		System.out.println("Top element after popping: " + stack.peek()); // 20

	}
}
