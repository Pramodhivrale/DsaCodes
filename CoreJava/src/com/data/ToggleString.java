
package com.data;

public class ToggleString 
{
	public String toggleString(String input) 
	{
		StringBuilder builder=new StringBuilder();
		

		for(char c : input.toCharArray()) {

			if(Character.isUpperCase(c)) {
				builder.append(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c)) {
				builder.append(Character.toUpperCase(c));
			}
			else {
				builder.append(c);
			}
			
		}
		return builder.toString();
	}
	public static void main(String[] args) {
		
		String input="hello Java Programming";
		String toggleString = new ToggleString().toggleString(input);
		System.out.println("Old String :"+input);
		System.out.println("New String :"+toggleString);
	}

}
