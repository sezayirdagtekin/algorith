package com.array.rotate;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = { 11, 20, 13, 5, 8, 9, 21, 65, 98 };
		System.out.println("Original array:");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Rotate left :");
		rotateLeft(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Rotate right :");
		rotateRight(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void rotateLeft(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (i + 1 < arr.length) {
				arr[i] = arr[i + 1];
			}
		}
		arr[arr.length - 1] = temp;
	}

	
	public static void rotateRight(int[] arr) {
		int temp = arr[arr.length-1];
		for (int i = arr.length-1; i >1; i--) {
				arr[i] = arr[i-1];		
		}
		arr[0] = temp;
	}

}
