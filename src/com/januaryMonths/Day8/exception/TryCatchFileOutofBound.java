package com.januaryMonths.Day8.exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFileOutofBound {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("file.txt");
            out.write("Chandrakant".getBytes());
            out.close();
            System.out.println("Successfully wrote file");
        }catch (IOException exception) {
            System.out.println("Error found");
        }
    }
}
