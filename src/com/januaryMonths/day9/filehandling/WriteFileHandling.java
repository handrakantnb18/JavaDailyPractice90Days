package com.januaryMonths.day9.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileHandling {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("abc.txt");
            fileWriter.write("Files in java might be tricky, but it is fun enough...");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
