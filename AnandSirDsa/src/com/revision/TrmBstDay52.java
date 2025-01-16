package com.revision;

public class TrmBstDay52 {
	static class NodeTree {
		int data;
		NodeTree left, right;

		public NodeTree(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		NodeTree root = new NodeTree(50);
		root.left = new NodeTree(30);
		root.right = new NodeTree(70);
		root.left.left = new NodeTree(20);
		root.left.right = new NodeTree(40);
		root.right.left = new NodeTree(60);
		root.right.right = new NodeTree(80);

		System.out.println("In-order traversal before trimming:");
		printInOrder(root);

		int lower = 30, upper = 70;
		root = trimBST(root, lower, upper);

		System.out.println("\nIn-order traversal after trimming:");
		printInOrder(root);
	}

	public static NodeTree trimBST(NodeTree root, int low, int upper) {
		if (root == null) {
			return null;
		}
		// If the current node's data is less than low, discard the left subtree and
		// recursively trim the right
		if (root.data < low) {
			return trimBST(root.right, low, upper);
		}
		// If the current node's data is greater than high, discard the right subtree
		// and recursively trim the left
		if (root.data > upper) {
			return trimBST(root.left, low, upper);
		}
		// If the current node's data is within the range, recursively trim both left
		// and right subtrees
		root.left = trimBST(root.left, low, upper);
		root.right = trimBST(root.right, low, upper);
		return root;
	}

	public static void printInOrder(NodeTree root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.print(root.data + " ");
			printInOrder(root.right);
		}
	}
}
