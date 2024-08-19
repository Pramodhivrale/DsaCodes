package com.data;

public class StringSCP_HEAP 
{
	public static void main(String[] args) {
		
		String s1="java";
		String s2="java";
		String s6="html";
		
		String s3=new String("java");
		String s4=new String("html");
		String s5=new String("java");		
		System.out.println(s1 == s3);
		System.out.println(s2 == s1);
		System.out.println(s5 == s3);
		System.out.println(s6 == s4);
		
	}

}
