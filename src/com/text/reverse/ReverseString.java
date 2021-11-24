package com.text.reverse;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverse("sezayir"));
		System.out.println(reverse(""));
		System.out.println(reverse(null));

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

}
