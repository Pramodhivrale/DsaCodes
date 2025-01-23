package com.revision;

public class WordBreakProblemDay66 {
	static class Node {
		Node[] children;
		boolean eow;

		public Node() {
			children = new Node[26];
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
			eow = false;
		}
	}

	static Node root = new Node();

	public static void insert(String word) {
		Node current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';

			if (current.children[index] == null) {
				current.children[index] = new Node();
			}
			if (i == word.length() - 1) {
				current.children[index].eow = true;
			}
			current = current.children[index];
		}
	}

	public static boolean search(String key) {
		Node current = root;
		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i) - 'a';

			if (current.children[index] == null) {
				return false;
			}
			if (i == key.length() - 1 && current.children[index].eow == false) {
				return false;
			}
			current = current.children[index];
		}
		return true;
	}

	public static boolean wordBreak(String key) {
		if (key.length() == 0) {
			return true;
		}
		for (int i = 1; i <= key.length(); i++) {
			String firstpart = key.substring(0, i);
			String secondPart = key.substring(i);
			if (search(firstpart) && wordBreak(secondPart)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String words[] = { "i", "like", "sam", "samsung", "mobile" };
		String key = "ilikesamsung";
		
		for(int i=0;i<words.length;i++) {
			insert(words[i]);
		}
		boolean wordBreak = wordBreak(key);
		System.out.println(wordBreak);
	}
}
