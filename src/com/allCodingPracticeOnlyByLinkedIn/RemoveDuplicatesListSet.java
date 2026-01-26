package com.allCodingPracticeOnlyByLinkedIn;

import java.util.*;

public class RemoveDuplicatesListSet {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Apple", "Banana", "Orange", "Graps", "Mongo", "Mongo"
        ));

        System.out.println("Original List : "+fruits);

        Set<String> set = new LinkedHashSet<>(fruits);

        List<String> uniqueList = new ArrayList<>(set);

        System.out.println("List after removing duplicates : "+ uniqueList);
    }
}
