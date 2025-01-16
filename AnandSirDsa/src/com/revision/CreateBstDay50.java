package com.revision;

// Create valid BST
// Check bst is valid or not
// search element in bst
public class CreateBstDay50 {
	static class TreeNode {
		int data;
		TreeNode left, right;

		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		TreeNode root = null;
		root = insert(root, 10);
		root = insert(root, 5);
		root = insert(root, 15);
		root = insert(root, 3);
		root = insert(root, 7);
		root = insert(root, 12);
		root = insert(root, 18);

		System.out.println("In-order Traversal of BST:");
		inOrder(root);

		System.out.println();

		if (isBST(root)) {
			System.out.println("The tree is a valid BST.");
		} else {
			System.out.println("The tree is NOT a valid BST.");
		}

		searchElement(root, 12);
	}

	public static boolean searchElement(TreeNode root, int i) {
		if (root == null) {
			return false;
		}
		while (root != null) {
			if (root.data == i) {
				return true;
			} else if (i <= root.data) {
				root = root.left;
			} else if (i >= root.data) {
				root = root.right;
			}
		}
		return false;

	}

	public static boolean isBST(TreeNode root) {
		return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean isBstUtil(TreeNode root, int minValue, int maxValue) {
		if (root == null) {
			return true;
		}
		if (root.data <= minValue || root.data >= maxValue) {
			return false;
		}
		return isBstUtil(root.left, minValue, root.data) && isBstUtil(root.right, root.data, maxValue);
	}

	private static TreeNode insert(TreeNode root, int i) {
		// If root is null create new Node
		if (root == null) {
			return new TreeNode(i);
		}
		if (i < root.data) {
			root.left = insert(root.left, i);
		} else if (i > root.data) {
			root.right = insert(root.right, i);
		}
		return root;
	}

	public static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

}
