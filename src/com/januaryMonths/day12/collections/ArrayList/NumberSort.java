package com.januaryMonths.day12.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(8);
        al.add(1);
        al.add(7);
        al.add(2);

        Collections.sort(al);

        for (int num : al) {
            System.out.println(num);
        }
    }
}
