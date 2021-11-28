package com.array.map;

import java.util.HashMap;

public class MissingElements {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3,2,3,1, 4 ,5,2,9,3,2};
		
		HashMap<Integer, Integer>  map= frequencyElement(arr);
		
		map.entrySet().forEach(System.out::println);;

	}

	public static HashMap<Integer, Integer> frequencyElement(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int x : arr) {
			int count= map.getOrDefault(x, 0);
              map.compute(x, (key,val)-> count+1);
		}
		return map;
	}

}
