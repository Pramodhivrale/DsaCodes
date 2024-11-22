package com.trees;

public class MirrorOfTree {
	Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int value) {
			this.data = value;
			this.left = right = null;
		}
	}

	public static void mirrorOfTree(Node root) {
		if (root == null) {
			return;
		}

		Node temp = root.left;
		root.left = root.right;
		root.right = temp;

		mirrorOfTree(root.left);
		mirrorOfTree(root.right);
	}

	public static void printInorder(Node node) {
		if (node == null) {
			return;
		}
		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);
	}

	public static void main(String[] args) {
		MirrorOfTree tree = new MirrorOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Original In-Order Traversal:");
		printInorder(tree.root);

		// Call the mirror function
		mirrorOfTree(tree.root);

		System.out.println("\nMirrored In-Order Traversal:");
		printInorder(tree.root);
	}

}
