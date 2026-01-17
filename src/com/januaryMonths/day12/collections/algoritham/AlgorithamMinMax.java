package com.januaryMonths.day12.collections.algoritham;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithamMinMax {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(55);
        n.add(45);
        n.add(85);
        n.add(95);
        n.add(25);
        n.add(5);
        n.add(15);

        System.out.println("Max numbers : " +Collections.max(n));
        System.out.println("Min numbers : " + Collections.min(n));
        Collections.sort(n);
        System.out.println(n);
        System.out.println("Reverse Numbers : " + Collections.reverseOrder());
    }
}
