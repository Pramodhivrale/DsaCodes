package com.collection;

public class CustomeLinkedList
{
	Node head=null;
	class Node{
		Object data;
		Node next;
		public Node(Object data) {
			this.data=data;
		}
	
	}
	public void add(Object obj) {
		Node n=new Node(obj);//10 20
		if(head==null) {
			head=n;//10
		}
		else {
			Node temp=head;//10
			while(temp.next != null) {
				temp=head.next;
			}
			temp.next=n;
		}
	}

}
