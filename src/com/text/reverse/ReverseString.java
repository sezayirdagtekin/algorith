package com.text.reverse;

import java.util.StringJoiner;

public class ReverseString {

	public static void main(String[] args) {
	
		System.out.println(reverse(""));
		System.out.println(reverse(null));
		System.out.println(reverse("sezayir"));
		
		System.out.println(reverseWithStringBuilder(""));
		System.out.println(reverseWithStringBuilder(null));
		System.out.println(reverseWithStringBuilder("java"));

	
		System.out.println(reverseEachWordInSentecence(""));
		System.out.println(reverseEachWordInSentecence(null));
		System.out.println(reverseEachWordInSentecence("Hi there! How are you?"));

	}

	private static String reverse(String text) {
		if (text == null || text.isEmpty()) {
			return text;
		}
		StringBuilder reverse = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {

			reverse.append(text.charAt(i));
		}
		return reverse.toString();
	}

	private static String reverseWithStringBuilder(String text) {
		if (text == null || text.isEmpty()) {
			return text;
		}

		StringBuilder reverse = new StringBuilder(text);
		return reverse.reverse().toString();
	}

	private static String reverseEachWordInSentecence(String sentence) {
		if (sentence == null || sentence.isEmpty()) {
			return sentence;
		}
		
		StringJoiner joiner = new StringJoiner(" ");
		String[] words = sentence.split(" ");
		
		for (String word : words) {
			joiner.add(reverseWithStringBuilder(word));
		}
		return joiner.toString();
	}

}
