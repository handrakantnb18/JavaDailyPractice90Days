package com.januaryMonths.day20.java8;

public class CounterArray {
    public static void main(String[] args) {
        String s = "ofjoejfoej";
        int[] c = new int[256];

        for (char ch : s.toCharArray()) {
            c[ch]++;
        }
        System.out.println("Charactor count : ");

        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0){
                System.out.println((char) i + " : " +c[i]);
            }
        }
    }
}
