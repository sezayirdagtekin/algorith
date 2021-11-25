package com.array.lienarsearch;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 7, 21, 92 };

		System.out.println(search(null, 2));
		System.out.println(search(arr, 2));
		System.out.println(search(arr, 8));

		searchWithStream(arr, 2).ifPresentOrElse(System.out::println, () -> System.out.println(-1));
		searchWithStream(arr, 8).ifPresentOrElse(System.out::println, () -> System.out.println(-1));
	}

	public static Integer search(int[] arr, int value) {
		if (arr == null) {
			return null;
		}
		for (int item : arr) {
			if (item == value) {
				return item;
			}
		}
		return null;
	}

	public static OptionalInt searchWithStream(int[] arr, int value) {
		return Arrays.stream(arr).filter(item -> item == value).findFirst();
	}

}
