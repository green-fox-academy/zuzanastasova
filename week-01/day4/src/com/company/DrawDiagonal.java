package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert whole number, please:");
        int number = scanner.nextInt();
        System.out.print("%".repeat(number) + "\n");
        for (int rows = 0; rows < number-2; rows++) {
            System.out.println("%" + " ".repeat(rows) + "%" + " ".repeat(number-rows-3) + "%" );
            }
        System.out.print("%".repeat(number));
        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
    }
}
