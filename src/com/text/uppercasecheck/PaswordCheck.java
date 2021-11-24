package com.text.uppercasecheck;

public class PaswordCheck {

	public static void main(String[] args) {
		
		// At least 1 Upper Letter,1 Lower letter and 1 digit		
		System.out.println( checkPassword("Password1"));
		System.out.println( checkPassword("password"));
		System.out.println( checkPassword("password1"));
		System.out.println( checkPassword(""));
		System.out.println( checkPassword("1234"));

	}

	private static boolean checkPassword(String text) {
		return text.chars().anyMatch(Character::isUpperCase) && text.chars().anyMatch(Character::isLowerCase)
				&& text.chars().anyMatch(Character::isDigit);
	}

}
