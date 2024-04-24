package com.array.mostfrequent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MostFrequentItem {
    public static void main(String[] args) {

        //Find most frequent item in array
        //given
         Integer [] arr={1,3,1,3,2,1};
         //output  -> 1=3
         mostFrequent(arr);
         mostFrequentWithLamda(arr);
    }


    private static void mostFrequent(Integer[] arr) {
     int max=0;
     int key=0;
     int value=0;
        Map<Integer, Integer> map= new HashMap<>();

        for (int j : arr) {
            map.compute(j, (k, v) -> v == null ? 1 : v + 1);
            value = map.get(j);
            if (value > max) {
                max = value;
                key = j;
            }

        }
        System.out.println(key+" :"+max);

    }


    private static void mostFrequentWithLamda(Integer[] arr) {

        var result = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue)).orElseThrow(()->new IllegalArgumentException("Not found"));

        System.out.println(result);

    }
}