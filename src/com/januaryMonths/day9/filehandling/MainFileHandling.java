package com.januaryMonths.day9.filehandling;

import java.io.*;
public class MainFileHandling {
    private File file;

    public MainFileHandling(String fileName) {
        this.file = new File(fileName);
    }

    @Override
    public String toString() {
        return "File path: " + file.getAbsolutePath();
    }
    public static void main(String[] args) {
        MainFileHandling fh = new MainFileHandling("index.txt");
        System.out.println(fh);
    }
}
