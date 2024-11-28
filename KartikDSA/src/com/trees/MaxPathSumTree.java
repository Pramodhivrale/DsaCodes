package com.trees;

public class MaxPathSumTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	int maxsum = Integer.MIN_VALUE;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(-10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		MaxPathSumTree tree = new MaxPathSumTree();
		System.out.println("Maximum Path Sum: " + tree.maxPathSum(root));
	}

	private int maxPathSum(TreeNode root) {
		maxGain(root);
		return maxsum;
	}

	private int maxGain(TreeNode root) {
		if (root == null) {
			return 0;
		}

		// Calculate the maximum sum from left and right subtrees, ignoring negative
		// paths

		int maxLeft = Math.max(maxGain(root.left), 0);
		int maxright = Math.max(maxGain(root.right), 0);

		// Calculate the sum including the current node and both subtrees
		int total = root.val + maxLeft + maxright;

		// Update the global maximum sum
		maxsum = Math.max(maxsum, total);

		// Return the maximum gain that this node can contribute to its parent
		return root.val + Math.max(maxLeft, maxright);
	}
}
