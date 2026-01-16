package com.januaryMonths.day12.collections.set;

import java.util.TreeSet;

public class NumberTreeSetSize {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ABC");
        treeSet.add("DEF");
        treeSet.add("GHI");
        treeSet.add("JKL");

        System.out.println(treeSet.size());
    }
}
