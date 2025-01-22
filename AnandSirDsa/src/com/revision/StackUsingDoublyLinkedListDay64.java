package com.revision;

import java.util.EmptyStackException;

public class StackUsingDoublyLinkedListDay64 {
	static class Node<T> {
		T data;
		Node<T> prev;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	static class StackDL<T> {
		Node<T> head = null;
		int size = 0;

		public boolean isEmpty() {
			return head == null;
		}

		public void push(T data) {
			Node<T> newNode = new Node<>(data);
			if (head != null) {
				head.prev = newNode; // Link the current head to the new node
			}
			newNode.next = head; // Link the new node to the current head
			head = newNode; // Update the head to the new node
			size++; // Increment the size
		}

		public T peek() {
			if (isEmpty()) {
				throw new EmptyStackException();
			}
			return head.data;
		}

		public T pop() {
			if (isEmpty()) {
				throw new EmptyStackException();
			}
			T data = head.data; // Get data of the current head
			head = head.prev; // Move head to the previous node
			if (head != null) {
				head.next = null; // Break the link to the popped node
			}
			size--; // Decrement size when popping an element
			return data;
		}

		public int getSize() {
			return size;
		}

		public void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            Node<T> current = head;
            System.out.print("Stack elements (from top to bottom): ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next; // Move to the next node
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		StackDL<Integer> s = new StackDL<Integer>();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		System.out.println("Size of the stack: " + s.getSize());

		s.printStack();
		while (!s.isEmpty()) {
			System.out.println("Popping element: " + s.pop());
		}

		System.out.println("Size of the stack after popping all elements: " + s.getSize());
	}
}
