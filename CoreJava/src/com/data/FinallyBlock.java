package com.data;

public class FinallyBlock 
{
	void meth1() {
		try {
			int a=10/0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Upper");
			System.exit(2);
			System.out.println("Lower");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
	public static void main(String[] args) {
		new FinallyBlock().meth1();
	}

}
