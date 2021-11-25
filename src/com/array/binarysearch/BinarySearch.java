package com.array.binarysearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
         //sorted
		int[] arr = { 1,2,3,5,8,9,21,65,98 };

		System.out.println(search(arr, 2));
		System.out.println(search(arr, 8));
		System.out.println(search(arr, 2));
		System.out.println(search(arr, 12));
		
		System.out.println(Arrays.binarySearch(arr, 1));
		System.out.println(Arrays.binarySearch(arr, 2));

	}

	public static boolean search(int[] arr, int item) {
		int min = 0;
		int max = arr.length - 1;

		while (min <= max) {
			int mid = (min + max) / 2;

			if (item == arr[mid]) {
				return true;
			} else if (item < arr[mid]) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}

		}
		return false;

	}

}
