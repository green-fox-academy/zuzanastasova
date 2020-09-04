package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert whole number, please:");
        int userInput = scanner.nextInt();

        String star = "*";
        for (int i = 1; i <= userInput;) {
            System.out.println(star.repeat(i++));
        }
//Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

    }
}
