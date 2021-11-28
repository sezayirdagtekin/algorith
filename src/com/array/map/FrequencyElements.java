package com.array.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FrequencyElements {

	public static void main(String[] args) {

		List<Integer> missingElements = findMissingElements(new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 5, 6 });
		missingElements.forEach(System.out::println);

	}

	public static List<Integer> findMissingElements(int[] first, int[] second) {

		List<Integer> missingElements = new ArrayList<>();
		HashSet<Integer> hashSet = new HashSet<>();
		for (int x : second) {
			hashSet.add(x);
		}
		for (int x : first) {
			if (!hashSet.contains(x)) {
				missingElements.add(x);
			}
		}
		return missingElements;
	}

}
