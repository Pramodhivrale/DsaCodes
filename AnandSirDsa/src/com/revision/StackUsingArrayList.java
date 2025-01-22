package com.revision;

import java.util.ArrayList;

public class StackUsingArrayList {
	static class Stack {
		static ArrayList<Integer> arr = new ArrayList<Integer>();

		public boolean isEmpty() {
			return arr.size() == 0;
		}

		public void push(int data) {
			arr.add(data);
		}

		public int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = arr.get(arr.size() - 1);
			arr.remove(arr.size() - 1);
			return top;
		}

		public int peek() {
			if (isEmpty()) {
				return -1;
			}
			return arr.get(arr.size() - 1);
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//s.pop();

		while (!s.isEmpty()) {
          System.out.println(s.peek());
          s.pop();
		}

	}

}
