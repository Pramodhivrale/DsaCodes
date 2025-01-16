package com.revision;

public class MirrorOfTreeDay50 {
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
		MirrorOfTreeDay50 tree = new MirrorOfTreeDay50();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		inorderPrint(tree.root);

		mirrorOfTree(tree.root);
	}

	private static void mirrorOfTree(Node root2) {
		if (root2 == null) {
			return ;
		}
		Node temp=root2.left;
		root2.left=root2.right;
		root2.right=temp;
		
		mirrorOfTree(root2.left);
		mirrorOfTree(root2.right);
		

	}

	public static void inorderPrint(Node root) {
		if (root == null) {
			return;
		}
		inorderPrint(root.left);
		System.out.println(root.data);
		inorderPrint(root.right);
	}

}
