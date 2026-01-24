package com.januaryMonths.day19.allthree;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}
public class LoopThroughEnum {
    public static void main(String[] args) {
        for (Level var : Level.values()) {
            System.out.println(var);
        }
    }
}
