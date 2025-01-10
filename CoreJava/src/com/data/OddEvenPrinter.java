package com.data;

public class OddEvenPrinter {
	final int[] numbers = { 1, 2, 3, 4, 5, 6 };
	int index = 0;

	public static void main(String[] args) {

		OddEvenPrinter obj = new OddEvenPrinter();

		Thread oddThread = new Thread(() -> obj.oddPrinter());
		Thread evenPrinter = new Thread(() -> obj.evenPrinter());
		oddThread.start();
		evenPrinter.start();

	}

	public synchronized void evenPrinter() {
		while (index < numbers.length) {
			if (numbers[index] % 2 != 0) {
				System.out.println(Thread.currentThread().getName() +":  "+  numbers[index] + " ");
				index++;
				notify();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private synchronized void oddPrinter() {
		while (index < numbers.length) {
			if (numbers[index] % 2 == 0) {
				System.out.println(Thread.currentThread().getName() +":  "+  numbers[index] + " ");
				index++;
				notify();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
