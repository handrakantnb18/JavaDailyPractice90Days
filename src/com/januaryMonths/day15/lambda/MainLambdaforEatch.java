package com.januaryMonths.day15.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainLambdaforEatch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);
        arrayList.add(104);
        arrayList.add(105);

        Consumer<Integer> method = (n) ->
        {
            System.out.println(n);
        };
        arrayList.forEach(method);
    }
}
