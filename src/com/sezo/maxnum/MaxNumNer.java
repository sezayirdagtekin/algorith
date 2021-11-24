package com.sezo.maxnum;

public class MaxNumNer {

	public static void main(String[] args) {

		int max = findMaxNum(18, 71, 51);

		System.out.println(max);

	}

	public static int findMaxNum(int... arr) {
		int max = 0;
		for (int value : arr) {
			if (value > max)
				max = value;
		}
		return max;

	}
}
