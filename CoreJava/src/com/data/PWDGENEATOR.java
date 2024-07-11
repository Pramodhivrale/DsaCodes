package com.data;

import java.util.Random;

public class PWDGENEATOR 
{
	public static void main(String[] args) {
		 String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 StringBuffer string=new StringBuffer();
		 Random r=new Random();
		 for(int i=1;i<=6;i++) {
			 int random=r.nextInt(characters.length());
			 string.append(characters.charAt(random)); 
		 }
		 System.out.println(string);
	}

}
