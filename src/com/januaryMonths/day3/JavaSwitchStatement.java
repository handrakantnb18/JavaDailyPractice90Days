package com.januaryMonths.day3;

public class JavaSwitchStatement {
    public static void main(String[] args) {

        // switch statement weekly number

        int day = 4;
        switch (day) {
            case 1 :
                System.out.println("Monday...");
                break;
            case 2:
                System.out.println("Tuesday...");
                break;
            case 3:
                System.out.println("Wendsaday");
                break;
            case 4 :
                System.out.println("Thrusday...");
                break;
            case 5 :
                System.out.println("Friday...");
                break;
            case 6:
                System.out.println("Saturday...");
                break;
            case 7 :
                System.out.println("Sunday...");
                break;
            default:
                System.out.println("Day not found...");
                break;
        }
    }
}
