package com.januaryMonths.day10.inputoutputstreem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFileIO {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("image.txt");
            FileOutputStream output = new FileOutputStream("copy.jpj")){
                int i;
                while ((i = input.read()) != -1) {
                    output.write(i);
                }
            }catch (IOException e) {
            System.out.println("Error handling file.");
        }

    }
}
