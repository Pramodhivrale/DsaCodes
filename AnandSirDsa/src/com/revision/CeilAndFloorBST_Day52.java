package com.revision;

class NodeTree {
    int data;
    NodeTree left, right;

    public NodeTree(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CeilAndFloorBST_Day52 {
    public static void main(String[] args) {
        NodeTree root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("In-order traversal of the BST:");
        inorder(root);

        // Now let's find the ceil and floor for a specific key outside the traversal
        int key = 65;
        System.out.println("\nCeil of " + key + " is: " + findCeil(root, key));
        System.out.println("Floor of " + key + " is: " + findFloor(root, key));
    }

    // In-order traversal of the BST (this will print the tree in sorted order)
    public static void inorder(NodeTree root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Find the floor of a key in the BST
    public static int findFloor(NodeTree root, int key) {
        NodeTree floor = null;
        while (root != null) {
            if (root.data == key) {
                return root.data; // Key itself is the floor
            }
            if (root.data > key) {
                root = root.left; // Move to left to find a smaller value
            } else {
                floor = root; // Potential floor found
                root = root.right; // Move to right to find a larger floor
            }
        }
        return (floor != null) ? floor.data : -1; // Return -1 if no floor is found
    }

    // Find the ceil of a key in the BST
    public static int findCeil(NodeTree root, int key) {
        NodeTree ceil = null;
        while (root != null) {
            if (root.data == key) {
                return root.data; // Key itself is the ceil
            }
            if (root.data < key) {
                root = root.right; // Move to right to find a larger value
            } else {
                ceil = root; // Potential ceil found
                root = root.left; // Move to left to find a smaller ceil
            }
        }
        return (ceil != null) ? ceil.data : -1; // Return -1 if no ceil is found
    }

    // Insert a node into the BST
    public static NodeTree insert(NodeTree root, int i) {
        if (root == null) {
            return new NodeTree(i);
        }
        if (i < root.data) {
            root.left = insert(root.left, i);
        }
        if (i > root.data) {
            root.right = insert(root.right, i);
        }
        return root;
    }
}
