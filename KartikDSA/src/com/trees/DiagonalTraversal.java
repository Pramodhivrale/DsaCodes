package com.trees;

import java.util.List;

public class DiagonalTraversal {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int val) {
			this.val = val;
		}
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        DiagonalTraversal obj = new DiagonalTraversal();
        List<List<Integer>> result = obj.diagonalTraversal(root);
        System.out.println(result);
	}
	private List<List<Integer>> diagonalTraversal(TreeNode root) {
		
		return null;
	}

}
