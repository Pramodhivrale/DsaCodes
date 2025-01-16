package com.revision;

public class InvertBinaryTreeDay50 {
	static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		//InvertBinaryTreeDay50 bt = new InvertBinaryTreeDay50();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);

		printTree(root);

		invertBt(root);

		System.out.println("\nInverted Tree:");
		printTree(root);
	}

	private static TreeNode invertBt(TreeNode root) {
		if (root == null) {
			return null;
		}
		//1.data is processed
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		// left tree
		invertBt(root.left);
		
		//right tree
		invertBt(root.right);

		return root;
	}

	// In-order traversal
	public static void printTree(TreeNode root) {
		if (root != null) {
			printTree(root.left);
			System.out.println(root.data);
			printTree(root.right);
		}

	}

}
