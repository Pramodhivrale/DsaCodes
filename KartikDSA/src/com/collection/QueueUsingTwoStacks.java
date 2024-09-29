package com.collection;

import java.util.Stack;

public class QueueUsingTwoStacks 
{
	static class Queue{
		static Stack<Integer> s1=new Stack<Integer>();
		static Stack<Integer> s2=new Stack<Integer>(); 
		
		public static boolean isEmpty() {
			return s1.isEmpty();
		}
		public static void addData(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		public static int remove() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			return s1.pop();
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			return s1.peek();
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
