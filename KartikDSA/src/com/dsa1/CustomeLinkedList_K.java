package com.dsa1;

public class CustomeLinkedList_K {
	Node head = null;
	private int size;

	public CustomeLinkedList_K() {
		this.size = 0;
	}

	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// ADD FIRST
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
		size++;
	}

	// ADD LAST
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}

		currNode.next = newNode;
		size++;
	}

	// print-list
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	// DELETE FIRST ELEMENT FROM LL
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}

	// DELETE LAST ELEMENT FROM LL
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

//	public int getSize() {
//		return size;
//	}

	public int getSize() {
		int sizee = 0;
		while (head != null) {
			sizee = sizee + 1;
			head = head.next;

		}
		return sizee;
	}

	// Print LL in reverse order
	public void printReverse(Node head) {
		if (head == null) {
			return;
		}
		printReverse(head.next);
		System.out.println(head.data);
	}

	// INSERT
	public Node insert(Node head, int x, int pos) {
		Node newNode = new Node(x); // Create a new node with value x

		// If the position is 0, insert at the head
		if (pos == 0) {
			newNode.next = head;
			return newNode; // New node becomes the new head
		}

		// Traverse the list to find the position to insert
		Node currentNode = head;
		for (int i = 0; i < pos - 1; i++) {
			if (currentNode == null) {
				// If currentNode becomes null, it means pos is greater than the size of the
				// list
				// We can break and insert at the end
				break;
			}
			currentNode = currentNode.next;
		}

		// Insert the new node at the found position
		if (currentNode != null) {
			newNode.next = currentNode.next; // Link new node to the next node
			currentNode.next = newNode; // Link current node to the new node
		} else {
			// If currentNode is null, we are at the end of the list
			// We can insert the new node at the end
			// Note: This assumes that the caller has handled the case where pos is greater
			// than the size
			// In this case, we do nothing as the new node will not be inserted
		}

		return head; // Return the head of the list
	}

	// INSERT ELEMENT SUCH THAT YOU HAVE SHORTED LL
	public Node insertSort(Node head, int x) {

		return head;

	}

	// DELETE
	public Node delete(Node head, int pos) {
		// If the position is invalid
		if (pos < 0 || pos >= getSize()) {
			return head; // Return the head without any changes
		}

		// If deleting the head node
		if (pos == 0) {
			return head.next; // Return the new head
		}

		Node currentNode = head;
		Node previousNode = null;

		// Traverse the list to find the node just before the desired position
		for (int count = 0; count < pos; count++) {
			previousNode = currentNode; // Keep track of the previous node
			currentNode = currentNode.next; // Move to the next node
		}

		// Now currentNode is at the position to delete
		if (currentNode != null) {
			previousNode.next = currentNode.next; // Bypass the current node
		}

		return head; // Return the head of the list
	}

	// DELETE ALL OCCURENCE
	public Node deleteAll(Node head, int x) {

		if (head == null) {
			return head;
		}
		Node currNode = head;
		while (head.next != null) {
			if (head.next.data == x) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		if (currNode.data == x) {
			return currNode.next;
		}
		return currNode;

	}
	// Unique value

	// Reverse
	public Node reverse(Node head) {
		if (head == null) {
			return head;
		}
		Node previous = null;
		while (head != null) {
			Node temp = head.next;
			head.next = previous;
			previous = head;
			head = temp;
		}
		return previous;
	}

	// Remove nth from End of list
	public Node removeNth(Node head, int n) {
		// If LL has only one element
		if (head.next == null) {
			return null;
		}
		// Calculating size
		Node currNode = head;
		int s = 0;
		while (currNode != null) {
			currNode = currNode.next;
			s++;
		}
		if (n == s) {
			return head.next;
		}
		int indexTosearch = s - n;
		Node prev = head;
		int i = 0;
		while (i < indexTosearch) {
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return head;
	}

	// Check if linked list is palindrome
	// 1.Middle of LL
	// 2.2nd half reverse
	// 3.check first and second half
	public boolean isPalindrome(Node head) {
		if (head == null || head.next == null) {
			return true;
		}
		Node middle = findMiddle(head);// 1st half ka end
		Node secondHalfStart = reverseP(middle.next);

		Node firstHalfStart = head;
		while (secondHalfStart != null) {
			if (firstHalfStart.data != secondHalfStart.data) {
				return false;
			}
			firstHalfStart = firstHalfStart.next;
			secondHalfStart = secondHalfStart.next;
		}
		return true;
	}

	private Node findMiddle(Node head) {
		Node here = head;
		Node turtle = head;

		while (here.next != null && turtle.next.next != null) {
			here = here.next.next;
			turtle = turtle.next;
		}
		return turtle;
	}

	private Node reverseP(Node head) {
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
    // Cycle detection in linked list
	public boolean hasCycle(Node head) {
		Node hare = head;
		Node turtle = head;
		if (head == null) {
			return false;
		}

		while (hare != null && hare.next != null) {
			hare = hare.next.next;
			turtle = turtle.next;

			if (hare == turtle) {
				return true;
			}
		}
		return false;
	}
	//Unique value
//	public Node unique(Node node) {
//		Node d=new Node(0);
//		if(head==null) {
//			return head;
//		}
//		Node temp=d;
//	}

	public static void main(String[] args) {
		CustomeLinkedList_K list = new CustomeLinkedList_K();
		list.addFirst(5);
		list.addFirst(3);
		list.addFirst(3);
		list.addFirst(6);
		list.addFirst(7);
		list.addFirst(52);
		// list.deleteFirst();
		list.addLast(10);
		list.printList();
		System.out.println("Size :" + list.getSize());
		list.printReverse(list.head);

	}

}
