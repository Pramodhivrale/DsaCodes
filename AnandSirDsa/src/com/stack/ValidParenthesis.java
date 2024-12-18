package com.stack;

import java.util.Stack;
// TIME COMPLEXITY O(n) AND SPACE COMPLEXITY O(n)
public class ValidParenthesis {
	public static void main(String[] args) {
		String s = "{[()]}";
		boolean valid = isValid(s);
		System.out.println("The string is valid: " + valid);
	}

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else if (c == '}' || c == ']' || c == ')') {
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();
				if ((c == '}' && top != '{') || (c == ']' && top != '[') || (c == ')' && top != '(')) {
				    return false;
				}

			}
		}
		return stack.isEmpty();

	}

}
