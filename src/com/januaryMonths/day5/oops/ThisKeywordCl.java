package com.januaryMonths.day5.oops;

public class ThisKeywordCl {

    int age;
    String fName;

    public ThisKeywordCl(String fName) {
        this(25, fName);
    }
    public ThisKeywordCl(int age, String fName) {
        this.age = age;
        this.fName = fName;
    }

    public void printInfo() {
        System.out.println(age + " " + fName);
    }
    public static void main(String[] args) {
        ThisKeywordCl tk = new ThisKeywordCl("Chandrakant");
        ThisKeywordCl tkc = new ThisKeywordCl("Priyanka");
        tk.printInfo();
        tkc.printInfo();
    }
}
