package com.januaryMonths.day20.java8;

import java.util.Optional;

public class OptionalUsage {
    public static void main(String[] args) {

        // Java program without the Optional Class

        String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.println(word);

        // Program using Optional Class

        String[] words1 = new String[10];

        Optional<String> checkNull = Optional.ofNullable(words1[5]);

        if (checkNull.isPresent()) {
            String word1 = words1[5].toLowerCase();
            System.out.print(word1);
        }
        else
            System.out.println("Word is full.");
    }

}
