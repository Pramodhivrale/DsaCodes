package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTreeYT {
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int index = -1;

		public static Node buildtree(int nodes[]) {
			index++;
			// Check if the index is within bounds of the array
			if (index >= nodes.length) {
				return null;
			}
			if (nodes[index] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[index]);
			newNode.left = buildtree(nodes);
			newNode.right = buildtree(nodes);
			return newNode;
		}
	}

	// PREORDER TRAVERSAL
	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}

	// INORDER TRAVERSAL
	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);

	}

	// POSTORDER TRAVERSAL
	public static void postorder(Node root) {
		if (root == null) {
			return;
		}
		postorder(root.left);

		postorder(root.right);
		System.out.println(root.data);
	}

	public static void levelorder(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			Node currentNode = q.remove();
			if (currentNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(currentNode.data + " ");
				if(currentNode.left!=null) {
					q.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					q.add(currentNode.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildtree(nodes);
		// System.out.println(root.data);
		// preorder(root);
		// inorder(root);
		// postorder(root);
		levelorder(root);
	}

}
