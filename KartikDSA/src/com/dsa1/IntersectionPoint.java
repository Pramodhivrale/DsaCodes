package com.dsa1;

import com.dsa1.LinkedListAddition1.Node;

public class IntersectionPoint 
{
	public static void main(String[] args) {
		
	}
	private static Node createSinglyLinkedList(int[] a) {
		Node head = new Node(a[0]);
		Node temp = head;
		int i = 1;
		while (i < a.length) {
			temp.next = new Node(a[i]);
			temp = temp.next;
			i++;
		}
		return head;

	}

}
