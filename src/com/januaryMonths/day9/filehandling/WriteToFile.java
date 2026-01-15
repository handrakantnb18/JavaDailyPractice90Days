package com.januaryMonths.day9.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("xyz.txt")){
            fileWriter.write("Files in java might be tricky, but it is fun enough...");
            System.out.println("Successfully wrote to the file...");
        }catch (IOException e) {
            System.out.println("An error is occurred...");
            e.printStackTrace();
        }
    }
}
