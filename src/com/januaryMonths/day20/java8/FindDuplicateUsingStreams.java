package com.januaryMonths.day20.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateUsingStreams {

    //Java program to find the duplicate

    public static <T> Set<T>
    findDuplicateStream(Stream<T> stream)
    {
        Set<T> items = new HashSet<>();

        return stream.filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }

    // Java program to find the duplicate
    // elements in a Stream using Collectors.groupingBy()

    public static void main(String[] args) {
        //Java program to find the duplicate

        Stream<Integer> stream = Stream.of(
                    5, 13, 4, 21, 13, 27, 2, 59, 2, 59
            );

        System.out.println(findDuplicateStream(stream));
    }
}
