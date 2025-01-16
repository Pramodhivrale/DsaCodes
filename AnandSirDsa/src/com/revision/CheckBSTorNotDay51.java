package com.revision;

public class CheckBSTorNotDay51 {
	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		CheckBSTorNotDay51 tree = new CheckBSTorNotDay51();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(7);

		// Check if the tree is a BST
		if (tree.isBST()) {
			System.out.println("The tree is a Binary Search Tree (BST).");
		} else {
			System.out.println("The tree is NOT a Binary Search Tree (BST).");
		}
	}

	public boolean isBST() {
		return isBstCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBstCheck(Node root, int minValue, int maxValue) {
        if(root==null) {
        	return true;
        }
        if (root.data <= minValue || root.data >= minValue) {
			return false;
		}
		return isBstCheck(root.left, minValue, root.data)&& isBstCheck(root.right, root.data, maxValue);
	}

}
