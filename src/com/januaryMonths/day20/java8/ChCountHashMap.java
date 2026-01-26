package com.januaryMonths.day20.java8;

import java.util.HashMap;
import java.util.Map;

public class ChCountHashMap {
    public static void main(String[] args) {
        String string = "jkfjejhfiuejhfehmcjkjh";
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : string.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

            System.out.println("Charactor Occurence : ");

            for (Map.Entry<Character, Integer> entry:countMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        }
    }
}
