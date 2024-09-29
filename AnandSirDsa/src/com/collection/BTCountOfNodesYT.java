package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class BTCountOfNodesYT {
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

	static class Treeinfo {
		int height;
		int diam;

		public Treeinfo(int height, int diam) {
			this.height = height;
			this.diam = diam;
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

	// SUM OF NODES
	public static int sumofNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int leftNodes = sumofNodes(root.left);
		int rightNodes = sumofNodes(root.right);
		return leftNodes + rightNodes + root.data;
	}

	// COUNT OF NODES
	public static int countofNodes(Node root) {
		if (root == null) {
			return 0;
		}

		int leftNodes = countofNodes(root.left);
		int rightNodes = countofNodes(root.right);
		return leftNodes + rightNodes + 1;
	}

	// HEIGHT OF TREE
	public static int hightofnode(Node root) {
		if (root == null) {
			return 0;
		}
		int leftheight = hightofnode(root.left);
		int rightheight = hightofnode(root.right);
		int myheight = Math.max(leftheight, rightheight) + 1;
		return myheight;
	}

	// DIMETER OF TREE [APPROACH-1]
	public static int diameter(Node root) {
		if (root == null) {
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = hightofnode(root.left) + hightofnode(root.right) + 1;
		return Math.max(diam3, Math.max(diam1, diam2));
	}

	// DIAMETER OF TREE [APPROACH-2]
	public static Treeinfo diameter2(Node root) {
		if (root == null) {
			return new Treeinfo(0, 0);
		}
		Treeinfo left = diameter2(root.left);
		Treeinfo right = diameter2(root.right);

		int myHeight = Math.max(left.height, right.height) + 1;
		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.height + right.height + 1;
		int mydiam = Math.max(diam3, Math.max(diam1, diam2));

		Treeinfo myInfo = new Treeinfo(myHeight, mydiam);
		return myInfo;
	}

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
		// levelorder(root);
		// int countofNodes = countofNodes(root);
		// int sumofNodes = sumofNodes(root);
		// int hightofnode = hightofnode(root);
		// int diameter = diameter(root);
		// int diam = diameter2(root).diam;
		//System.out.println(diam);
	}

}
