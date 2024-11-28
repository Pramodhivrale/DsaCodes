package com.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderWithoutRecurssion {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		List<Integer> result = preorderTraversal(root);
		System.out.println("Preorder Traversal: " + result);
	}

	private static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> results = new ArrayList<Integer>();
		if (root == null) {
			return results;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode pop = stack.pop();
			results.add(pop.val);

			if (pop.right != null) {
				stack.push(pop.right);
			}
			if (pop.left != null) {
				stack.push(pop.left);
			}

		}
		return results;
	}
}
