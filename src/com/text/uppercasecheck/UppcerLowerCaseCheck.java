package com.text.uppercasecheck;

public class UppcerLowerCaseCheck {

	public static void main(String[] args) {

		String text = "SeZaYir";
		boolean result = isUpperCase(text);
		System.out.println(result);

		text = "JAVA";
		result = isUpperCase(text);
		System.out.println(result);

		text = "angular";
		result = isLowerCase(text);
		System.out.println(result);

		text = "spring";
		result = isLowerCaseWithNone(text);
		System.out.println(result);

		text = "SpRinG";
		result = isUpperCaseLongVersion(text);
		System.out.println(result);
	}

	private static boolean isUpperCase(String text) {
		return text.chars().allMatch(Character::isUpperCase);
	}

	private static boolean isUpperCaseLongVersion(String text) {
		return text.chars().mapToObj(c -> (char) c).allMatch(ch -> Character.isUpperCase(ch));
	}

	private static boolean isLowerCase(String text) {
		return text.chars().allMatch(Character::isLowerCase);
	}

	private static boolean isLowerCaseWithNone(String text) {
		return text.chars().noneMatch(Character::isUpperCase);
	}

}
