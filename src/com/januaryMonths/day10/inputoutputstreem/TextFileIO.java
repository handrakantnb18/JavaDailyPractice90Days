package com.januaryMonths.day10.inputoutputstreem;

import java.io.FileOutputStream;
import java.io.IOException;

public class TextFileIO {
    public static void main(String[] args) {
        String text = "Hello world!";

        try (FileOutputStream output = new FileOutputStream("abc.txt")){
            output.write(text.getBytes());
            System.out.println("Successfully wrote to file.");
        }catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}
