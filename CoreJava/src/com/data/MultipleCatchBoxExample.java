package com.data;

public class MultipleCatchBoxExample {
	@SuppressWarnings("null")
	void meth1() {
		try {

			String name = null;

			int length = name.length();
			int a = 2 / 0;

		} catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new MultipleCatchBoxExample().meth1();
	}

}
