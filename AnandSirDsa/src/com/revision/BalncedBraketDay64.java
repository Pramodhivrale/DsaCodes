package com.revision;

import java.util.Stack;

public class BalncedBraketDay64 {
	public static void main(String[] args) {
		String expression = "{[()]}";

		balancedBraket(expression);
	}

	public static boolean balancedBraket(String expression) {
		Stack<Character> stack = new Stack<Character>();

		for (char data : expression.toCharArray()) {
			if (data == '{' || data == '[' || data == '(') {
				stack.push(data);
			} else if (data == ')' || data == ']' || data == '}') {
				// if there is no opening breaket then stack will empty and we return false
				// because we dont have closing breaket to compare
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();
				if (data == ')' && top != '(' || data == ']' && top != '[' || data == '}' && top != '{') {
					System.out.println("Expression is not balanced.");
					return false;
				}

			}
		}
		if (stack.isEmpty()) {
			System.out.println("Expression is balanced.");
			return true;
		} else {
			System.out.println("Expression is not balanced.");
			return false;
		}

	}

}
