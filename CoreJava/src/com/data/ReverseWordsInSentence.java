package com.data;

public class ReverseWordsInSentence {

	public static void main(String[] args) {

		String sentence = "The quick brown fox jumps over the lazy dog";

		String[] words = sentence.split("\\s+");

		StringBuilder reversed = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			StringBuilder reversedWord = new StringBuilder(words[i]).reverse();

			reversed.append(reversedWord);
			
			if(i < words.length-1) {
				reversed.append(" ");
			}
		}
		System.out.println(reversed);

	}

}
