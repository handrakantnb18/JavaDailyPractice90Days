package com.januaryMonths.day15.lambda;

interface StringFunction {
    String run(String str);
}

public class LambdasParameters {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + " ! ";
        StringFunction ask = (s) -> s + " ? ";
        printFormatted("Good" , exclaim);
        printFormatted("Morning", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
