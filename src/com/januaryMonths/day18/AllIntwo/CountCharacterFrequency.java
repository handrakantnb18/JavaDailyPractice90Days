package com.januaryMonths.day18.AllIntwo;

import java.util.HashMap;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String t = "Chandrakant";
        HashMap<Character, Integer> fr = new HashMap<>();

        for (char c : t.toCharArray()) {
            fr.put(c, fr.getOrDefault(c, 0) + 1);
        }

        System.out.println(fr);
    }
}
