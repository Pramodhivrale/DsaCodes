package com.revision;

public class LargeWordWithPrefixDay66 {
    static class Node {
        Node[] children;
        boolean eow; // End of Word

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }

    static Node root = new Node();
    static String ans = "";

    public static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            if (i == word.length() - 1) {
                current.children[index].eow = true;
            }
            current = current.children[index];
        }
    }

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow==true) {
                // Add the character to the current word
                temp.append((char) (i + 'a'));

                // Update the longest word if the current one is longer
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                // Recurse to the child node
                longestWord(root.children[i], temp);

                // Backtrack by removing the last character
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (String word : words) {
            insert(word);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println("Longest word: " + ans);
    }
}
