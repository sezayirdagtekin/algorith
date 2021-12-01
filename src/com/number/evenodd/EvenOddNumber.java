package com.number.evenodd;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		System.out.println(isEven(4));
		System.out.println(isEven(5));
		
		System.out.println(isOdd(4));
		System.out.println(isOdd(5));

	}

	static boolean  isEven(int number) {
		return number % 2 == 0;
	}
	static boolean  isOdd(int number) {
		return number % 2 != 0;
	}

}
