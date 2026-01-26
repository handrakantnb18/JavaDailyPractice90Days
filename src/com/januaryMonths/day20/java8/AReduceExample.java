package com.januaryMonths.day20.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AReduceExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "ABC", "Chandrakant", "Bhosale", "Priyanka", "Ram"
        );

        Optional<String> longString = list.stream()
                .reduce((word1, word2) -> word1.length()
                > word2.length() ? word1 : word2);

        longString.ifPresent(System.out::println);
    }
}
