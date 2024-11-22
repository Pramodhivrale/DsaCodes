package com.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrePostTraversal {
	Node root;
	static int preorderIndex = 0;

	static class Node {
		int data;
		Node left, right;

		Node(int value) {
			this.data = value;
			this.left = right = null;
		}
	}

	public static void main(String[] args) {
		int[] preorder = { 1, 2, 4, 5, 3, 6, 7 };
		int[] inorder = { 4, 2, 5, 1, 6, 3, 7 };

		// Map to store indices of inorder elements for quick access.
		Map<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}

		Node root = buildTree(preorder, inorder, 0, inorder.length - 1, inorderMap);

		// Generate postorder traversal.
		List<Integer> postOrderList = new ArrayList<>();
		getPostOrder(root, postOrderList);
		
		System.out.println("PostOrder traversal :"+postOrderList);

	}

	private static void getPostOrder(Node root, List<Integer> postOrderList) {
		if (root == null) {
			return;
		}
		getPostOrder(root.left, postOrderList);
        getPostOrder(root.right, postOrderList);
        postOrderList.add(root.data);
	}

	private static Node buildTree(int[] preorder, int[] inorder, int inStart, int inEnd,
			Map<Integer, Integer> inorderMap) {
		if (inStart > inEnd) {
			return null;
		}

		// The next element in preorder is the root.
		int rootValue = preorder[preorderIndex++];
		Node root = new Node(rootValue);

		// Build left and right subtrees using inorder.
		int inorderIndex = inorderMap.get(rootValue);

		root.left = buildTree(preorder, inorder, inStart, inorderIndex - 1, inorderMap);
		root.right = buildTree(preorder, inorder, inorderIndex + 1, inEnd, inorderMap);


		return root;

	}

}
