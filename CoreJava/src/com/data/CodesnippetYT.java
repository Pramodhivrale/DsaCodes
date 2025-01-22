package com.data;

public class CodesnippetYT 
{
	public static void main(String[] args) {
		try {
			int result=divide(10,0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException ");
		}
		catch (Exception e) {
			System.out.println("Caught Exception");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

	public static int divide(int i, int j) {
		return i/j;
	}

}
