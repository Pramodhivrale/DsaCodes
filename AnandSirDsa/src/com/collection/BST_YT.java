package com.collection;

import java.util.ArrayList;

public class BST_YT {
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	// INSERT - BST
	public static Node insert(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (root.data > value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	// INORDER - BST
	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	//PRINT TO LEAF PATH
	
	//PRINT IN RANGE
	public static void printInRange(int x,int y,Node root) {
		if(root == null) {
			return;
		}
		if(root.data >= x && root.data <= y) {
			printInRange(x, y, root.left);
			System.out.println(root.data);
			printInRange(x, y, root.right);
		}
		else if (root.data >= y) {
			printInRange(x, y, root.left);
		}
		else {
			printInRange(x, y, root.right);
		}
	}
	//PRINT ROOT 2 LEAF PATH
	public static void printRoot2Leaf(Node root,ArrayList<Integer> path) {
		if(root == null) {
			return;
		}
		
		path.add(root.data);
		
		//leaf
		if(root.left==null && root.right==null) {
			printpath(path);
		}
		else {//non-leaf
			printRoot2Leaf(root.left, path);
			printRoot2Leaf(root.right, path);
		}
		path.remove(path.size()-1);
	}
    private static void printpath(ArrayList<Integer> path) {
    	for(int i=0;i<path.size();i++) {
    		System.out.print("->"+path.get(i));
    	}
    	System.out.println();
    	
		
	}

	// DELETE - BST
	public static Node delete(Node root, int element) {
		if (root.data > element) {
			root.left = delete(root.left, element);
		} else if (root.data < element) {
			root.right = delete(root.right, element);
		} else {// root.data==element
				// case1 : leaf node
			if (root.left == null && root.right == null) {
				return null;
			}
			// case2
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			// case3
			Node IS = inordeeSccesor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
	}

	public static Node inordeeSccesor(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	// SEARCH ELEMENT IN - BST
	public static boolean search(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.data == key) {
			return true;
		}
		return search(root.left, key) || search(root.right, key);

	}

	public static void main(String[] args) {
		int values[] = { 5, 1, 3, 4, 2, 7 };
		Node root = null;
		for (int i = 0; i < values.length; i++) {
			root = insert(root, values[i]);
		}
		//inorder(root);
		//System.out.println();
		//boolean search = search(root, 5);
		//System.out.println(search);
		//delete(root, 4);
		//inorder(root);
		//printInRange(2, 7, root);
		printRoot2Leaf(root, new ArrayList<Integer>());

	}

}
