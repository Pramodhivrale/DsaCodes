package com.data;

public class UserDefinedException 
{
	void meth1(int age) throws AgeIsNotValid {
		
		if(age < 18) {
			throw new AgeIsNotValid("age should be greather than 18");
		}
		else {
			System.out.println("You are eligibal");
		}
	}
	public static void main(String[] args) throws AgeIsNotValid {
		UserDefinedException u=new UserDefinedException();
		u.meth1(17);
	}

}
