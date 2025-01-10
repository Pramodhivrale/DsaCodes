package com.revision;

public class BuildBTDay48 {
	static class TreeNode {
		int data;
		TreeNode left, right;

		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int index = -1;

		public static TreeNode buildtree(int[] nodes) {
			index++;
			if (nodes[index] == -1) {
				return null;
			}
			TreeNode newNode = new TreeNode(nodes[index]);
			newNode.left = buildtree(nodes);
			newNode.right = buildtree(nodes);
			return newNode;

		}

		public static int getSize(TreeNode node) {
			if (node == null) {
				return 0;
			}

			int leftsize = getSize(node.left);
			int rightsize = getSize(node.right);
			return 1 + leftsize + rightsize;
		}

		// Sum of nodes
		public static int sum(TreeNode root) {
			int sum = 0;
			if (root == null) {
				return 0;
			}
			int leftsubtree = sum(root.left);
			int rightsubtree = sum(root.right);
			return root.data + leftsubtree + rightsubtree;

		}

		// find max element
		public static int maxV(TreeNode root) {
			if (root == null) {
				return Integer.MIN_VALUE;
			}
			int leftmax = maxV(root.left);
			int rightmax = maxV(root.right);
			return Math.max(root.data, Math.max(leftmax, rightmax));
			// Compare root, left, and right

		}

		// Hight of the tree
		public static int hightOfTree(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int leftHeight = hightOfTree(root.left); // Height of the left subtree
			int rightHeight = hightOfTree(root.right); // Height of the right subtree

			return Math.max(leftHeight, rightHeight) + 1; // Return the maximum height + 1 for the current node

		}

		// Depth of the node
		public static int depthOfNode(TreeNode root, int targate) {
			if (root == null) {
				return -1;
			}
			if (root.data == targate) {
				return 0; // If the current node is equal to the targate then we have
				// found and depth is 0 because it is current node
			}

			int left = depthOfNode(root.left, targate);
			// it will search for targate node in left subtree and if not found then it will return
			// -1 so result is not equal to -1 means we have found element
			if (left != -1) {
				return left + 1;
			}
			int right = depthOfNode(root.right, targate);
			if (right != -1) {
				return right + 1;
			}
			return -1;
		}
	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

		BinaryTree bt = new BinaryTree();
		TreeNode root = BinaryTree.buildtree(nodes);
		System.out.println(root.data);
		// -----------------------
		int size = bt.getSize(root);
		System.out.println("Size of binary Tree :" + size);

		int sum = bt.sum(root);
		System.out.println("Sum of BT :" + sum);

		int max = bt.maxV(root);
		System.out.println("Max :" + max);

		int depth = bt.depthOfNode(root, 4);
		System.out.println("Depth :" + depth);

	}

}
