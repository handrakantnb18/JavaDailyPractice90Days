package com.januaryMonths.day10.inputoutputstreem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyaBinaryFilereadWrite {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("image.jpg");
             FileOutputStream output = new FileOutputStream("copy.jpg")){
            int b;
            while ((b = input.read()) != -1) {
                output.write(b);
            }
            System.out.println("File copied successfully.");
        }catch (IOException e) {
            System.out.println("Error handling file");
        }
    }
}
