package com.januaryMonths.Day8.exception;

import com.januaryMonths.day1.ArithmaticOperator;

import java.sql.SQLException;

public class ArithmeticExceptionByZero {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        }catch (Exception e) {
            System.out.println("Divided by Zero Exception");
        }
    }
}
