package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random generator = new Random ();
        int randomNumber = generator.nextInt(100 );
        Scanner userInput = new Scanner(System.in);
        System.out.println("I am thinking of a whole number between 0 and 100, what do you think it is?");
        int number = userInput.nextInt();

        while (number != randomNumber) {
            if (randomNumber>number) {
                System.out.println("Higher!");
            }
            else {
                System.out.println("Lower!");
            }
            number = userInput.nextInt();
        }
        System.out.println("You fount the number! It is " + randomNumber + ".");


// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
    }
}
