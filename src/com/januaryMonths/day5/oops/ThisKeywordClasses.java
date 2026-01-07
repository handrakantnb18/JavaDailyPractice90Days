package com.januaryMonths.day5.oops;

public class ThisKeywordClasses {
    int x;

    public ThisKeywordClasses(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        ThisKeywordClasses tkc = new ThisKeywordClasses(5);
        System.out.println("Values " + tkc.x);
    }
}
