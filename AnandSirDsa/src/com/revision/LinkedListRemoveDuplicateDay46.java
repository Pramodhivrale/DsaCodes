package com.revision;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class LinkedListRemoveDuplicateDay46 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);

		System.out.println("Original List:");
		printList(head);

		head = removeDuplicates(head);

		System.out.println("List after removing duplicates:");
		printList(head);
	}

	private static ListNode removeDuplicates(ListNode head) {
		if (head == null) {
			System.out.println("List is empty");
		}
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.val == currentNode.next.val) {
				// skip the next element
				currentNode.next = currentNode.next.next;
			} else {
                currentNode=currentNode.next;
			}
		}
		return head;
	}

	private static void printList(ListNode head) {
		if (head == null) {
			System.out.println("List is empty nothing to print");
		}
		ListNode currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.val + " ");
			currentNode = currentNode.next;
		}
		System.out.println("NULL");

	}

}
