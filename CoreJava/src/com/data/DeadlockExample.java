package com.data;

public class DeadlockExample {

	// Resources shared between the threads
	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			// Acquiring lock1 first and then lock2
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}

				System.out.println("Thread 1: Waiting for lock 2...");
				
				synchronized (lock2) {
					System.out.println("Thread 1: Holding lock 1 & lock 2...");
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			// Acquiring lock2 first and then lock1
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				System.out.println("Thread 2: Waiting for lock 1...");
				synchronized (lock1) {
					System.out.println("Thread 2: Holding lock 2 & lock 1...");
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}
