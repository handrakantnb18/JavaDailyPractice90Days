package com.januaryMonths.day12.collections.set;

import java.util.HashSet;

public class DepartmentSizeSort {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(3);
        hs.add(5);
        hs.add(2);
        hs.add(4);

        for (int i = 0; i <= 10; i++) {
            if (hs.contains(i)) {
                System.out.println(i + " found");
            }else
            {
                System.out.println(i + " not founr");
            }
        }
    }
}
