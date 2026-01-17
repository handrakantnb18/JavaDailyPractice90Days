package com.januaryMonths.day12.collections.algoritham;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithamReverseOrder {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(5);
        num1.add(1);
        num1.add(4);
        num1.add(3);
        num1.add(2);
        num1.add(7);
        num1.add(6);

        Collections.sort(num1);
        System.out.println("Original numbers" + num1);
        Collections.sort(num1, Collections.reverseOrder());
        System.out.println("Reverse numbers : "+num1);
    }
}
