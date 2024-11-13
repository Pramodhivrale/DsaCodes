package com.data;

import java.util.Arrays;

public class FrequencyOfDigit3 
{
	void meth1() {
		int number=123423;
		
		String valueOf = String.valueOf(number);
		int arr[]=new int[valueOf.length()];
		for(int i=0;i<=valueOf.length()-1;i++) {
			char charAt = valueOf.charAt(i);
			int count=0;
			for(int j=0;j<=valueOf.length()-1;j++) {
				if(valueOf.charAt(j)==charAt) {
					count++;
				}
			}
			arr[i]=count;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
	}

}
