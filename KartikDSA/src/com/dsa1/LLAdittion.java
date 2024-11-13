package com.dsa1;

import java.util.LinkedList;

public class LLAdittion {
    Node head = null;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Method to convert LinkedList<Integer> to Node linked list
    public static Node convertToNodeList(LinkedList<Integer> list) {
        Node head = null;
        Node current = null;
        for (int num : list) {
            if (head == null) {
                head = new Node(num);
                current = head;
            } else {
                current.next = new Node(num);
                current = current.next;
            }
        }
        return head;
    }

    // Method to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Method to add two linked lists
    public static Node additionOFLinkedlIst(Node l1, Node l2) {
        Node h1 = reverse(l1);
        Node h2 = reverse(l2);
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while (h1 != null || h2 != null) {
            int x = (h1 != null) ? h1.data : 0;
            int y = (h2 != null) ? h2.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;

            if (h1 != null) h1 = h1.next;
            if (h2 != null) h2 = h2.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return reverse(dummyHead.next); // Return the result in the correct order
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(3);
        l1.add(1);
        l1.add(4);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(9);
        l2.add(7);

        // Convert LinkedList<Integer> to Node linked lists
        Node list1 = convertToNodeList(l1);
        Node list2 = convertToNodeList(l2);

        // Perform addition
        Node result = additionOFLinkedlIst(list1, list2);

        // Print the result
        System.out.print("Sum: ");
        printList(result);
    }
}
