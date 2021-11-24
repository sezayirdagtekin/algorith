package com.array.findmax;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxInt {

	public static int SimpleMode(int[] arr) {

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		Arrays.stream(arr).forEach(c -> {
			int count = map.getOrDefault(c, 0);
			map.compute(c, (key, val) -> count + 1);
		});

		Entry<Integer, Integer> entry = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();

		return entry.getValue() > 1 ? entry.getKey() : -1;
	}

	public static void main(String[] args) {
		int[] array = { 1,2,2,3,4,5,5};
		int max = SimpleMode(array);

		System.out.println(max);

	}

}