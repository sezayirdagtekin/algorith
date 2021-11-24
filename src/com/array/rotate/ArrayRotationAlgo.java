
package com.array.rotate;
import java.util.Arrays;

class ArrayRotationAlgo {

	public static int[] ArrayRotation(int[] arr) {
		final int rotationNum = arr[0];
		int count = 1;
		while (count <= rotationNum) {
			int[] subArray = Arrays.copyOfRange(arr, 1, arr.length);
			int[] result = Arrays.copyOf(subArray, subArray.length + 1);
			result[result.length - 1] = arr[0];
			arr = result;
			count++;
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 1, 6, 10 };

		int[] result = ArrayRotation(arr);

		System.out.println(Arrays.toString(result));

	}

}