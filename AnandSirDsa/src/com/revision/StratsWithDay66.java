package com.revision;

public class StratsWithDay66 {
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

	public static void insert(String key) {
		Node current = root;
		for (int i = 0; i < key.length(); i++) {
			int indx = key.charAt(i) - 'a';
			if (current.children[indx] == null) {
				current.children[indx] = new Node();
			}
			if (i == key.length() - 1) {
				current.children[indx].eow = true;
			}
			current = current.children[indx];
		}
	}

	public static boolean search(String prefix) {
		Node current = root;
		for (int i = 0; i < prefix.length(); i++) {
			int idx = prefix.charAt(i) - 'a';
			if (current.children[idx] == null) {
				return false;
			}
			current = current.children[idx];
		}
		return true;
	}
	public static void main(String[] args) {
		String []words= {"apple","app","mongo","man","women"};
		String prefix="app";
		for(int i=0;i<words.length;i++) {
			insert(words[i]);
		}
		boolean search = search(prefix);
		System.out.println(search);
	}

}
