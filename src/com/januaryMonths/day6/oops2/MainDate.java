package com.januaryMonths.day6.oops2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ld);
        System.out.println(ldt);
    }
}
