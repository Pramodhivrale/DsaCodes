package com.data;

@SuppressWarnings("serial")
class UserException extends Exception {
	
	public UserException(String s) {
		System.out.println(s);
	}
	
}

public class TryCatchSingleMethod 
{
	
	public void throwException(int age) {
		
		try {
			
			if(age < 18) {
				throw new UserException("Age should be more than 18+ to eligible for voting card ");
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void main(String[] args) {
		new TryCatchSingleMethod().throwException(12);
	}

}
