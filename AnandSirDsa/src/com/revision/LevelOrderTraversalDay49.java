package com.revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
		left = right = null;
	}
}

class LevelOrderTraversal {
	public List<Integer> levelOrderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode currentNode = queue.poll();
			result.add(currentNode.val);
			//In level order traversal, we are just reading the nodes that already exist in the tree.
			//We are not inserting new nodes
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return result;
	}
}

public class LevelOrderTraversalDay49 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		
		LevelOrderTraversal ll=new LevelOrderTraversal();
		List<Integer> levelOrderTraversal = ll.levelOrderTraversal(root);
		System.out.println(levelOrderTraversal);
	}

}
