package com.data;

public class InteruppetThread extends Thread {

	@Override
	public void run() {

		System.out.println("Interview started !");
		for (int i = 1; i <= 5; i++) {
			System.out.println("I give my first interview :" + i);
		}
		System.out.println("I got placed relex.....!");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Sleep got distrubuted  !");
		}
		System.out.println("time to go office");
	}

	public static void main(String[] args) {
 
		InteruppetThread t=new InteruppetThread();
		Thread t1=new Thread(t);
		t1.start();
		t1.interrupt();
	}

}
