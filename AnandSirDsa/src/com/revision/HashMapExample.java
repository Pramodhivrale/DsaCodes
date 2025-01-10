package com.revision;

public class HashMapExample {

	public static void main(String[] args) {
		Runnable r=()->System.out.println("name");
		new Thread(r).start();

	}
}
