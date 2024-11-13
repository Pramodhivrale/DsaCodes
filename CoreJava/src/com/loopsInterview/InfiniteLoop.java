package com.loopsInterview;

public class InfiniteLoop 
{
	public static void main(String[] args) {
		// IF WE DON'T GIVE INCREMENT CONDITION THEN LOOP WILL RUN FOR INFINITE
		//IF WE DON'T GIVE CONDITION THEN LOOP WILL RUN FOR INFINITE
		// IF WE DON'T GIVE ANY CONDITION THEN ALSO LOOP WILL RUN FOR INFINITE
//		for(;;) {
//			System.out.println("#");
//		}
		
		int i=0;
		while (true) {
			System.out.println(i);
			i++;
		}
	}

}
