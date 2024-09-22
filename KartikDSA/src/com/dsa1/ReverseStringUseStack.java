package com.dsa1;

// REVERSED STRING OF ARRAY USING STACK

import java.util.Stack;

public class ReverseStringUseStack {

	public void reverserUsingStack() {
		String arr[] = { "JAVA", "C++", "PYTHON" };
		Stack<String> s = new Stack<String>();

		for (int i = 0; i < arr.length; i++) {
			s.push(arr[i]);
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	
	public void reverse() {
		String arr[] = { "JAVA", "C++", "PYTHON" };
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {

		
		ReverseStringUseStack r=new ReverseStringUseStack();
		//r.reverserUsingStack();
		r.reverse();
		
	}

}
