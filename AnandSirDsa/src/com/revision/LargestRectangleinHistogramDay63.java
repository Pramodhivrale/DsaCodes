package com.revision;

import java.util.Stack;

public class LargestRectangleinHistogramDay63 {
	public static void main(String[] args) {
		int[] histogram = { 2, 1, 5, 6, 2, 3 };
		System.out.println("Largest Rectangle Area: " + largestRectangleArea(histogram));
	}

	public static int largestRectangleArea(int[] histogram) {
		int maxArea = 0;
		int[] prevSmaller = getPrevSmallerIndices(histogram);
		int[] nextSmaller = getNextSmallerIndices(histogram);

		for (int i = 0; i < histogram.length; i++) {
			int widht = (nextSmaller[i] - prevSmaller[i] - 1)*histogram[i];
			//int area = widht * histogram[i];
			maxArea = Math.max(maxArea, widht);
		}
		return maxArea;
	}

	public static int[] getNextSmallerIndices(int[] histogram) {
		int result[] = new int[histogram.length];
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = histogram.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && histogram[i] <= histogram[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				result[i] = histogram.length;
			} else {
				result[i] = stack.peek();
			}
			stack.push(i);
		}
		return result;

	}

	public static int[] getPrevSmallerIndices(int[] histogram) {
		int result[] = new int[histogram.length];
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < histogram.length; i++) {
			while (!stack.isEmpty() && histogram[i] <= histogram[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				result[i] = histogram.length;
			} else {
				result[i] = stack.peek();
			}
			stack.push(i);
		}
		return result;

	}

}
