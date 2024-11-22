package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_BT {

	public static void main(String[] args) {
		int values[] = { 5, 1, 3, 4, 2, 7 };
		TreeNode root = null;
		for (int i = 0; i < values.length; i++) {
			root = insert(root, values[i]);
		}
		levelorder(root);
	}

	private static TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (root.data > value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;

	}

	private static void levelorder(TreeNode root) {

		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			TreeNode currentNode = q.remove();
			if (currentNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(currentNode.data + " ");
				if (currentNode.left != null) {
					q.add(currentNode.left);
				}
				if (currentNode.right != null) {
					q.add(currentNode.right);
				}
			}
		}
	}

	static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int value) {
			this.data = value;
			this.left = null;
			this.right=null;
		}
	}

}
