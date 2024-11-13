package com.data;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {
	static AtomicInteger count = new AtomicInteger(0);

//	public static void increment() {
//		count++;
//	}
//
//	public static int decrement() {
//		return count;
//	}
	// static int count = 0;

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					///count++;
					count.incrementAndGet();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					// count++;
					//count = count + 1;
					count.incrementAndGet();
				}

			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}

}
