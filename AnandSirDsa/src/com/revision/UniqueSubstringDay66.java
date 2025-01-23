package com.revision;
//triee
public class UniqueSubstringDay66 {
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
	public static int countNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int count=0;
		for(int i=0;i<26;i++) {
			count=count+countNodes(root.children[i]);
		}
		return count+1;
	}
	public static void main(String[] args) {
		String str="ababa";
		
		for(int i=0;i<str.length();i++) {
			String suffix=str.substring(i);
			insert(suffix);
		}
		System.out.println(countNodes(root));
	}
}
