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

	// SEARCH PARTICULAR ELEMENT
	public static boolean search(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.data == key) {
			return true;
		}
		return search(root.left, key) || search(root.right, key);
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

	public static Node mirror(Node root) {
		if (root == null) {
			return null;
		}
		Node leftMirrior = mirror(root.left);
		Node rightMirrior = mirror(root.right);

		root.left = rightMirrior;
		root.right = leftMirrior;
		return root;
	}

	// INSERT ELEMENT
	// IN GENRAL BINARY THREE WE INSERT ELEMENT AT FIRST AVAILABLE POSITION [THAT IS
	// NULL]
	public static void insert(Node root, int element) {
		if (root == null) {
			root = new Node(element);
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node currentNode = queue.remove();
			// If we find an empty spot in the left subtree, insert there
			if (currentNode.left == null) {
				currentNode.left = new Node(element);
				break;
			} else {
				queue.add(currentNode.left);
			}
			if (currentNode.right == null) {
				currentNode.right = new Node(element);
				break;
			} else {
				queue.add(currentNode.right);
			}
		}

	}
    //DELETE ELEMENT
	

	

	// LEVELORDER TRAVERSAL
	public static void levelorder(Node root) {
		if (root == null) {
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
				if (currentNode.left != null) {
					q.add(currentNode.left);
				}
				if (currentNode.right != null) {
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
		// System.out.println("Before mirrio tree");
		// levelorder(root);
		// Node mirror = mirror(root);
		// System.out.println("Mirror tree");
		// levelorder(root);
		// boolean search = search(root, 7);
		// System.out.println(search);
		// -----------------------------------
		System.out.println("TREE BEFORE INSERTION");
		levelorder(root);
		insert(root, 11);
		System.out.println("TREE AFTER INSERTION");
		levelorder(root);

	}

}
