package com.text.pasword;

public class PasswordRegex {

	public static void main(String[] args) {
		
		System.out.println(isPasswordComplex("1"));
		System.out.println(isPasswordComplex("A"));
		System.out.println(isPasswordComplex("Abc1"));
		System.out.println(isPasswordComplex("A1234b"));
		System.out.println(isPasswordComplex("A1234bxYZ"));

	}

	public static boolean isPasswordComplex(String password) {
		return password.length() >= 6
				&& password.matches(".*\\d.*") 
				&& password.matches(".*[a-z].*")
				&& password.matches(".*[A-Z].*");
	}

}
