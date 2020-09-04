package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert whole number, please:");
        int userInput = input.nextInt();
        String star = "*";
        String ws = " ";
        for (int i = 0; i < userInput; i++) {
            System.out.println(ws.repeat(userInput-i) + star);
            star = star + "**";
        }

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
    }
}

