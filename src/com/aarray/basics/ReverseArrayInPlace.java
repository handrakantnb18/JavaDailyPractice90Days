package com.aarray.basics;

import java.util.Arrays;
import java.util.Collections;
import  java.util.List;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        Integer[] arr = {10, 15, 3, 42, 57};

        System.out.println("Origanal Arrays: "+ Arrays.toString(arr));

        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        System.out.println("Reversed Array: "+ Arrays.toString(arr));
    }
}
