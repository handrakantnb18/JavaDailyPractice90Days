package com.januaryMonths.day5.oops;

public class MainConstructor {
    int x;

    public MainConstructor() {
        x = 5;
    }
    public static void main(String[] args) {
        MainConstructor mc = new MainConstructor();
        System.out.println(mc.x);
    }
}
