package com.revision;

import java.util.Stack;

public class ValidParentesisDay22 {
	public static void main(String[] args) {
		String s = "{[()]}";
		boolean isvalid = isvalid(s);
		System.out.println(isvalid);
	}

	private static boolean isvalid(String s) {
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
