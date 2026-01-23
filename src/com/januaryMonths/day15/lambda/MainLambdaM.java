package com.januaryMonths.day15.lambda;

import java.util.ArrayList;

public class MainLambdaM {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);

        numbers.forEach((n) -> {
            System.out.println(n);
        });
    }
}
