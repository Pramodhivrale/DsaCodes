package com.data;

public class TwoCatchBlocks {
	public void meth1() {

		try {
		    
			String arr[] = new String[5];
			arr[0] = "mahadev";
			arr[1] = "krishna";
			arr[2].toUpperCase();
			int c= 10% 0;
			
		} catch (NullPointerException a) 
		{
			a.printStackTrace();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
		new TwoCatchBlocks().meth1();
	}

}