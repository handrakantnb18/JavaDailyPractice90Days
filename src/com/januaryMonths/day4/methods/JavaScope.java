package com.januaryMonths.day4.methods;

public class JavaScope {
    public static void main(String[] args) {
        int x = 50;

        for (x = 0; x < 5; x++) {
            System.out.println("Loop : "+x);
        }
        JavaScope js = new JavaScope();
        System.out.println(js);
    }
}
