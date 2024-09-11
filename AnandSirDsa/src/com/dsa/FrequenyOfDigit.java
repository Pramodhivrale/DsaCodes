package com.dsa;

public class FrequenyOfDigit 
{
	public static void main(String[] args) {
		int digits=2859342;
		
		String valueOf = String.valueOf(digits);
		//System.out.println(valueOf);
		int[] digitsFrequency=new int[10];
		
		for(int i=0;i<=valueOf.length()-1;i++) {
			int d=valueOf.charAt(i) - '0';
			digitsFrequency[d]++;
		}
		
		for(int i=0;i<=digitsFrequency.length-1;i++) {
			if(digitsFrequency[i] > 0) {
				System.out.println(i+" "+digitsFrequency[i]+" ");
			}
			
		}
	}

}
