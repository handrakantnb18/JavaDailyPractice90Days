package com.januaryMonths.day19.allthree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        String[] name = {"ABC", "DEF", "GHI", "JKL", "MNO","PQR", "STU","VWXYZ"};
        List<String> list = Arrays.asList(name);

        Collections.shuffle(list);

        System.out.println(list);
    }
}
