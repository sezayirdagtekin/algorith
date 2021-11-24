package com.text.findmaxchar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxChar {

	public static void main(String[] args) {

		String text = "AABKBBCBCDEF";

		Entry<Character, Integer> max = findMaxCharInTheString(text);

		//output = B:4
		System.out.println(max.getKey() + ":" + max.getValue());

	}

	private static Entry<Character, Integer> findMaxCharInTheString(String text) {
		Map<Character, Integer> map = new HashMap<>();

		text.chars().mapToObj(i -> (char) i).forEach(c -> {
			int count = map.getOrDefault(c, 0);
			map.compute(c, (key, val) -> count + 1);
		}

		);
		return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
	}

}
