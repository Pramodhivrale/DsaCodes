package com.data;

import java.util.Random;

public class RandomStringGenerator {

//    public static String generateRandomString(int length) {
//    	
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        
//        SecureRandom random = new SecureRandom();
//        
//        StringBuilder randomString = new StringBuilder(length);
//        
//        for (int i = 0; i < length; i++) {
//            
//            int index = random.nextInt(characters.length());
//            // Append the character at the random index to the random string
//            randomString.append(characters.charAt(index));
//        }
//        
//        // Return the generated random string as a string
//        return randomString.toString();
//    }
//
//    public static void main(String[] args) {
//        int stringLength = 10;
//        
//        // Generate the random string
//        String randomString = generateRandomString(stringLength);
//        
//        // Print the generated random string
//        System.out.println("Generated Random String: " + randomString);
//    }
	
	public static void main(String[] args) {
		
		 String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 
		 Random random=new Random();
		 StringBuilder string=new StringBuilder();
		 
		 for(int i=1;i<=10;i++) {
			 
			 int nextInt = random.nextInt(characters.length());
			 string.append(characters.charAt(nextInt));
		 }
		 System.out.println(string);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
