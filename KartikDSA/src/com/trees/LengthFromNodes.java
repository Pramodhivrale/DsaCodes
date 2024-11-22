package com.trees;

public class LengthFromNodes {
	Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int value) {
			this.data = value;
			this.left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		Node a = root.left.left;// 4
		Node b = root.right.right;// 7

		int calculateDistance = calculateDistance(root, a, b);
		System.out.println("Distance from node " + a.data + " to node "+ b.data +":"+ calculateDistance);
		

	}

	public static int calculateDistance(Node root, Node a, Node b) {
		// LOWEST COMMAN ANCHESTOR OF A AND B
		Node lca = findLCA(root, a, b);

		// Step 2: Calculate distances from root to A, B, and LCA
		int distanceA = findDistance(root, a, 0);
		int distanceB = findDistance(root, b, 0);
		int distanceLCA = findDistance(root, lca, 0);
		
		return distanceA + distanceB - 2 * distanceLCA;

	}

	private static int findDistance(Node root, Node target, int distance) {
		// Node not found
		if (root == null) {
			return -1;
		}
		// Target not found
		if (root == target) {
			return distance;
		}
		// Check in the left subtree
		int left = findDistance(root.left, target, distance + 1);
		if (left != -1) {
			return left;
		}
		// Check in the right subtree
		return findDistance(root.right, target, distance + 1);

	}

	// Lowest Common ancestor
	public static Node findLCA(Node root, Node a, Node b) {
		if (root == null || a == root || b == root) {
			return root;
		}

		Node left = findLCA(root.left, a, b);
		Node right = findLCA(root.right, a, b);

		if (root.left != null && root.right != null) {
			return root;
		}
		return (root.left != null) ? left : right;

	}

}
