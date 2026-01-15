package com.januaryMonths.day10.inputoutputstreem;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFileIO {
    public static void main(String[] args) {
        String text = "\nAppended text !";

        try (FileOutputStream output = new FileOutputStream("abc.txt", true)){
            output.write(text.getBytes());
            System.out.println("Successfully append to file.");
        }catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}
