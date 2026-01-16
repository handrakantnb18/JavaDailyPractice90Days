package com.januaryMonths.day12.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSortReverseOrder {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(7);
        num.add(1);
        num.add(3);
        num.add(2);
        num.add(6);

        Collections.sort(num, Collections.reverseOrder());

        for (int a : num) {
            System.out.println(a);
        }
        System.out.println(num);
    }
}
