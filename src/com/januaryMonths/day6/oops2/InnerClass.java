package com.januaryMonths.day6.oops2;

import java.util.Arrays;
import java.util.LinkedHashSet;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 20;
    }
}
public class InnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.y + outerClass.x);
    }
}
