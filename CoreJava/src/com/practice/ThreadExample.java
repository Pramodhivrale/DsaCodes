package com.practice;

public class ThreadExample
{
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("run");
			}
		};
		
		//Second way of calling
		runnable.run();
		
		// Second way of calling
		Thread t1=new Thread(runnable);
		t1.start();
	}

}
