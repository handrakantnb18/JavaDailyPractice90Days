package com.januaryMonths.day20.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterStream {
    public static void main(String[] args) {

        String s = "ikjjhieuhfiuehe jhdhchiu";

        Map<Character, Long> countMap =
                s.chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Charactors Occurence : ");

        countMap.forEach((k, v) -> System.out.println(k + " : " +v));
    }
}
