package com.revision;

public class DeleteNodeFromBSTDay51 {
	static class NodeTree {
		int data;
		NodeTree left, right;

		public NodeTree(int val) {
			this.data = val;
		}
	}

	public static void main(String[] args) {
		NodeTree root = null;
		root = insert(root, 50);
		root = insert(root, 30);
		root = insert(root, 20);
		root = insert(root, 40);
		root = insert(root, 70);
		root = insert(root, 60);
		root = insert(root, 80);

		System.out.println("In-order traversal before deletion:");
		printInOrder(root);

		
		root=delete(root, 40);
		//root = delete(root, 20);
	    System.out.println("\nIn-order traversal after deletion:");
	    printInOrder(root);

	}

	public static NodeTree delete(NodeTree root, int key) {
		if (root == null) {
			return null;
		}
		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else {
			// Node with no children".
			if (root.left == null && root.right == null) {
				return null;
			}
			// Node with one child
			else if (root.left != null && root.right == null) {
				return root.left;
			} else if (root.right != null && root.left == null) {
				return root.right;
			}
			// Node with two children
			else {
				int minValue = findMin(root.right);
				root.data = minValue;
				root.right = delete(root.right, minValue);
			}
		}
		return root;

	}

	private static int findMin(NodeTree root) {
		while (root.left != null) {
			root=root.left;
		}
		return root.data;
	}

	public static void printInOrder(NodeTree root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.println(root.data + " ");
			printInOrder(root.right);
		}

	}

	public static NodeTree insert(NodeTree root, int i) {
		if (root == null) {
			return new NodeTree(i);
		}
		if (i < root.data) {
			root.left = insert(root.left, i);
		}
		if (i > root.data) {
			root.right = insert(root.right, i);
		}
		return root;
	}

}
