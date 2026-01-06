package com.januaryMonths.day5.oops;

public class MainConstructor {
    int x;

    public MainConstructor(int y) {
        x = 5;
        x = y;
    }
    public static void main(String[] args) {
        MainConstructor mc = new MainConstructor(10);
        System.out.println(mc.x);
    }
}
