package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert file name, please:");
        String userInput = scanner.next();
        int numberOfLines = lines("/Users/macbook/Desktop/greenfox/zuzanastasova/week-02/day3/src/com/company/" +userInput + ".txt");
        System.out.println(numberOfLines);
        // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    }

    private static int lines(String userInput) throws IOException {
        List <String> myList = null;
        try {
            Path file = Paths.get(userInput);
            myList = Files.readAllLines(file);
            int numberOfLines = myList.size();
        } catch (IOException e) {
            return 0;
        }
            return myList.size();

    }
}
