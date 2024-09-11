package com.dsa1;

import java.util.Arrays;

public class MargeArrayDemo {
	public static void main(String[] args) {
		int a[] = { 8, 9, 6, 4, 5, 2, 3, 7 };
		int b[] = { 10, 85, 1, 78, 63, 2, 45, 7, 5, 6, 88, 9 };
		
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0;
		int p2=0;
		int result[]=new int[a.length+b.length];
		int k=0;
		
		while(p1 < a.length && p2 < b.length) {
			if(a[p1] > b[p2]) {
				result[k]=b[p2];
				k++;
				p2++;
			}
			else{
				result[k]=a[p1];
				k++;
				p1++;
			}
		}
		while (p1 < a.length) {
			result[k]=a[p1];
			p1++;
			k++;
		}
		while (p2 < b.length) {
			result[k]=b[p2];
			p2++;
			k++;
		}
		
		System.out.println("Marged arrays :"+Arrays.toString(result));
	}

}
