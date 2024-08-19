package com.data;

class ThreadExample2 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("For loop exeecuted :" + i);
		}
	}

}

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {

		ThreadExample2 t=new ThreadExample2();
		t.start();
		t.join();
		
		for(int i=6;i<=10;i++) {
			System.out.println("For loop executed "+i);
		}
	}

}
