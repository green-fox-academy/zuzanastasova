package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) throws IOException {
        Scanner pathScanner = new Scanner(System.in);
        System.out.println("Write an absolute path to the file:");
        String path = pathScanner.next();
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Write a string:");
        String string = stringScanner.next();
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int number = numberScanner.nextInt();
        write(path, string, number);
    }
    public static void write (String getPath, String myString, int myNumber) throws IOException {
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < myNumber; i++){
            myList.add(myString);
        }
        try {
            Path myPath = Paths.get(getPath);
            Files.write(myPath, myList, StandardOpenOption.APPEND);
        } catch (IOException e){
        }
    }
}
