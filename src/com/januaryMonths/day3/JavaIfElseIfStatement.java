package com.januaryMonths.day3;

public class JavaIfElseIfStatement {
    public static void main(String[] args) {
        // if else if check the greade and pass or not
        int mark = 80;

        if (mark == 80) {
            System.out.println("A grade and pass..");
        }else if (mark == 70){
            System.out.println("B grade and pass..");
        }else {
            System.out.println("He is not pass..");
        }

        // check value grater than and less than

        int time = 8;

        if (time < 9) {
            System.out.println("Good morning...");
        } else if (time < 18) {
            System.out.println("Good evening...");
        }else {
            System.out.println("Good Night.....");
        }

        // check condition day
        int day = 9;

        if (day < 6) {
            System.out.println("first Week....");
        } else if (day < 10) {
            System.out.println("Second week...");
        }else {
            System.out.println("Multiple weeks..");
        }
    }
}
