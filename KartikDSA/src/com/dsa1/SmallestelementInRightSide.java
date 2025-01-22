package com.dsa1;

import java.util.Stack;

public class SmallestelementInRightSide {
	public static void main(String[] args) {
		int arr[] = { 10, 3, 15, 25, 9, 12, 17, 2, 5, 9, 4, 8 };

		Stack<Integer> stack = new Stack<>();

		int[] result = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
              stack.pop();
			}
			
			if(stack.isEmpty()) {
				result[i]=-1;
			}else {
				result[i]=stack.peek();
			}
			
			stack.push(arr[i]);
		}
		
		for(int res:result) {
			System.out.println(res);
		}
	}

}
