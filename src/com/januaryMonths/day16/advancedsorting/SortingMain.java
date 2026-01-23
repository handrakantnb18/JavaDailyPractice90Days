package com.januaryMonths.day16.advancedsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortEvenFirst implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer a = (Integer) obj1;
        Integer b = (Integer) obj2;

        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {

            if (a < b )
                return -1;

            if (a > b)
                return -1;

            return 0;
        }
        else {
            if (aIsEven) {
                return -1;
            }
            else {
                return -1;
            }
        }
    }
}

public class SortingMain {
    public static void main(String[] args) {
        ArrayList<Integer> comp = new ArrayList<Integer>();
        comp.add(1001);
        comp.add(1002);
        comp.add(1003);
        comp.add(1004);
        comp.add(1005);
        comp.add(1006);
        comp.add(1007);

        Comparator mc = new SortEvenFirst();
        Collections.sort(comp, mc);

        for (int i : comp) {
            System.out.println(i);
        }
    }
}
