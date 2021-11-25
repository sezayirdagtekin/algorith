package com.array.aggregate;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class AggregateFilter {

	public static void main(String[] args) {

		int[] arr1 = { 11, 20, 13, 5, 8, 9, 21, 65, 98 };

		int[] arr2 = { 3, 2, 1, 6, 7, 14, 81, 56 };

		int[] evenArray = findEvenNumbers(arr1, arr2);
		System.out.println(Arrays.toString(evenArray));
	}

	public static int[] findEvenNumbers(int[] arr1, int[] arr2) {

		IntPredicate isEven = (n) -> (n % 2) == 0;
		
		return Stream.of(arr1, arr2)
				.flatMapToInt(Arrays::stream)
				.filter(isEven)
				.toArray();

	}
}
