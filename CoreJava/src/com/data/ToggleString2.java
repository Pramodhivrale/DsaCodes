package com.data;

public class ToggleString2 
{
	void meth1() {
		String input="Java Programming";
		
		char[] charArray = input.toCharArray();
		StringBuilder builder=new StringBuilder();
		
		for(int i=0;i<=charArray.length-1;i++) {
			if(Character.isLowerCase(charArray[i])) {
				builder.append(Character.toUpperCase(charArray[i]));
			}
			else if (Character.isUpperCase(charArray[i])) 
			{
				builder.append(Character.toLowerCase(charArray[i]));
				
			}
			else {
				builder.append(charArray[i]);
			}
		}
		System.out.println("New String :"+builder);
	}
	public static void main(String[] args) {
		new ToggleString2().meth1();
	}

}
