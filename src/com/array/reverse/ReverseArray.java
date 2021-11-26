package com.array.reverse;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr1 = { 1,2,3,4,5,6,7,8 };

		int[] arr2 = {11,12,13,14,15 };
		
		Arrays.stream(reverse(arr2)).forEach(System.out::println);
		Arrays.stream(reverseWithSwap(arr1)).forEach(System.out::println);
	}

	public  static int[] reverse(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[arr.length - 1 - i];
		}
		return result;
	}
	
	
	public static int[]reverseWithSwap(int[] arr) {
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp=arr[i];
			arr[i] =arr[arr.length -i- 1];
			arr[arr.length -i- 1]=temp;
			
		}

		return arr;
	}


}
