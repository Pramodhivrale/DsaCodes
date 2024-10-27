package com.stack;

import java.util.Stack;

public class SmallestElementInRight {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		int[] result = findSmallestElementsToRight(arr);
		
		for(int r:result) {
			System.out.println(r +" ");
		}
	}

	private static int[] findSmallestElementsToRight(int[] arr) {
		int n=arr.length;
		int result[]=new int[n];
		
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=n-1;i>=0;i--) {
			// Remove elements from the stack that are not smaller than the current element
			while(!stack.isEmpty() && stack.peek() >= arr[i] ) {
				stack.pop();
			}
			// If the stack is empty, it means there's no smaller element to the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            
         // Push the current element onto the stack
            stack.push(arr[i]);
		}
		return result;
	}

}
