package com.januaryMonths.day12.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StringSortReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dhok");
        list.add("bhosale");
        list.add("patil");
        list.add("Ashok");
        list.add("Zebra");
        list.add("Shinde");

        Collections.sort(list, Collections.reverseOrder());


        for (String num : list) {
            System.out.println(num.toUpperCase());
        }

        System.out.println(list.reversed());
    }
}
