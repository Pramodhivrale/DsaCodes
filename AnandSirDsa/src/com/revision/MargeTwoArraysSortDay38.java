package com.revision;

import java.util.Arrays;

public class MargeTwoArraysSortDay38 
{
	public static void main(String[] args) {
		int num1[]= {1,2,3,0,0,0};
		int[] num2= {2,5,6};
		
		marge(num1,num2);
	}

	private static void marge(int[] num1, int[] num2) {
		int result[]=new int[num1.length+num2.length];
		int k=0;
		int p1=0;
		int p2=0;
		while (p1 < 3 && p2 < num2.length) {
			if(num1[p1] >= num2[p2]) {
				result[k]=num2[p2];
				p2++;
				k++;
			}else {
				result[k]=num1[p1];
				p1++;
				k++;
			}
		}
		while (p1 < 3) {
			result[k]=num1[p1];
			p1++;
			k++;
		}
		while (p2 < num2.length) {
			result[k]=num2[p2];
			p2++;
			k++;
		}
		System.out.println(Arrays.toString(result));
		
		for(int i=0;i<num1.length;i++) {
			num1[i]=result[i];
		}
		System.out.println(Arrays.toString(num1));
		
	}

}
