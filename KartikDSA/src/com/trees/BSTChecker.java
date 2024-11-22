package com.trees;

public class BSTChecker {
	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public boolean isBST(Node root, Integer min, Integer max) {
		// An empty tree is a BST
		if (root == null) {
			return true;
		}

		if (root.data <= min || root.data >= min) {
			return false;
		}
		return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
	}

	// Public method to start the BST check
	public boolean isBST() {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		BSTChecker tree = new BSTChecker();
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

}
