package com.revision;

public class StairsDay56 
{
	public static void main(String[] args) {
		int n=5;
		System.out.println("No of ways to reach "+n+" stairs :"+climbstairs(n));
	}

	public static int climbstairs(int n) {
		if(n<=1) {
			return 1;
		}
		int prev1=1;
		int prev2=1;
		for(int i=2;i<=n;i++) {
			int current=prev1+prev2;
			prev1=prev2;
			prev2=current;
		}
		return prev2;
	}

}
