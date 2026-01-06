package com.januaryMonths.day4.methods;

public class JavaMethodParameterValue {
    static int num(int a, int b) {
        return  a + b;
    }
    static int doubleG (int x) {
        return x * 2;
    }
    public static void main(String[] args) {

        int c = num(4, 6);
        System.out.println(num(8, 7));
        System.out.println(c);
        for (int i = 0; i <= 10; i++){
            System.out.println("Double of "+ i + "is" + doubleG(i));
        }
    }
}
