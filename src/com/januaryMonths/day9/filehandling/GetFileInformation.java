package com.januaryMonths.day9.filehandling;

import java.io.File;

public class GetFileInformation {
    public static void main(String[] args) {
        File file = new File("xyz.txt");
        if (file.exists()) {
            System.out.println("File name : "+file.getName());
            System.out.println("Absolute path : " +file.getAbsolutePath());
            System.out.println("Writeable : "+file.canWrite());
            System.out.println("Readable : "+file.canRead());
            System.out.println("File size : "+file.length());
        }
        else {
            System.out.println("File does not exists.");
        }
    }
}
