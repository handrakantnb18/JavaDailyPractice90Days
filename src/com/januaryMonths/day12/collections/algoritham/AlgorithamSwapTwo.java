package com.januaryMonths.day12.collections.algoritham;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithamSwapTwo {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(5);
        n.add(7);
        n.add(8);
        n.add(2);
        n.add(4);
        n.add(3);
        n.add(6);

        Collections.swap(n, 2, 5);
        System.out.println(n);
    }
}
