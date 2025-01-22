package com.revision;

import java.util.ArrayList;
import java.util.EmptyStackException;

// Stack Implementation using dynamic list
public class StackUsingDynamicListDay64 {
	static class DynamicStack<T> {
		ArrayList<T> list;

		public DynamicStack() {
			list = new ArrayList<>();
		}

		public boolean isEmpty() {
			return list.isEmpty();
		}

		public void push(T data) {
			list.add(data);
		}

		public T peek() {
			if (isEmpty()) {
				throw new EmptyStackException();
			}
			return list.get(list.size() - 1);
		}

		public T pop() {
			if (isEmpty()) {
				throw new EmptyStackException();
			}
			return list.remove(list.size() - 1);
		}

		public int size() {
			return list.size();
		}
	}

	public static void main(String[] args) {
		DynamicStack<Integer> d = new DynamicStack<Integer>();
		d.push(10);
		d.push(20);
		d.push(30);
		d.push(40);
		d.push(50);
		
		DynamicStack<String> s=new DynamicStack<String>();
		s.push("Sanavi");
		s.push("Ritesh");
		
		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

		while (!d.isEmpty()) {
			System.out.println(d.peek());
			d.pop();
		}

	}

}
