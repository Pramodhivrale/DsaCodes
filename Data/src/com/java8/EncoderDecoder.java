package com.java8;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncoderDecoder 
{
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		String password= "pramod@12";
		//Converting form readable format to unreadable format called as Encryption
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(password.getBytes());
		String s2=new String(digest);
		System.out.println("Encrypted pass :"+s2);
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(digest);
		String s4=new String(encode);
		System.out.println(s4);
		
		
//		String password= "pramod@12";
//		
//		java.util.Base64.Encoder encoder = Base64.getEncoder();
//		
//		byte[] encode = encoder.encode(password.getBytes());
//		
//		String s=new String(encode);
//		System.out.println(s);
//		
//		Decoder decoder = Base64.getDecoder();
//		
//		byte[] decode = decoder.decode(s.getBytes());
//		String s1=new String(decode);
//		System.err.println(s1);
	}

}
