package com.januaryMonths.day20.java8;

import java.util.Optional;

public class OptionalUsage {
    public static void main(String[] args) {

        // Java program without the Optional Class
//
//        String[] words = new String[10];
//        String word = words[5].toLowerCase();
//        System.out.println(word);

        // Program using Optional Class

        String[] w = new String[10];

        Optional<String> checkNull = Optional.ofNullable(w[5]);

        if (checkNull.isPresent()) {
            String wd = w[5].toLowerCase();
            System.out.print(wd);
        }
        else
            System.out.println("word is null");

        //  Using empty() and of()

        String[] str = new String[5];
        str[2] = "Priyanka Chandraknt Bhosale Sangli Pune I Love You";

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
    }

}
