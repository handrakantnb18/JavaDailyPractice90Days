package com.januaryMonths.day4;

public class JavaMethodParameter {
    static void display(String fName, String lName, int age){
        System.out.println(fName + "chandrakant "+ lName + " "+ age + "  ");

        if (age < 18 ) {
            System.out.println("Access denied - you are not eligible...");
        }else {
            System.out.println("Access Granted - you are eligible......");
        }
    }
    public static void main(String[] args) {
        display("Chandrakant ", " Bhosale ", 33);
        display("Priyanka ", " Bhosale ", 27);
        display(" Sanay ", " Bhosale ", 2);
        display(" Shivraj ", " Bhosale ", 1);
    }
}
